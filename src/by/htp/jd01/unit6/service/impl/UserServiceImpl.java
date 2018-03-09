package by.htp.jd01.unit6.service.impl;

import by.htp.jd01.unit6.dao.DAOFactory;
import by.htp.jd01.unit6.dao.UserDAO;
import by.htp.jd01.unit6.dao.exception.DAOException;
import by.htp.jd01.unit6.entity.User;
import by.htp.jd01.unit6.service.UserService;
import by.htp.jd01.unit6.service.exception.ServiceException;

public class UserServiceImpl implements UserService{

	@Override
	public boolean logination(User user) throws ServiceException {
		DAOFactory daoFactory = DAOFactory.getInstance();
		UserDAO userDAO = daoFactory.getUserDAO();
		try {
			return userDAO.logination(user);
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
	}

}
