import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	DeleteTest.class,
	ViewCmdTest.class,
	MainTest.class,
	ToDoListTest.class
})
public class AllTests  {

}
