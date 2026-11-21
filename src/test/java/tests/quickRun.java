package tests;

import config.FrameworkConfigFactory;
import config.IFrameworkConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class quickRun {
    Logger log = LoggerFactory.getLogger("SampleLogger");

    @Test
    public void test() {
        IFrameworkConfig fcfg = FrameworkConfigFactory.getConfig();
    }
    public void testLog(){
        log.info("testing logback");
    }
}
