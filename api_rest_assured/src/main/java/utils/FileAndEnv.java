package utils;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class FileAndEnv {

    public static Map<String, String> fileandenv = new HashMap<String, String>();
    public static Properties propMain = new Properties();
    public static Properties propPreSet = new Properties();

    public static Map<String, String> envAndFile() {
        String environment = System.getProperty("env");

        try {
            if (environment.equalsIgnoreCase("qa")) {
                FileInputStream fisQa = new FileInputStream(System.getProperty("user.dir") + "/inputs/qa.properties");
                propMain.load(fisQa);
                fileandenv.put("ServerUrl", propMain.getProperty("ServerUrl"));
                fileandenv.put("portNo", propMain.getProperty("portNo"));
                fileandenv.put("username", propMain.getProperty("username"));
                fileandenv.put("password", propMain.getProperty("password"));
            } else if (environment.equalsIgnoreCase("dev")) {
                FileInputStream fisDev = new FileInputStream(System.getProperty("user.dir") + "/inputs/dev.properties");
                propMain.load(fisDev);
                fileandenv.put("ServerUrl", propMain.getProperty("ServerUrl"));
                fileandenv.put("portNo", propMain.getProperty("portNo"));
                fileandenv.put("username", propMain.getProperty("username"));
                fileandenv.put("password", propMain.getProperty("password"));
            }
        } catch (Exception e) {

        }
        return fileandenv;
    }

    public static Map<String, String> getConfReader() {
        if (fileandenv == null) {
            fileandenv = envAndFile();
        }
        return fileandenv;
    }

}
