package br.com.fiap.patterns.config;

import java.util.Properties;

public class ConfigSingleton {

    private static Properties props;

    private ConfigSingleton () {

    }

    public static Properties getInstance () {
        if (props == null) {
            props = new Properties();
            try {
                props.load(ConfigSingleton.class.getResourceAsStream("/config.properties"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return props;
    }

}
