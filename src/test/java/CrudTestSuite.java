import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                AddTest.class,
                EditTest.class,
                DeleteTest.class
        })
public class CrudTestSuite {
}
