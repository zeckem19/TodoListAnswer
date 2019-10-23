import static org.junit.Assert.*;

import org.junit.Test;

import Command.Command;
import Command.DeleteCmd;


public class DeleteTest {

	@Test
	public void testGetCommand() {
		Command userCmd = Main.getCommand("unknown");
		assertNull(userCmd);

		userCmd = Main.getCommand("delete");
		assertTrue(userCmd instanceof DeleteCmd);
	}

}
