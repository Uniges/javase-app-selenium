import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AddTest extends AbstractTest {

    @Before
    public void setUp() {
        // Prepare page objects
        mainPage = new MainPage(driver);
        addPage = new AddPage(driver);

        // Go to add page
        addPage.clickMainpageAddButton();

        // Enter all values
        addPage.typeName(name)
                .typePhone(phone)
                .typeMobile(mobile)
                .typeHomePhone(homePhone)
                .typeSkype(skype)
                .typeMail(mail)
                .typeLinkedin(linkedin)
                .typeGithub(github)
                .typeStackoverflow(stackoverflow)
                .typeHomepage(homepage)
                .typePosition(position)
                .typeQualities(qualities)
                .typeAchievement(achievement)
                .typeQualification(qualification)
                .typeExperienceOrganisationName(experienceOrganisationName)
                .typeExperienceURL(experienceURL)
                .typeExperienceStartDate(experienceStartDate)
                .typeExperienceEndDate(experienceEndDate)
                .typeExperienceTitle(experienceTitle)
                .typeExperienceDescription(experienceDescription)
                .typeEducationName(educationName)
                .typeEducationURL(educationURL)
                .typeEducationStartDate(educationStartDate)
                .typeEducationEndDate(educationEndDate)
                .typeEducationTitle(educationTitle)
                .typeEducationDescription(educationDescription);

        // Save entered values and go to main page
        addPage.clickSaveButton();

        // Get uuid of created resume by name and mail from table
        String uuid = mainPage.getUuid(mail, name);

        // Go to view page of gotten uuid
        viewPage = new ViewPage(driver, uuid);

        // And now we have prepared to test
    }

    @Test
    public void addResume() {
        // Check actual name
        Assert.assertEquals(name, viewPage.getName());

        // Check actual Contacts
        Assert.assertEquals(phone, viewPage.getPhone());
        Assert.assertEquals(mobile, viewPage.getMobile());
        Assert.assertEquals(homePhone, viewPage.getHomePhone());
        Assert.assertEquals(skype, viewPage.getSkype());
        Assert.assertEquals(mail, viewPage.getMail());

        // Check actual Links
        Assert.assertEquals(linkedin, viewPage.getLinkedin());
        Assert.assertEquals(github, viewPage.getGithub());
        Assert.assertEquals(stackoverflow, viewPage.getStackoverflow());
        Assert.assertEquals(homepage, viewPage.getHomepage());

        // Check actual Skills
        Assert.assertEquals(position, viewPage.getPosition());
        Assert.assertEquals(qualities, viewPage.getQualities());
        Assert.assertEquals(achievement, viewPage.getAchievement());
        Assert.assertEquals(qualification, viewPage.getQualification());

        // Check actual Experience
        Assert.assertEquals(experienceOrganisationName, viewPage.getExperienceOrganisationName());
        Assert.assertEquals(experienceURL, viewPage.getExperienceURL());
        Assert.assertEquals(experienceStartDate, viewPage.getExperienceStartDate());
        Assert.assertEquals(experienceEndDate, viewPage.getExperienceEndDate());
        Assert.assertEquals(experienceTitle, viewPage.getExperienceTitle());
        Assert.assertEquals(experienceDescription, viewPage.getExperienceDescription());

        // Check actual Education
        Assert.assertEquals(educationName, viewPage.getEducationName());
        Assert.assertEquals(educationURL, viewPage.getEducationURL());
        Assert.assertEquals(educationStartDate, viewPage.getEducationStartDate());
        Assert.assertEquals(educationEndDate, viewPage.getEducationEndDate());
        Assert.assertEquals(educationTitle, viewPage.getEducationTitle());
        Assert.assertEquals(educationDescription, viewPage.getEducationDescription());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
