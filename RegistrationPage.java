import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Natali on 08.01.2018.
 */
public class RegistrationPage {

    private WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public RegistrationPage registerUsingEmail(){
        driver.findElement(By.cssSelector("p.margin-bottom-40 > a:nth-child(1)")).click();
        return this;
    }

    public RegistrationPage inputFirstName(String text){
        driver.findElement(By.name("FirstName")).sendKeys(text);
        return this;
    }

    public RegistrationPage inputLastName(String text) {
        driver.findElement(By.name("LastName")).sendKeys(text);
        return this;
    }

    public RegistrationPage inputUserName(String text){
        driver.findElement(By.name("UserName")).sendKeys(text);
        return this;
    }

    public RegistrationPage inputPassword(String text) {
        driver.findElement(By.name("Password")).sendKeys(text);
        return this;
    }

    public void clickRegisterBtn(){
        driver.findElement(By.cssSelector("button.btn:nth-child(1)")).click();
    }


}
