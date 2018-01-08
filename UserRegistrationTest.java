import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.util.concurrent.TimeUnit;


/**
 * Created by Natali on 08.01.2018.
 */
public class UserRegistrationTest {

    private WebDriver driver;
    private HomePage homePage;

    @Before
    public void setUp(){
        System.setProperty("webdriver.gecko.driver", "D:/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://dev2.revetinc.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    @Test
    public void SuccessfulUserRegistrationTest() {

        RegistrationPage registrationPage = homePage.openRegistrationPage();
        registrationPage.registerUsingEmail();
        registrationPage.inputFirstName("Natalya");
        registrationPage.inputLastName("Moroz");
        registrationPage.inputUserName("123moroz11@gmail.com");
        registrationPage.inputPassword("P@ssw0rd");
        registrationPage.clickRegisterBtn();


    }



}
