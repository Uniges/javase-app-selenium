import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditPage extends AddPage {

    public EditPage(WebDriver driver, String uuid) {
        super(driver);
        driver.get(String.format("%s?uuid=%s&action=edit", MainPage.MAIN_PAGE_URL, uuid));
    }

    public EditPage setHomepage(String homepage) {
        return clearAndSet(homepageField, homepage);
    }

    public EditPage setPosition(String position) {
        return clearAndSet(positionField, position);
    }

    public EditPage setQualities(String qualities) {
        return clearAndSet(qualitiesField, qualities);
    }

    public EditPage clearAndSet(By locator, String data) {
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(data);
        return this;
    }
}
