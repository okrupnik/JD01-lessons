package by.htp.jd01.unit6.service;

import by.htp.jd01.unit6.entity.User;
import by.htp.jd01.unit6.service.exception.ServiceException;

public interface UserService {
	
	boolean logination(User user) throws ServiceException;
	
	

}
