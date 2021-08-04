package testrunner;

import com.codeborne.selenide.Configuration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import steps.AccountSteps;
import steps.CurrencySteps;
import steps.SearchFindSteps;

@RunWith(Suite.class)
@Suite.SuiteClasses({AccountSteps.class, CurrencySteps.class,
        SearchFindSteps.class})
public class TestRunner {
    //    private static final Logger LOGGER = LogManager.getLogger(TestRunner.class);
    @BeforeClass
    public void setUp ()  {

//        LOGGER.info("---------------------------Started all test---------------------------");
            Configuration.browser = "chrome";
            ChromeOptions options = new ChromeOptions();
            options.addArguments("incognito");
            Configuration.browserCapabilities = new DesiredCapabilities();
            Configuration.browserCapabilities.setCapability(ChromeOptions.CAPABILITY, options);
            Configuration.startMaximized = true;
            Configuration.timeout = 15000;
            Configuration.holdBrowserOpen = true;
            Configuration.headless = false;

        }


    @AfterClass
    public static void closeDriver() {
//        Driver.destroy();
//        LOGGER.info("---------------------------Finished all test---------------------------");
    }

}

