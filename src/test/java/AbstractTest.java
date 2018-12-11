import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public abstract class AbstractTest {
    WebDriver driver;

    public AbstractTest() {
        System.setProperty("webdriver.chrome.driver", "D:/Java/Projects/crudtest/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(MainPage.MAIN_PAGE_URL);
        driver.manage().window().maximize();
    }

    AddPage addPage;
    ViewPage viewPage;
    MainPage mainPage;
    EditPage editPage;

    String name = "Антон Ряписов";
    String phone = "1953515";
    String mobile = "+79932113495";
    String homePhone = "+78123350305";
    String skype = "Ryapis223";
    String mail = "ryapisov.anton@gmail.com";
    String linkedin = "https://www.linkedin.com/";
    String github = "https://github.com/";
    String stackoverflow = "https://stackoverflow.com/";
    String homepage = "https://en.wikipedia.org/wiki/C_Sharp_(programming_language)";
    String position = "C# Developer";
    String qualities = "*Умеренный *Рассудительный *Опытный";
    String achievement = "*Base skill\n*Top skill\n*Master skill";
    String qualification = "*Тестирование белого ящика\n*Тестирование серого ящика\n*Тестирование черного ящика";
    String experienceOrganisationName = "Google";
    String experienceURL = "https://www.google.com/";
    String experienceStartDate = "06/2018";
    String experienceEndDate = "07/2018";
    String experienceTitle = "Инженер П.О.";
    String experienceDescription = "*Разработка приложений *Написание документации";
    String educationName = "СПбГУ";
    String educationURL = "https://spbu.ru/";
    String educationStartDate = "06/2013";
    String educationEndDate = "07/2017";
    String educationTitle = "Бакалавр";
    String educationDescription = "*Студент *Бакалавр";

    String changedHomepage;
    String changedPosition;
    String changedQualities;
}
