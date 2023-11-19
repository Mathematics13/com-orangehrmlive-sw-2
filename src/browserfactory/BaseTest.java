package browserfactory;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.time.Duration;

public class BaseTest
{
    static String browser = "Chrome";
    public static WebDriver driver;

    static String baseUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    @BeforeClass
    public static void browserSetUp()
    {
        System.setProperty("webdriver.chrome.driver" ,"chromedriver.exe");

        if(browser.equalsIgnoreCase("Chrome"))
        {
            driver= new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("Edge"))
        {
            driver=new EdgeDriver();
        }
        else if(browser.equalsIgnoreCase("Firefox"))
        {
            driver= new FirefoxDriver();
        }
        else
        {
            System.out.println("Wrong Browser name");
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @AfterClass
    public static void closeBrowser()
    {
        driver.quit();
    }

}
