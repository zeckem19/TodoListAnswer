package Command;
import core.ToDoList;
public interface Command {	
	public void setArgs(String ...args);
	public void execute(ToDoList tdl);
}
