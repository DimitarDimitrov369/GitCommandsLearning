package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    private By formAuthenticationLink = By.linkText("Form Authentication");
    // I go to login page when I click

    public LoginPage clickFormAuthentication() {
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);

    }


    public DropdownPage clickDropdown() {
        driver.findElement(By.linkText("Dropdown")).click();
        return new DropdownPage(driver);
    }

    public HoversPage clickHovers() {
        driver.findElement(By.linkText("Hovers")).click();
        return new HoversPage(driver);
    }
}
