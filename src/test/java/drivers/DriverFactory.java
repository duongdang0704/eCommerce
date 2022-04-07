package drivers;

public class DriverFactory {

    public static DriverManager driverManager;

    public static DriverManager getDriverManager(Browser type) {
        if (driverManager == null) {
            switch (type) {
                case CHROME:
                    driverManager = new ChromeDriverManager();
                    break;
                case FIREFOX:
                    driverManager = new FirefoxDriverManager();
                    break;
                default:
                    //   driverManager = new SafariDriverManager();
                    break;
            }
        }
        return driverManager;
    }
}
