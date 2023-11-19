package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest
{

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() throws InterruptedException
    {

      WebElement forgotYourPassword = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"));
      forgotYourPassword.click();
      Thread.sleep(3000);

      String expectedText = "Reset Password";
      WebElement actualText = driver.findElement(By.xpath("//h6"));
       String actualTextAfterRun =  actualText.getText() ;

      Assert.assertEquals( expectedText , actualTextAfterRun);

    }

}
