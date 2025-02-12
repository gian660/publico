package pe.gob.osinergmin.soa.sms.ws.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author otheo
 */
public final class PropertiesUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(PropertiesUtils.class);
    private static final Properties APP_PROPERTIES;
    private static final String APP_PROPERTIES_PATH = "/data/ws-sms/properties/ws-sms.properties";
    public static final String APP_NAME = "[ws-sms] ";

    static {
        APP_PROPERTIES = new Properties();
        try {
            try (FileInputStream fis = new FileInputStream(new File(APP_PROPERTIES_PATH))) {
                APP_PROPERTIES.load(fis);
            }
        } catch (IOException ex) {
            LOGGER.error(APP_NAME + "Error al inicializar PropertiesUtils.", ex);
        }
    }

    private PropertiesUtils() {
    }

    public static String getProperty(String name) {
        return APP_PROPERTIES == null ? null : APP_PROPERTIES.getProperty(name);
    }
}
