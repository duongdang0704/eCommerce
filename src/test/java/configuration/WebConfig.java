package configuration;

public class WebConfig {
    public static final String BASE_URL = "https://www.amazon.ca/";
    public static final int IMPLICIT_WAIT = 10;
    public static final int EXPLICIT_WAIT = 20;
    public static String RUN_MODE = System.getProperty("runMode");
    public static String PLATFORM = System.getProperty("environment");
    public static String BROWSER = System.getProperty("browser");
    public static String REMOTE_URL = System.getProperty("remoteURL");

    public static void loadConfig(){
        // Set default run mode
        if (RUN_MODE.equals("")){
            RUN_MODE = "local";
        }
        // Set default environment
        if (PLATFORM.equals("")){
            PLATFORM = "win_chrome_env";
        }
        // Set default browser
        if(BROWSER.equals("")){
            BROWSER = "chrome";
        }
        // Set remote url
        if (REMOTE_URL.equals("")){
            REMOTE_URL = "http://localhost:4444/";
        }
    }
}
