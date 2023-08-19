import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
public class batchLearning {

   WebDriver driver;
    @BeforeSuite
    public void setUp() {
        System.setProperty("webDriver.Chrome.driver", "C://Automation//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
        @Test
        public void googleTest()
        {
            WebDriver driver = new ChromeDriver();

            driver.get("https://www.google.com/");
        driver.getTitle();
       WebElement search= driver.findElement(By.name("q"));
       search.sendKeys("selenium");
       //to search for a keyword in google  by using sendkeys or sendkeys enter keyword used//
       search.sendKeys(Keys.ENTER);
       driver.getPageSource();
    }
    @Test
    public void pragraTest()
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://pragra.co/");
        driver.getTitle();
        //WebDriver myWait=new WebDriverWait(driver,20);
       // myWait.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[text()='Apply Now']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("poonam");
        driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("khokher");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pk@gmail.com");
        driver.findElement(By.xpath("//input[@id='company']")).sendKeys("pragra");
        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("123456");
driver.findElement(By.xpath("//textarea[@id='msg']")).sendKeys("hello pragra");
driver.findElement(By.xpath("//input[@id='source_type']")).sendKeys("google");
    }


}
