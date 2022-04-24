package configuration;

public class WebConfig {
    public static final String BASE_URL = "https://www.amazon.ca/";
    public static final int IMPLICIT_WAIT = 10;
    public static final int EXPLICIT_WAIT = 20;
    public static String RUN_MODE;
    public static String CONFIG_FILE;
    public static String ENVIRONMENT;

    public static void setConfig(String runMode, String configFile, String environment){
        RUN_MODE = runMode;
        CONFIG_FILE = configFile;
        ENVIRONMENT = environment;
    }

    public static void setDefaultConfig(){
        RUN_MODE = "local";
        CONFIG_FILE = "";
        ENVIRONMENT = "";
    }
}
