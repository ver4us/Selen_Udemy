package p1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ie {
    public static void main(String[] args) {


 System.setProperty("webdriver.ie.driver","c:\\Selenium\\Drivers\\IEDriverServer.exe");
    WebDriver driver=new InternetExplorerDriver();

        driver.get("http://apple.com");
        System.out.println(driver.getTitle());
}}
