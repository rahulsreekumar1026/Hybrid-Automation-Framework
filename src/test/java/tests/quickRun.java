package tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class quickRun {
    Logger log = LoggerFactory.getLogger("SampleLogger");

    @Test
    public void testLog(){
        log.info("testing logback");
    }
}
