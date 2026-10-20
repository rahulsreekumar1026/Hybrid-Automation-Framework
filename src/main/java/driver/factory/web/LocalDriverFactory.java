package driver.factory.web;

import driver.manager.web.local.ChromeManager;
import enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public class LocalDriverFactory {

    private LocalDriverFactory(){

    }

    private final static Map<BrowserType, Supplier<WebDriver>> MAP = new EnumMap<>(BrowserType.class);

    static{
        MAP.put(BrowserType.CHROME, ChromeManager::getDriver);
//        MAP.put(BrowserType.EDGE, ()->{return null;});
//        MAP.put(BrowserType.FIREFOX, ()->{return null;});
    }

    public static WebDriver getDriver(BrowserType browserType){
        return MAP.get(browserType).get();
    }

}
