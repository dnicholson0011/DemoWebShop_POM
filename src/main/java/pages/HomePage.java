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
        clickXpath("//body/div[4]/div[1]/div[2]/ul[1]/li[1]/a[1]");
        return new BooksPage(driver);
    }

    public void clickClassName(String className) {
        driver.findElement(By.className(className)).click();
    }

    public void clickXpath(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }
}
