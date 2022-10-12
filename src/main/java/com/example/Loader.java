package com.example;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/*
 * Loads custom resource.
 */
public class Loader {
    private static final String META_PROPS_FILE = "custom.properties";
    private static final String LIB_VERSION_PROP = "lib.version";

    private Loader() {}

    /*
     * Get the version property.
     */
    public static synchronized String version() throws IOException {
        return libVersion();
    }

    private static String libVersion() throws IOException {
        final Properties props;
        try (InputStream in = Loader.class.getResourceAsStream( '/' + META_PROPS_FILE)) {
            props = new Properties();
            props.load(in);
        }
        return props.getProperty(LIB_VERSION_PROP);
    }
}
