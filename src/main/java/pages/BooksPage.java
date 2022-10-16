package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.books.ComputingAndInternetPage;

public class BooksPage {

    private WebDriver driver;

    private By addToCartButton = By.className("button-2 product-box-add-to-cart-button");

    public BooksPage(WebDriver driver) {
        this.driver = driver;
    }

    public String pageTitle() {
        return driver.getTitle();
    }

    public void clickAddToCartButton() {
        driver.findElement(addToCartButton).click();
    }

    public ComputingAndInternetPage clickComputingAndInternet() {
        //normalize space replaces space characters and more
        clickXpath("//a[normalize-space()='Computing and Internet']");
        return new ComputingAndInternetPage(driver);
    }

    public void clickXpath(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }
}
