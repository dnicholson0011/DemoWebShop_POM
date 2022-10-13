package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickLogin() {
        clickLink("ico-login");
        return new LoginPage(driver);
    }

    public void clickLink(String className) {
        driver.findElement(By.className(className)).click();
    }
}
