import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MainPage extends AbstractPage {

    public static final String MAIN_PAGE_URL = "http://javase-app.eu-west-2.elasticbeanstalk.com/resume";
    private static final String xpathToUuid =
            "//section//table//tr//td//a[text()='%s']/ancestor::td//preceding-sibling::td/a[text()='%s']";
    private static final String xpathToDelete =
            "//section//table//tr//td//a[@href='resume?uuid=%s&action=delete']";
    private static final String xpathToEdit =
            "//section//table//tr//td//a[@href='resume?uuid=%s&action=edit']";

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public String getUuid(String mail, String name) {
        try {
            String result = driver
                    .findElement(By.xpath(String.format(xpathToUuid, mail, name)))
                    .getAttribute("href");
            result = result.substring(result.indexOf("uuid=") + 5, result.indexOf("&action"));
            return result;
        } catch (Exception e) {
            return null;
        }
    }

    public int getResumeCount(String mail, String name) {
        try {
            List<WebElement> result = driver
                    .findElements(By.xpath(String.format(xpathToUuid, mail, name)));
            return result.size();
        } catch (Exception e) {
            return 0;
        }
    }

    public void deleteResume(String uuid) {
        driver.findElement(By.xpath(String.format(xpathToDelete, uuid))).click();
    }

//    public void goToEditResumePage(String uuid) {
//        driver.findElement(By.xpath(String.format(xpathToEdit, uuid))).click();
//    }

}
