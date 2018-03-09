package by.htp.jd01.unit6.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import by.htp.jd01.unit6.dao.DAOFactory;
import by.htp.jd01.unit6.dao.NoteDAO;
import by.htp.jd01.unit6.dao.exception.DAOException;
import by.htp.jd01.unit6.dao.impl.FileNoteDAO;
import by.htp.jd01.unit6.entity.Note;
import by.htp.jd01.unit6.entity.User;
import by.htp.jd01.unit6.service.NoteService;
import by.htp.jd01.unit6.service.exception.ServiceException;

public class NoteServiceImpl implements NoteService{

	@Override
	public void add(Note note) throws ServiceException {
		// data validation
		
		DAOFactory daoFactory = DAOFactory.getInstance();
		NoteDAO noteDAO = daoFactory.getNoteDAO();
		try {
			noteDAO.add(note);
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
	}

	@Override
	public List<Note> findWithContent(User user, String text) throws ServiceException {
		List<Note> resultsSearchNotes = new ArrayList<>();
		DAOFactory daoFactory = DAOFactory.getInstance();
		NoteDAO noteDAO = daoFactory.getNoteDAO();
		try {
			resultsSearchNotes = noteDAO.findWithContent(user, text);
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		return resultsSearchNotes;
	}

}
