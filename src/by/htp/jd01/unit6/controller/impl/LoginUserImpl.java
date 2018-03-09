package by.htp.jd01.unit6.controller.impl;

import by.htp.jd01.unit6.controller.Command;
import by.htp.jd01.unit6.dao.impl.FileUserDAO;
import by.htp.jd01.unit6.entity.User;
import by.htp.jd01.unit6.service.ServiceFactory;
import by.htp.jd01.unit6.service.UserService;
import by.htp.jd01.unit6.service.exception.ServiceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginUserImpl implements Command {
	private static final Logger log = LogManager.getLogger(LoginUserImpl.class.getName());

	@Override
	public String execute(String[] params) {
		String nickName = "";
		String password = "";

		String[] elements;
		for (int i = 1; i < params.length; i++) {
			elements = params[i].trim().split("\\s*=\\s*");
			switch (elements[0]) {
				case "login":
					nickName = elements[1].trim();
					break;
				case "password":
					password = elements[1].trim();
					break;
			}

		}

		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		UserService userService = serviceFactory.getUserService();

		User user = new User(nickName, password);
		String response;

		try {
			boolean existing = userService.logination(user);
			if (existing) {
				response = "You are successful authorization";
			} else {
				response = "Check your login or password";
			}
		} catch (ServiceException e) {
			for (StackTraceElement stackTraceElement : e.getStackTrace()) {
				log.error(stackTraceElement);
			}
			response = "Error authorization";
		}
		return response;
	}

}
