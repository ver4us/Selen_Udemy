package Section6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceLogin {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://login.salesforce.com/");
        int i=0;
        while(i<10) {
            driver.findElement(By.id("username")).sendKeys("hello");
            driver.findElement(By.name("pw")).sendKeys("123456");
            driver.findElement(By.id("Login")).click();
        i++;
        }
        driver.close();
    }

}
