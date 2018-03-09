package by.htp.jd01.unit6.dao;

import by.htp.jd01.unit6.dao.exception.DAOException;
import by.htp.jd01.unit6.entity.User;
import by.htp.jd01.unit6.entity.UserInfo;

public interface UserDAO {
	
	boolean logination(User user) throws DAOException;
	void edit(UserInfo user) throws DAOException;

}
