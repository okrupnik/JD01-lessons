package by.htp.jd01.unit6.dao;

import by.htp.jd01.unit6.dao.exception.DAOException;
import by.htp.jd01.unit6.dao.impl.EncryptPassword;
import by.htp.jd01.unit6.dao.impl.FileNoteDAO;
import by.htp.jd01.unit6.dao.impl.FileUserDAO;
import by.htp.jd01.unit6.entity.Note;
import by.htp.jd01.unit6.entity.User;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by Fisher on 02.03.2018.
 */
public class FileNoteDAOTest {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Note note1 = new Note(1, new GregorianCalendar(),"Hello-1");
        Note note2 = new Note(2, new GregorianCalendar(),"Hello-2");

        User user1 = new User(1,"fsher", "345qwer4");
        User user2 = new User(2,"bin", "/*-dff");
        UserDAO userDAO = new FileUserDAO();
//        try {
//            System.out.println(userDAO.logination(user1));
//            System.out.println(userDAO.logination(user2));
//        } catch (DAOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(EncryptPassword.byteArrayToHexString(EncryptPassword.computeHash("345qwer4")));
//        System.out.println(EncryptPassword.byteArrayToHexString(EncryptPassword.computeHash("/*-dff")));

        NoteDAO noteDAO = new FileNoteDAO();

        try {
            noteDAO.add(note1);
            noteDAO.add(note2);
        } catch (DAOException e) {
            e.printStackTrace();
        }

        try {
            List<Note> list = new ArrayList<>();
            list = noteDAO.findWithContent(user1, "array");
            for (Note note: list ) {
                System.out.println(note.toString());
            }

        } catch (DAOException e) {
            e.printStackTrace();
        }
    }
}
