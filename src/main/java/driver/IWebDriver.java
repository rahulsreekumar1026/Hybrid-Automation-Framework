package driver;

import driver.context.WebDriverContext;
import org.openqa.selenium.WebDriver;

public interface IWebDriver {
    WebDriver getDriver(WebDriverContext context);
}
