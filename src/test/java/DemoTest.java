import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest {

    WebDriver driver;

    @Test  /*timeOut = 700,priority = 1,enabled = true*/
    public void Setup()//throws InterruptedException
    {
        driver=new ChromeDriver();
        System.setProperty("webDriver.chrome.driver","C:\\Automation\\chromedriver.exe");
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.quit();

       // Thread.sleep(500);
        //System.out.println("Opening Browser");
    }
    /*@Test(invocationCount = 4,invocationTimeOut = 20,alwaysRun = false)//priority = 1,description = "This is the testcase")*/
    @Test(alwaysRun = false ,groups ="smoke")
    public void Login()
    {
        System.out.println("This is the Login Test");
    }
    @Test(dependsOnMethods = {"Login"},priority = 2)
    public void Logout()
    {
        System.out.println("Closing Browser");
    }

}
