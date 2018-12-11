import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CancleEditTest extends AbstractTest {
    @Before
    public void setUp() {
        // Prepare main page object ang go to main page
        mainPage = new MainPage(driver);

        // Get uuid to edit by mail and name
        String uuid = mainPage.getUuid(mail, name);

        // Prepare edit page and go to edit page by uuid
        editPage = new EditPage(driver, uuid);

        // Prepare value to entry
        changedHomepage = "https://en.wikipedia.org/wiki/Quality_assurance";

        // Edit values
        editPage.setHomepage(changedHomepage);

        // Cancel changes
        editPage.clickCancelButton();

        // Go to view page for check actual result
        viewPage = new ViewPage(driver, uuid);
    }

    @Test
    public void editEnteredResume() {
        // We shouldn't get changed field, because we used cancel button
        String faultMessage = "If actual result is another - cancel button isn't work";
        Assert.assertEquals(faultMessage, homepage, viewPage.getHomepage());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
