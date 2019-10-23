import java.util.Scanner;

import Command.AddCmd;
import Command.Command;
import Command.ExitCmd;
import Command.ViewCmd;
import core.Task;
import core.ToDoList;

public class Main {
	public static void main(String[] args) {
		Command userCmd = null;
		Scanner sc = new Scanner(System.in);
		ToDoList myTdl = new ToDoList();
		myTdl.addTask(new Task("test1"));
		myTdl.addTask(new Task("test2"));
		
		while(!(userCmd instanceof ExitCmd)) {
			String input = sc.nextLine();
			userCmd = getCommand(input);
			if (userCmd == null) {
				continue;
			}
			userCmd.execute(myTdl);
		}
	}
	
	
	public static Command getCommand(String input) {
		String[] strArgs = input.split(" ", 2);
		//System.out.println(strArgs[0]);
		
		Command userCmd = null;
		switch(strArgs[0]) {
			case "add":
				userCmd = (Command) new AddCmd();
				break;
			case "view":
				userCmd = (Command) new ViewCmd();
				break;
			case "exit":
				userCmd = (Command) new ExitCmd();
				break;
			default:
				return userCmd;
		}
		
		if (strArgs.length >= 2) {
			userCmd.setArgs(strArgs[1]);
			System.out.println(strArgs[1]);
		}
		return userCmd;
	}
}
