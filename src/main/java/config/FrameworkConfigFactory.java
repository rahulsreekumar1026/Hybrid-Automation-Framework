package config;

import org.aeonbits.owner.ConfigCache;

public class FrameworkConfigFactory {

    private FrameworkConfigFactory() {}

    public static IFrameworkConfig getConfig(){
        return ConfigCache.getOrCreate(IFrameworkConfig.class);
    }
}
