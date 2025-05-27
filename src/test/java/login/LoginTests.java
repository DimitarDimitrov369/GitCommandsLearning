package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertEquals;


public class LoginTests extends BaseTests {

    @Test
    public void testSucessfulLogin(){
       LoginPage lp= homePage.clickFormAuthentication();
       lp.setUserName("tomsmith");
       lp.setPassword("SuperSecretPassword!");
       SecureAreaPage secureAreaPage=lp.clickLoginButton();


assertEquals(secureAreaPage.getStatusAlertText(),"You logged into a secure area!\n" +
        "×","Login was not successful");
    }
}
