package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickLogin() {
        clickClassName("ico-login");
        return new LoginPage(driver);
    }

    public RegistrationPage clickRegistration() {
        clickClassName("ico-register");
        return new RegistrationPage(driver);
    }

    public BooksPage clickBooks() {
        clickCssSelector("");
        return new BooksPage(driver);
    }

    public void clickClassName(String className) {
        driver.findElement(By.className(className)).click();
    }

    public void clickCssSelector(String cssSelector) {
        driver.findElement(By.cssSelector(cssSelector)).click();
    }
}
