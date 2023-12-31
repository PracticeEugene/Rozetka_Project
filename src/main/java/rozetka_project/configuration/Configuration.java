package rozetka_project.configuration;

public class Configuration {
    public static final String PLATFORM_AND_BROWSER = "windows_chrome";

    /**
     * Clear browser cookies after each iteration
     * if true - clear cookies
     */
    public static final Boolean CLEAR_COOKIES_AND_STORAGE = true;

    /**
     * To keep the browser open after suite
     * if true - browser close
     */
    public static final Boolean HOLD_BROWSER_OPEN = true;
}
