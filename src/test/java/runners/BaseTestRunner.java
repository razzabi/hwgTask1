package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import utilities.ThreadManager;

import java.io.IOException;

public class BaseTestRunner extends AbstractTestNGCucumberTests
{
    @BeforeClass(alwaysRun=true)
    @Parameters({"chrome"})
    public void beforeClass(String browserName) throws IOException, InterruptedException
    {
        ThreadManager.setBrowser(browserName);
    }
}
