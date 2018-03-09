package by.htp.jd01.unit6.service;

import by.htp.jd01.unit6.entity.Note;
import by.htp.jd01.unit6.entity.User;
import by.htp.jd01.unit6.service.exception.ServiceException;

import java.util.List;

public interface NoteService {

	void add(Note note) throws ServiceException;
	List<Note> findWithContent(User user, String text) throws ServiceException;
}
