package driver.context;

import enums.BrowserType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class WebDriverContext {
    private BrowserType webBrowserType;
    private String webRemoteModeType;
}
