package Command;

import core.ToDoList;

public class DeleteCmd implements Command {
	String description;
	
	@Override
	public void setArgs(String... args) {
		description = args[0];
	}

	@Override
	public void execute(ToDoList tdl) {
		// TODO Auto-generated method stub
		tdl.removeTask(description);
		
	}
}