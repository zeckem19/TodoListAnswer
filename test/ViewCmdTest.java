import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Command.ViewCmd;
import core.Task;
import core.ToDoList;

public class ViewCmdTest {
	private ToDoList todoList;
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	
	@Before
	 public void setUp() throws Exception{
		todoList = new ToDoList();
		System.setOut(new PrintStream(outContent));
	}
	
	@After
	public void restoreStreams() {
	    System.setOut(originalOut);
	}
	
	@Test
	public void testViewExecute() {
		todoList.addTask(new Task ("desc 1"));
		ViewCmd vc = new ViewCmd();
		vc.execute(todoList);
		
		assertEquals("1\tdesc 1", outContent.toString().trim());
	}

}
