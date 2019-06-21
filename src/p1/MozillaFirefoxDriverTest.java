package p1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MozillaFirefoxDriverTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","c:\\Selenium\\Drivers\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();

        driver.get("http://apple.com");
        System.out.println(driver.getTitle());
    }
}
