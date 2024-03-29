package CdefgProje1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import static java.lang.System.*;

public class BrowserSelected  extends Utils {
    LoadProp loadProp = new LoadProp();

    public void setUpBrowser() {

        String browser = loadProp.getProperty("browser");
        String setUpBrowser = System.getProperty("setUpBrowser");
        if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "\\src\\test\\java\\com\\nopcommerces\\BrowserDrive\\geckodriver.exe");
            System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
            System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
            driver = new FirefoxDriver();
            driver.manage().window().fullscreen();
        } else if (browser.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "\\src\\test\\Resources\\BrowserDriver\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("disable-infobars");
            options.addArguments("-disable-extensions");
            options.addArguments("-disable-setUpBrowser-side-navigation");
            options.addArguments("-incognito");
            options.addArguments("-disable-blink-features=BlockCredentialedSubresources");
            driver = new ChromeDriver(options);
            driver.manage().window().fullscreen();
        } else if (browser.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", "\\src\\test\\Resources\\BrowserDriver\\IEDriverServer.exe");
            InternetExplorerOptions options = new InternetExplorerOptions();
            options.setCapability(InternetExplorerDriver.IE_SWITCHES, "-private");
            driver = new InternetExplorerDriver(options);
            driver.manage().window().maximize();
        } else {
            System.out.println("Browser name is empty or typed wrong:" + browser);

        }}}
