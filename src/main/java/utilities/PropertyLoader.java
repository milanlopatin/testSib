package utilities;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyLoader {

    public static Properties loadProperties(String filename) {
        Properties prop = new Properties();
        if (!readPropertyFile(filename, prop)) return null;
        return prop;
    }

    public static String loadProperty(String key, String defaultValue, String filename) {
        Properties prop = new Properties();
        if (!readPropertyFile(filename, prop)) return null;

        return prop.getProperty(key, defaultValue);
    }

    public static String loadProperty(String key, String filename) {
        Properties prop = new Properties();

        if (!readPropertyFile(filename, prop)) return null;
        return prop.getProperty(key);
    }


    private static boolean readPropertyFile(String filename, Properties prop) {
        InputStream input = null;
        try {
            input = PropertyLoader.class.getClassLoader().getResourceAsStream(filename);

            if (input == null) {
                return false;
            }
            prop.load(input);

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return true;
    }
}
