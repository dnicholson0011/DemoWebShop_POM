package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.BooksPage;
import pages.HomePage;

public class BaseTests {

    private WebDriver driver;

    protected HomePage homePage;

    protected BooksPage books;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");

        String title = "Demo Web Shop";
        Assert.assertEquals(title,driver.getTitle());

        homePage = new HomePage(driver);
        books = new BooksPage(driver);
    }

    @AfterClass
    public void tearDown() {
        //driver.quit();
    }
}
