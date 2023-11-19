package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest
{
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() throws InterruptedException
    {
         WebElement userName = driver.findElement(By.name("username"));
         userName.sendKeys("Admin");
         Thread.sleep(3000);

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");
        Thread.sleep(3000);

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        Thread.sleep(3000);

        String expectedText = "Dashboard";
        WebElement actualText = driver.findElement(By.xpath("//h6"));
        String actualTextAfterRun = actualText.getText();

        Assert.assertEquals(expectedText, actualTextAfterRun);
    }
}
