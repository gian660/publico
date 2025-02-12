package pe.gob.osinergmin.soa.sms.ws.util;

/**
 *
 * @author otheo
 */
public final class StringUtils {

    private StringUtils() {
    }

    public static boolean isEmpty(String string) {
        return string == null || "".equals(string.trim());
    }
}
