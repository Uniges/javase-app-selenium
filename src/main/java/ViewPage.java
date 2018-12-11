import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewPage extends AbstractPage {

    //private final static String VIEW_PAGE_URL = "http://localhost:8080/resume-datebase_Web/resume?action=add";

    String[] contacts;

    public ViewPage(WebDriver driver, String uuid) {
        super(driver);
        driver.get(String.format("%s?uuid=%s&action=view", MainPage.MAIN_PAGE_URL, uuid));
        this.contacts = this.getContacts().split("\n");
    }

    public ViewPage(WebDriver driver) {
        super(driver);
    }

    private String getContacts() {
        return driver.findElement(contactsField).getText().trim();
    }

    By nameField = By.cssSelector("h1");

    By contactsField = By.xpath("//section//p[1]");

    By linkedinField = By.xpath("//section//p[1]//a[text()='Профиль LinkedIn']");
    By githubField = By.xpath("//section//p[1]//a[text()='Профиль GitHub']");
    By stackoverflowField = By.xpath("//section//p[1]//a[text()='Профиль Stackoverflow']");
    By homepageField = By.xpath("//section//p[1]//a[text()='Домашняя страница']");

    By positionField = By.xpath("//table//tbody//tr[2]//h3");
    By qualitiesField = By.xpath("//table//tbody//tr[4]//td");
    By achievementField = By.xpath("//table//tbody//tr[6]//td//ul");
    By qualificationField = By.xpath("//table//tbody//tr[8]//td//ul");
    //refactor
    By experienceOrganisationNameField = By.xpath("//table//tbody//tr[10]//td//h3//a");
    By experienceURLField = By.xpath("//table//tbody//tr[10]//td//h3//a");
    //refactor
    By experienceStartDateField = By.xpath("//table//tbody//tr[11]//td[1]");
    By experienceEndDateField = By.xpath("//table//tbody//tr[11]//td[1]");
    //By experienceTitleField = By.cssSelector("//table//tbody//tr[11]//td[2]//b");
    By experienceTitleField = By.xpath("//table//tbody//tr[11]//td[2]");
    //Contains title!
    By experienceDescriptionField = By.xpath("//table//tbody//tr[11]//td[2]");

    //refactor
    By educationNameField = By.xpath("//table//tbody//tr[13]//td//h3//a");
    By educationURLField = By.xpath("//table//tbody//tr[13]//td//h3//a");
    //refactor
    By educationStartDateField = By.xpath("//table//tbody//tr[14]//td[1]");
    By educationEndDateField = By.xpath("//table//tbody//tr[14]//td[1]");

    //By educationTitleField = By.cssSelector("//table//tbody//tr[14]//td[2]//b");
    By educationTitleField = By.xpath("//table//tbody//tr[14]//td[2]");
    By educationDescriptionField = By.xpath("//table//tbody//tr[14]//td[2]");

    By okButton = By.xpath("//button[text()='ОК']");


    public String getName() {
        return driver.findElement(nameField).getText().trim();
    }

    public String getPhone() {
        return contacts[0].replace("Тел.:", "").trim();
    }

    public String getMobile() {
        return contacts[1].replace("Мобильный:", "").trim();
    }

    public String getHomePhone() {
        return contacts[2].replace("Домашний тел.:", "").trim();
    }

    public String getSkype() {
        return contacts[3].replace("Skype:", "").trim();
    }

    public String getMail() {
        return contacts[4].replace("Почта:", "").trim();
    }

    public String getLinkedin() {
        return driver.findElement(linkedinField).getAttribute("href");
    }

    public String getGithub() {
        return driver.findElement(githubField).getAttribute("href");
    }

    public String getStackoverflow() {
        return driver.findElement(stackoverflowField).getAttribute("href");
    }

    public String getHomepage() {
        return driver.findElement(homepageField).getAttribute("href");
    }

    public String getPosition() {
        return driver.findElement(positionField).getText();
    }

    public String getQualities() {
        return driver.findElement(qualitiesField).getText();
    }

    public String getAchievement() {
        return driver.findElement(achievementField).getText();
    }

    public String getQualification() {
        return driver.findElement(qualificationField).getText();
    }

    public String getExperienceOrganisationName() {
        return driver.findElement(experienceOrganisationNameField).getText();
    }

    public String getExperienceURL() {
        return driver.findElement(experienceURLField).getAttribute("href");
    }

    public String getExperienceStartDate() {
        String resultString = driver.findElement(experienceStartDateField).getText();
        resultString = resultString.substring(0, resultString.indexOf("-")).trim();
        return resultString;
    }

    public String getExperienceEndDate() {
        String resultString = driver.findElement(experienceEndDateField).getText();
        resultString = resultString.substring(resultString.indexOf("-")+1).trim();
        return resultString;
    }

    public String getExperienceTitle() {
        return driver.findElement(experienceTitleField).getText().split("\n")[0];
    }

    //Need refactor
    public String getExperienceDescription() {
        return driver.findElement(experienceDescriptionField).getText().split("\n")[1];
    }

    public String getEducationName() {
        return driver.findElement(educationNameField).getText();
    }

    public String getEducationURL() {
        return driver.findElement(educationURLField).getAttribute("href");
    }

    public String getEducationStartDate() {
        String resultString = driver.findElement(educationStartDateField).getText();
        resultString = resultString.substring(0, resultString.indexOf("-")).trim();
        return resultString;
    }

    public String getEducationEndDate() {
        String resultString = driver.findElement(educationEndDateField).getText();
        resultString = resultString.substring(resultString.indexOf("-")+1).trim();
        return resultString;
    }

    public String getEducationTitle() {
        return driver.findElement(educationTitleField).getText().split("\n")[0];
    }

    //Need refactor
    public String getEducationDescription() {
        return driver.findElement(educationDescriptionField).getText().split("\n")[1];
    }

    public void clickOKButton() {
        driver.findElement(okButton).click();
    }
}
