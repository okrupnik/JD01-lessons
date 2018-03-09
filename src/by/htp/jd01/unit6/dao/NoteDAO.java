package by.htp.jd01.unit6.dao;

import java.util.List;

import by.htp.jd01.unit6.dao.exception.DAOException;
import by.htp.jd01.unit6.entity.Note;
import by.htp.jd01.unit6.entity.User;

public interface NoteDAO {
	
	void add(Note note) throws DAOException;
	List<Note> findWithContent(User user, String text) throws DAOException;
	void remove(int id) throws DAOException;

}
