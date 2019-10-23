package Command;

import core.ToDoList;
import core.Task;

public class AddCmd implements Command {
	public String desc;
	@Override
	public void setArgs(String... args) {
		// Do Nothing
		desc = args[0];
	}

	@Override
	public void execute(ToDoList myTDL) {
		Task task = new Task(desc);
		myTDL.addTask(task);
	}
	

}