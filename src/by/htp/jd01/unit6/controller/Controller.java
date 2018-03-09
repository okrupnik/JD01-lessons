package by.htp.jd01.unit6.controller;

import by.htp.jd01.unit6.entity.Note;
import by.htp.jd01.unit6.service.NoteService;
import by.htp.jd01.unit6.service.ServiceFactory;

public class Controller {
	
	private final CommandProvider commandProvider = new CommandProvider();

	public String doAction(String request){
		
		String[] params = request.split("\\s*;\\s*");
		
		String commandName = params[0].trim();
		
		Command command = commandProvider.getCommand(commandName);
		String response = command.execute(params);
		
		return response;		
	}
}

