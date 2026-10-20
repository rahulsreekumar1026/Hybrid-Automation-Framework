package driver;

import org.openqa.selenium.WebDriver;

public class DriverManager {

    private DriverManager() {

    }

    private static final ThreadLocal<WebDriver> WEB_DRIVER_THREAD_LOCAL = new ThreadLocal<>();
    private static final ThreadLocal<String> CONTEXT = new ThreadLocal<>();

    public static void setDriver(WebDriver driver){
        WEB_DRIVER_THREAD_LOCAL.set(driver);
        CONTEXT.set("WEB");
    }

    public static WebDriver getDriver(){
        return CONTEXT.get().equalsIgnoreCase("WEB") ?
                WEB_DRIVER_THREAD_LOCAL.get() : null;
    }
}
