package p1;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://apple.com");


       /* System.out.println(driver.getTitle());// validate page title
        String s = driver.getCurrentUrl();//get and validate the url
        System.out.println(s);
        //System.out.println(driver.getPageSource()); //print page source
        driver.get("http://yahoo.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.close();// it closes the current browsers
        driver.quit();// close all the browsers opened by selenium such as child windows
*/
    }

}
