package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin() {
        LoginPage loginPage = homePage.clickLogin();
        loginPage.setUsername("first.last@example01.test");
        loginPage.setPassword("123456");
        loginPage.clickLoginButton();
    }
}
