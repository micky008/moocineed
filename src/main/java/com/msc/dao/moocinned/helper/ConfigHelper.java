package com.msc.dao.moocinned.helper;

import java.util.Properties;

/**
 *
 * @author micky
 */
public class ConfigHelper {

    private static Properties properties;

    public static void setProperties(Properties prop) {
        properties = prop;
    }

    public static void prepare() {
        if (!properties.getProperty("ws.image.folder").endsWith("/")) {
            properties.setProperty("ws.image.folder", properties.getProperty("ws.image.folder") + "/");           
        }
    }

    public static String getFolderUrlPhotos() {
        return properties.getProperty("ws.image.folder");
    }

}
