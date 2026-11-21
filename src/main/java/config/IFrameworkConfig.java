package config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Mutable;

@Config.Sources({
        "file:${user.dir}//src//test//resources//properties//config.properties"
})
public interface IFrameworkConfig extends Config, Mutable {

    @Key("app")
    String app();

    @Key("platform")
    String platform();

    @Key("env")
    String environment();

    @Key("browser")
    String browserVendor();

    @Key("mobileOS")
    String mobileOS();

    @Key("runMode")
    String runMode();

    @Key("webCloudPlatform")
    String webCloudProvider();

    @Key("mobileCloudPlatform")
    String mobileCloudProvider();
}
