package by.htp.jd01.unit6.controller;

import java.util.HashMap;
import java.util.Map;

import by.htp.jd01.unit6.controller.impl.CreateNoteImpl;
import by.htp.jd01.unit6.controller.impl.EditNoteImpl;
import by.htp.jd01.unit6.controller.impl.FindNoteImpl;
import by.htp.jd01.unit6.controller.impl.LoginUserImpl;

public class CommandProvider {
	
	private Map<CommandName, Command> commands = new HashMap<CommandName, Command>();
	
	public CommandProvider(){
		commands.put(CommandName.CREATE_NOTE, new CreateNoteImpl());
		commands.put(CommandName.EDIT_NOTE, new EditNoteImpl());
		commands.put(CommandName.FIND_NOTE, new FindNoteImpl());
		commands.put(CommandName.LOGIN_USER, new LoginUserImpl());
	}
	
	public Command getCommand(String commandName){
		CommandName commandNameEnum = CommandName.valueOf(commandName.toUpperCase());
		Command command = commands.get(commandNameEnum);
		return command;
	}

}
