import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {
    WebDriver driver;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
    }
}
