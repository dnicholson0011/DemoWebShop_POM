package pages.books;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BooksPage;

public class ComputingAndInternetPage {

    private WebDriver driver;

    private By quanityField = By.id("addtocart_13_EnteredQuantity");

    private By addToCartButton = By.id("add-to-cart-button-13");

    public ComputingAndInternetPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setQuanity(String quanity)  {
        driver.findElement(quanityField).sendKeys(quanity);
    }

    public void clickAddToCartButton() {
        driver.findElement(addToCartButton).click();
    }
}
