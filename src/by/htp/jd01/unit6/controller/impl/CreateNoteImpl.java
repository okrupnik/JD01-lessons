package by.htp.jd01.unit6.controller.impl;

import by.htp.jd01.unit6.controller.Command;
import by.htp.jd01.unit6.dao.impl.FileUserDAO;
import by.htp.jd01.unit6.entity.Note;
import by.htp.jd01.unit6.service.NoteService;
import by.htp.jd01.unit6.service.ServiceFactory;
import by.htp.jd01.unit6.service.exception.ServiceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CreateNoteImpl implements Command {
    private static final Logger log = LogManager.getLogger(CreateNoteImpl.class.getName());

    @Override
    public String execute(String[] params) {
        String newContent = "";
        int idUser = 0;
        int year = 0;
        int month = 0;
        int day = 0;
        String response;

        String[] elements;
        for (int i = 1; i < params.length; i++) {
            elements = params[i].split("\\s*=\\s*");
            switch (elements[0]) {
                case "idUser":
                    idUser = Integer.parseInt(elements[1]);
                    break;
                case "newContent":
                    newContent = elements[1];
                    break;
                case "day":
                    try {
                        day = Integer.parseInt(elements[1]);
                        break;
                    } catch (NumberFormatException e) {
                        response = "Don't right data for date. Check out it.";
                    }
                case "month":
                    try {
                        month = Integer.parseInt(elements[1]);
                        break;
                    } catch (NumberFormatException e) {
                        response = "Don't right data for date. Check out it.";
                    }
                case "year":
                    try {
                        year = Integer.parseInt(elements[1]);
                        break;
                    } catch (NumberFormatException e) {
                        response = "Don't right data for date. Check out it.";
                    }
            }
        }

        Calendar data = new GregorianCalendar(year, month, day);

        ServiceFactory factory = ServiceFactory.getInstance();
        NoteService noteService = factory.getNoteService();

        Note newNote = new Note(idUser, data, newContent);

        try {
            noteService.add(newNote);
            response = "The note is successfully added";
        } catch (ServiceException e) {
            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                log.error(stackTraceElement);
            }
            response = "Error: the note isn't added";
        }

        return response;
    }

}
