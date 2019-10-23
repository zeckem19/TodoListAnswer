package Command;

import core.ToDoList;

public class UpdateCmd implements Command {
	String desc;
	
	@Override
	public void setArgs(String... args) {
		desc = args[0];
	}

	@Override
	public void execute(ToDoList tdl) {
		// TODO Auto-generated method stub
		tdl.completeTask(desc);
	}
}