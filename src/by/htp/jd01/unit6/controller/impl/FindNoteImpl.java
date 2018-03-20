package by.htp.jd01.unit6.controller.impl;

import by.htp.jd01.unit6.controller.Command;
import by.htp.jd01.unit6.entity.Note;
import by.htp.jd01.unit6.entity.User;
import by.htp.jd01.unit6.service.NoteService;
import by.htp.jd01.unit6.service.ServiceFactory;
import by.htp.jd01.unit6.service.exception.ServiceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

/**
 * Created by Fisher on 06.03.2018.
 */
public class FindNoteImpl implements Command {
    private static final Logger log = LogManager.getLogger(CreateNoteImpl.class.getName());

    @Override
    public String execute(String[] params) {
        String text = "";
        int idUser = 0;
        String nickName = "";
        String password = "";
        String response;

        String[] elements;
        for (int i = 1; i < params.length; i++) {
            elements = params[i].split("\\s*=\\s*");
            switch (elements[0]) {
                case "idUser":
                    try {
                        idUser = Integer.parseInt(elements[1]);
                        break;
                    } catch (NumberFormatException e) {
                        response = "Don't right idUser. Check out it.";
                    }
                case "text":
                    text = elements[1];
                    break;
                case "login":
                    nickName = elements[1].trim();
                    break;
                case "password":
                    password = elements[1].trim();
                    break;
            }
        }

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        NoteService noteService = serviceFactory.getNoteService();

        try {
            List<Note> list = noteService.findWithContent(new User(idUser, nickName, password), text);
            if (!list.isEmpty()) {
                response = "Text is found";
            } else {
                response = "Text isn't found";
            }
        } catch (ServiceException e) {
            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                log.error(stackTraceElement);
            }
            response = "Error: search text is impossible";
        }

        return response;
    }
}
