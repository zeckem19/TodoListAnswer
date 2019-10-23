import java.util.Scanner;
import Command.Command;
import Command.ExitCmd;

public class Main {
	public static void main(String[] args) {
		Command userCmd = null;
		Scanner sc = new Scanner(System.in);
		
		while(!(userCmd instanceof ExitCmd)) {
			String input = sc.nextLine();
			userCmd = getCommand(input);
			userCmd.execute(null);
		}
	}
	
	
	private static Command getCommand(String input) {
		String firstWord = input.split(" ")[0];
		
		switch(firstWord) {
			case "exit":
				return (Command) new ExitCmd();
			default:
				return null;
		}
	}
}
