package by.htp.jd01.unit6.dao.impl;

import by.htp.jd01.unit6.dao.NoteDAO;
import by.htp.jd01.unit6.dao.exception.DAOException;
import by.htp.jd01.unit6.entity.Note;
import by.htp.jd01.unit6.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class FileNoteDAO implements NoteDAO {
    private static final Logger log = LogManager.getLogger(FileNoteDAO.class.getName());

    @Override
    public void add(Note note) throws DAOException {
        FileWriter noteWriter = null;
        try {
            String userNoteFile = note.getIdUser() + DataSourseProperty.USER_NOTE_BASE_SOURCE_NAME;
            noteWriter = new FileWriter("src/by/htp/jd01/unit6/usersFilesNotes/" + userNoteFile, true);
            noteWriter.write(note.getIdNote() + " - " + note.getDate().get(Calendar.DATE) + "/" + (note.getDate().get(Calendar.MONTH) + 1) + "/" + note.getDate().get(Calendar.YEAR) + " - " + note.getText() + "\n");
        } catch (IOException e) {
            throw new DAOException("Can't create note", e);
        } finally {
            if (noteWriter != null) {
                try {
                    noteWriter.close();
                } catch (IOException e) {
                    for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                        log.error(stackTraceElement);
                    }
                }
            }
        }
    }

    @Override
    public List<Note> findWithContent(User user, String text) throws DAOException {
        List<Note> resultsSearchNotes = new ArrayList<>();

        FileInputStream noteReader = null;
        try {
            List<String> lines = Files.readAllLines(Paths.get("src/by/htp/jd01/unit6/usersFilesNotes/" + user.getIdUser() + DataSourseProperty.USER_NOTE_BASE_SOURCE_NAME));
            for (String s : lines) {
                if (s.toLowerCase().contains(text.toLowerCase())) {
                    String[] words = s.split("\\s+-\\s+");
                    String[] date = words[1].trim().split("/");
                    resultsSearchNotes.add(new Note(user.getIdUser(), new GregorianCalendar(Integer.valueOf(date[2]), Integer.valueOf(date[1]), Integer.valueOf(date[0])), words[2]));
                }
            }
        } catch (FileNotFoundException e) {
            throw new DAOException("Can't find file", e);
        } catch (IOException e) {
            throw new DAOException("Can't read file", e);
        } finally {
            if (noteReader != null) {
                try {
                    noteReader.close();
                } catch (IOException e) {
                    for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                        log.error(stackTraceElement);
                    }
                }
            }
        }

        return resultsSearchNotes;
    }

    @Override
    public void remove(int id) throws DAOException {
        // TODO Auto-generated method stub

    }


}
