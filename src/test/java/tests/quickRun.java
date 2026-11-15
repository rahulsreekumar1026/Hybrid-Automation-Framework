package tests;

import config.FrameworkConfigFactory;
import config.IFrameworkConfig;
import org.testng.annotations.Test;

public class quickRun {

    @Test
    public void test() {
        IFrameworkConfig fcfg = FrameworkConfigFactory.getConfig();

    }
}
