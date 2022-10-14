package RegistrationTests;

import base.BaseTests;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.testng.annotations.Test;
import pages.RegistrationPage;

public class RegistrationTests extends BaseTests {

    @Test
    public void testSuccessfulRegistration() {
        RegistrationPage registrationPage = homePage.clickRegistration();
        registrationPage.setMaleRadioButton();
        registrationPage.setFirstName("first");
        registrationPage.setLastName("last");
        registrationPage.setEmail("first.last@example.test");
        registrationPage.setPassword("123456");
        registrationPage.setConfirmPassword("123456");
        registrationPage.clickRegisterButton();
    }
}
