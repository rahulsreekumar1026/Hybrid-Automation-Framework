package driver.impl.web;

import driver.IWebDriver;
import driver.context.WebDriverContext;
import driver.factory.web.LocalDriverFactory;
import org.openqa.selenium.WebDriver;

public class LocalWebDriverImpl implements IWebDriver {

    @Override
    public WebDriver getDriver(WebDriverContext driverContext){
        return LocalDriverFactory.getDriver(driverContext.getWebBrowserType());
    }
}
