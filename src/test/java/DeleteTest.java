import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DeleteTest extends AbstractTest {
    @Before
    public void setUp() {
        // Prepare page and go to main page
        mainPage = new MainPage(driver);

        // Get uuid to delete by mail and name
        String uuid = mainPage.getUuid(mail, name);

        // Delete resume from main page by using "delete" button
        mainPage.deleteResume(uuid);
    }

    @Test
    public void deleteEnteredResume() {
        // We should get null result, because we have deleted resume
        Assert.assertEquals(null, mainPage.getUuid(mail, name));
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
