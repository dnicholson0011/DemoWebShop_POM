package books;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.BooksPage;
import pages.books.ComputingAndInternetPage;

public class ComputingAndInternetTests extends BaseTests {

    @Test
    public void testComputingAndInternet() {
        BooksPage booksPage = homePage.clickBooks();
        ComputingAndInternetPage computingAndInternetPage = books.clickComputingAndInternet();
    }
}
