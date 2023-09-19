package Demo;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
 
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
 
public class Lambda_Test {
 
    String username = "prashanttaware7571"; //Enter your username
    String accesskey = "0G9bWow11mQ4mSZOABzK3c5IcttfaUZP9hcaugatJ6zDnSZoSl"; //Enter your accesskey
 
    static RemoteWebDriver driver;
    String gridURL = "@hub.lambdatest.com/wd/hub";
    String urlToTest = "https://accounts.lambdatest.com/login";
 
    @BeforeTest
    @Parameters("browser")
    public void setUp(String browser)throws MalformedURLException
    {
        if(browser.equalsIgnoreCase("Chrome"))
        {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("browserName", "chrome");   //To specify the browser
            capabilities.setCapability("version", "93.0");    //To specify the browser version
            capabilities.setCapability("platform", "win10");      // To specify the OS
            capabilities.setCapability("build", "LambdaTestApp");               //To identify the test
            capabilities.setCapability("name", "Test_Chrome");
            capabilities.setCapability("network", true);   // To enable network logs
            capabilities.setCapability("visual", true);          // To enable step by step screenshot
            capabilities.setCapability("video", true);       // To enable video recording
            capabilities.setCapability("console", true);         // To capture console logs
            try {
                driver = new RemoteWebDriver(new URL("https://" + username + ":" + accesskey + gridURL), capabilities);
            } catch (MalformedURLException e) {
                System.out.println("Invalid grid URL");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
 
        else if(browser.equalsIgnoreCase("Firefox"))
        {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("browserName", "Firefox");  //To specify the browser
            capabilities.setCapability("version", "76.0");    //To specify the browser version
            capabilities.setCapability("platform", "win10");      // To specify the OS
            capabilities.setCapability("build", "LambdaTestApp");  //To identify the test
            capabilities.setCapability("name", "Test_Firefox");
            capabilities.setCapability("network", true);      // To enable network logs
            capabilities.setCapability("visual", true);          // To enable step by step screenshot
            capabilities.setCapability("video", true);                          // To enable video recording
            capabilities.setCapability("console", true);         // To capture console logs
            try {
                driver = new RemoteWebDriver(new URL("https://" + username + ":" + accesskey + gridURL), capabilities);
            } catch (MalformedURLException e) {
                System.out.println("Invalid grid URL");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
 
 
    @Test
    public void Login() {
 
       driver.get(urlToTest);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
 
        WebElement email = driver.findElement(By.id("email"));
        email.clear();
        email.sendKeys("XXX@gmail.com");
 
        WebElement password = driver.findElement(By.id("password"));
        password.clear();
        password.sendKeys("XXX@123");
 
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        String title = "Welcome - LambdaTest";
 
        String actualTitle = driver.getTitle();
 
        Assert.assertEquals(actualTitle,title,"Page title doesnt match");
 
        System.out.println("User logged in successfully");
 
    }
 
    @AfterTest
    public void tearDown() {
        driver.quit();
    }
 
}
