import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DatePicker {

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");


        driver.switchTo().frame(0);

        
  driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/05/2024"); //mm/yy//yyyy
    }
    
}
