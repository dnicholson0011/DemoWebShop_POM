package books;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BooksPage;

public class BooksTests extends BaseTests {

    @Test
    public void testBooks() {
        BooksPage booksPage = homePage.clickBooks();

        String title = "Demo Web Shop. Books";
        Assert.assertEquals(title,booksPage.pageTitle());
    }
}