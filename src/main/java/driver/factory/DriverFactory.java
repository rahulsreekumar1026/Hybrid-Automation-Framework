package driver.factory;

import driver.IWebDriver;
import driver.impl.web.LocalWebDriverImpl;
import enums.RunModeType;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public class DriverFactory {

    private DriverFactory() {

    }

    private static final Map<RunModeType, Supplier<IWebDriver>> WEB = new EnumMap<>(RunModeType.class);
//    private static final Map<RunModeType, Supplier<>> MOBILE =

    static {
        WEB.put(RunModeType.LOCAL, LocalWebDriverImpl::new);
//        WEB.put(RunModeType.REMOTE, )
    }

    public static IWebDriver getDriverForWeb(RunModeType runModeType) {
        return WEB.get(runModeType).get();
    }
}
