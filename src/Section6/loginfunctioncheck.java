package Section6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginfunctioncheck {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://facebook.com");
        driver.findElement(By.id("email")).sendKeys("9189214843");
        driver.findElement(By.name("pass")).sendKeys("5363703615@Ver");
        //driver.findElement(By.id("email")).clear();
        //driver.findElement(By.linkText("Forgot account?")).click();
        driver.findElement(By.xpath("//*[@id=\'u_0_3\']")).click();
        //driver.close();
    }
}
