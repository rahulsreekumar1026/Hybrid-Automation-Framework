package driver.manager.web.local;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeManager {

    private ChromeManager(){

    }

    public static WebDriver getDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        return new ChromeDriver(options);
    }
}
