package driver;

import driver.context.WebDriverContext;
import driver.factory.DriverFactory;
import enums.BrowserType;
import enums.RunModeType;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

public class Driver {

    private Driver() {

    }

    public static void initDriverForWeb() {
        if(Objects.isNull(DriverManager.getDriver())){
            WebDriverContext driverContext = new WebDriverContext(BrowserType.CHROME, "local");

            WebDriver driver = DriverFactory.getDriverForWeb(RunModeType.LOCAL)
                    .getDriver(driverContext);

            DriverManager.setDriver(driver);
        }
    }

    public static void quit(){
        DriverManager.getDriver().quit();
    }



}
