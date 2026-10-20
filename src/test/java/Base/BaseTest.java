package Base;

import driver.Driver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    @BeforeTest
    public void setup(){
        Driver.initDriverForWeb();
    }

    @AfterTest
    public void tearDown(){
        Driver.quit();
    }
}
