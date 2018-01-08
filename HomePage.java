import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/**
 * Created by Natali on 08.01.2018.
 */
public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public RegistrationPage openRegistrationPage(){
        driver.findElement(By.linkText("Join now")).click();
        return new RegistrationPage(driver);
    }

}
