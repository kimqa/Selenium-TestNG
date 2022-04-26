import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.BingoPage;
import pages.MainPage;

import java.net.MalformedURLException;
import java.net.URI;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver webDriver;
    String browser;

    protected MainPage mainPage;
    protected BingoPage bingoPage;



    @BeforeClass
    public void getBrowserName(ITestContext context) {
        browser = context.getCurrentXmlTest().getParameter("browser");
    }

    @BeforeMethod
    public void setUp() {
        setBrowser();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        mainPage = new MainPage(webDriver);
        bingoPage = new BingoPage(webDriver);

    }

    @AfterMethod
    public void quit() {
        webDriver.quit();
    }

    public void setBrowser( ) {
        if ("chrome".equals(browser)) {
            try {
                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability("browserName", "chrome");
                capabilities.setCapability("browserVersion", "100.0");
                capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                        "enableVNC", true,
                        "enableVideo", true
                ));

                webDriver = new RemoteWebDriver(
                        URI.create("http://localhost:8080/wd/hub").toURL(), //URL to selenoid
                        capabilities
                );

            } catch (MalformedURLException e) {

                e.printStackTrace();
            }
        }  else if("opera".equals(browser)) {
            try{
                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability("browserName", "opera");
                capabilities.setCapability("browserVersion", "85.0");
                capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                        "enableVNC", true,
                        "enableVideo", true
                ));
                webDriver = new RemoteWebDriver(
                        URI.create("http://localhost:8080/wd/hub").toURL(), //URL to selenoid
                        capabilities
                );
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
    }
}
