package pages.books;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BooksPage;

public class ComputingAndInternetPage extends BooksPage {

    private WebDriver driver;

    private By quanityField = By.id("addtocart_13_EnteredQuantity");

    public ComputingAndInternetPage(WebDriver driver, WebDriver driver1) {
        super(driver);
        this.driver = driver1;
    }
}
