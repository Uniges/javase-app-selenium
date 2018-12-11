import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EditTest extends AbstractTest {
    @Before
    public void setUp() {
        // Prepare main page object ang go to main page
        mainPage = new MainPage(driver);

        // Get uuid to edit by mail and name
        String uuid = mainPage.getUuid(mail, name);

        // Prepare edit page and go to edit page by uuid
        editPage = new EditPage(driver, uuid);

        // Prepare values to entry
        changedHomepage = "https://en.wikipedia.org/wiki/Quality_assurance";
        changedPosition = "QA engineer";
        changedQualities = "*Пророк";

        // Edit values
        editPage.setHomepage(changedHomepage);
        editPage.setPosition(changedPosition);
        editPage.setQualities(changedQualities);

        // Save changes
        editPage.clickSaveButton();

        // Go to view page for check actual result
        viewPage = new ViewPage(driver, uuid);
    }

    @Test
    public void editEnteredResume() {
        Assert.assertEquals(changedHomepage, viewPage.getHomepage());
        Assert.assertEquals(changedPosition, viewPage.getPosition());
        Assert.assertEquals(changedQualities, viewPage.getQualities());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
