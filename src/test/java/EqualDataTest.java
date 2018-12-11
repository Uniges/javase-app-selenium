import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EqualDataTest extends AbstractTest {
    @Before
    public void setUp() {
        // Prepare page and go to main page
        mainPage = new MainPage(driver);
    }

    @Test
    public void checkCountOfResume() {
        // We should get one resume with equal mail and name
        String faultMessage = "If actual result is 0 - resume isn't found\n" +
                "If actual result is bigger then 1 - it's fault! Because we have 2 or more equals resumes";
        Assert.assertEquals(faultMessage, 1, mainPage.getResumeCount(mail, name));
    }

    @After
    public void tearDown() {
        mainPage.deleteResume(mainPage.getUuid(mail, name));
        mainPage.deleteResume(mainPage.getUuid(mail, name));
        driver.quit();
    }
}
