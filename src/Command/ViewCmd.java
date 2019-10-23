package Command;

import java.util.Collection;

import core.Task;
import core.ToDoList;

public class ViewCmd implements Command {

	@Override
	public void setArgs(String... args) {
		// Do Nothing
	}
	
	@Override
	public void execute(ToDoList tdl) {
		Collection<Task> tasks = tdl.getAllTasks();
		int i = 1;
		for (Task task : tasks) {
			System.out.println(i++ + "\t" + task.getDescription());
		}
	}
}