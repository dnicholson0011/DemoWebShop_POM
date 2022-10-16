package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.books.ComputingAndInternetPage;

public class BooksPage {

    private WebDriver driver;

    private By computingAndInternetAddToCartButton = By.xpath("//div[@class='master-wrapper-content']//div[1]//div[1]//div[2]//div[3]//div[2]//input[1]");

    public BooksPage(WebDriver driver) {
        this.driver = driver;
    }

    public String pageTitle() {
        return driver.getTitle();
    }

    public void clickAddToCartButton(By productAddToCartButton) {
        driver.findElement(productAddToCartButton).click();
    }

    public ComputingAndInternetPage clickComputingAndInternet() {
        //normalize space replaces space characters and more
        clickXpath("//a[normalize-space()='Computing and Internet']");
        return new ComputingAndInternetPage(driver);
    }

    public boolean banner() {
        WebDriverWait wait = new WebDriverWait(driver, 1L);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='content']")));
        return element.isDisplayed();
    }

    public void clickXpath(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }

    public By getComputingAndInternetAddToCartButton() {
        return computingAndInternetAddToCartButton;
    }
}
