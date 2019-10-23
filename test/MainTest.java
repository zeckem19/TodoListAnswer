import static org.junit.Assert.*;

import org.junit.Test;

import Command.AddCmd;
import Command.Command;
import Command.ExitCmd;
import Command.ViewCmd;

public class MainTest {

	@Test
	public void testGetCommand() {
		Command userCmd = Main.getCommand("unknown");
		assertNull(userCmd);
		
		userCmd = Main.getCommand("exit");
		assertTrue(userCmd instanceof ExitCmd);
		
		userCmd = Main.getCommand("add");
		assertTrue(userCmd instanceof AddCmd);
		
		userCmd = Main.getCommand("view");
		assertTrue(userCmd instanceof ViewCmd);
	}

}
