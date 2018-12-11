import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddPage extends AbstractPage {

    //public static final String ADD_PAGE_URL = "http://localhost:8080/resume-datebase_Web/resume?action=add";

    public AddPage(WebDriver driver) {
        super(driver);
    }

    By nameField = By.cssSelector("input[name='fullName']");
    By phoneField = By.cssSelector("input[name='PHONE']");
    By mobileField = By.cssSelector("input[name='MOBILE']");
    By homePhoneField = By.cssSelector("input[name='HOME_PHONE']");
    By skypeField = By.cssSelector("input[name='SKYPE']");
    By mailField = By.cssSelector("input[name='MAIL']");
    By linkedinField = By.cssSelector("input[name='LINKEDIN']");
    By githubField = By.cssSelector("input[name='GITHUB']");
    // В параметре имя есть ошибка!
    By stackoverflowField = By.cssSelector("input[name='STATCKOVERFLOW']");
    By homepageField = By.cssSelector("input[name='HOME_PAGE']");

    By positionField = By.cssSelector("input[name='OBJECTIVE']");
    By qualitiesField = By.cssSelector("textarea[name='PERSONAL']");
    By achievementField = By.cssSelector("textarea[name='ACHIEVEMENT']");
    By qualificationField = By.cssSelector("textarea[name='QUALIFICATIONS']");
    By experienceOrganisationNameField = By.cssSelector("input[name='EXPERIENCE']");
    By experienceURLField = By.cssSelector("input[name='EXPERIENCEurl']");
    By experienceStartDateField = By.cssSelector("input[name='EXPERIENCE0startDate']");
    By experienceEndDateField = By.cssSelector("input[name='EXPERIENCE0endDate']");
    By experienceTitleField = By.cssSelector("input[name='EXPERIENCE0title']");
    By experienceDescriptionField = By.cssSelector("textarea[name='EXPERIENCE0description']");

    By educationNameField = By.cssSelector("input[name='EDUCATION']");
    By educationURLField = By.cssSelector("input[name='EDUCATIONurl']");
    By educationStartDateField = By.cssSelector("input[name='EDUCATION0startDate']");
    By educationEndDateField = By.cssSelector("input[name='EDUCATION0endDate']");
    By educationTitleField = By.cssSelector("input[name='EDUCATION0title']");
    By educationDescriptionField = By.cssSelector("textarea[name='EDUCATION0description']");

    By saveButton = By.cssSelector("button[type='submit']");
    By cancelButton = By.xpath("//button[text()='Отменить']");

    By mainpageAddButton = By.xpath("//section//table//tbody//th[3]//a");

    public AddPage typeName(String name) {
        driver.findElement(nameField).sendKeys(name);
        return this;
    }

    public AddPage typePhone(String phone) {
        driver.findElement(phoneField).sendKeys(phone);
        return this;
    }

    public AddPage typeMobile(String mobile) {
        driver.findElement(mobileField).sendKeys(mobile);
        return this;
    }

    public AddPage typeHomePhone(String homePhone) {
        driver.findElement(homePhoneField).sendKeys(homePhone);
        return this;
    }

    public AddPage typeSkype(String skype) {
        driver.findElement(skypeField).sendKeys(skype);
        return this;
    }

    public AddPage typeMail(String mail) {
        driver.findElement(mailField).sendKeys(mail);
        return this;
    }

    public AddPage typeLinkedin(String linkedin) {
        driver.findElement(linkedinField).sendKeys(linkedin);
        return this;
    }

    public AddPage typeGithub(String github) {
        driver.findElement(githubField).sendKeys(github);
        return this;
    }

    public AddPage typeStackoverflow(String stackoverflow) {
        driver.findElement(stackoverflowField).sendKeys(stackoverflow);
        return this;
    }

    public AddPage typeHomepage(String homepage) {
        driver.findElement(homepageField).sendKeys(homepage);
        return this;
    }

    public AddPage typePosition(String position) {
        driver.findElement(positionField).sendKeys(position);
        return this;
    }

    public AddPage typeQualities(String qualities) {
        driver.findElement(qualitiesField).sendKeys(qualities);
        return this;
    }

    public AddPage typeAchievement(String achievement) {
        driver.findElement(achievementField).sendKeys(achievement);
        return this;
    }

    public AddPage typeQualification(String qualification) {
        driver.findElement(qualificationField).sendKeys(qualification);
        return this;
    }

    public AddPage typeExperienceOrganisationName(String experienceOrganisationName) {
        driver.findElement(experienceOrganisationNameField).sendKeys(experienceOrganisationName);
        return this;
    }

    public AddPage typeExperienceURL(String experienceURL) {
        driver.findElement(experienceURLField).sendKeys(experienceURL);
        return this;
    }

    public AddPage typeExperienceStartDate(String experienceStartDate) {
        driver.findElement(experienceStartDateField).sendKeys(experienceStartDate);
        return this;
    }

    public AddPage typeExperienceEndDate(String experienceEndDate) {
        driver.findElement(experienceEndDateField).sendKeys(experienceEndDate);
        return this;
    }

    public AddPage typeExperienceTitle(String experienceTitle) {
        driver.findElement(experienceTitleField).sendKeys(experienceTitle);
        return this;
    }

    public AddPage typeExperienceDescription(String experienceDescription) {
        driver.findElement(experienceDescriptionField).sendKeys(experienceDescription);
        return this;
    }

    public AddPage typeEducationName(String educationName) {
        driver.findElement(educationNameField).sendKeys(educationName);
        return this;
    }

    public AddPage typeEducationURL(String educationURL) {
        driver.findElement(educationURLField).sendKeys(educationURL);
        return this;
    }

    public AddPage typeEducationStartDate(String educationStartDate) {
        driver.findElement(educationStartDateField).sendKeys(educationStartDate);
        return this;
    }

    public AddPage typeEducationEndDate(String educationEndDate) {
        driver.findElement(educationEndDateField).sendKeys(educationEndDate);
        return this;
    }

    public AddPage typeEducationTitle(String educationTitle) {
        driver.findElement(educationTitleField).sendKeys(educationTitle);
        return this;
    }

    public AddPage typeEducationDescription(String educationDescription) {
        driver.findElement(educationDescriptionField).sendKeys(educationDescription);
        return this;
    }

    public void clickSaveButton() {
        driver.findElement(saveButton).click();
    }

    public void clickCancelButton() {
        driver.findElement(cancelButton).click();
    }

    public void clickMainpageAddButton() {
        driver.findElement(mainpageAddButton).click();
    }

}
