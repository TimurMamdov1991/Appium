package AlfaMobail;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.TestCase;
import org.openqa.selenium.remote.DesiredCapabilities;
import steps.ActionStep;
import steps.AssertsStep;
import steps.PreparatorySteps;

import java.net.URL;

public class CoreTestCase extends TestCase {

    protected AppiumDriver appiumDriver;
    protected PreparatorySteps preparatorySteps;
    protected ActionStep actionSteps;
    protected AssertsStep assertionSteps;

    private static String AppiumURL = "http://127.0.0.1:4723/wd/hub";


    @Override
    protected void setUp() throws Exception
    {
        super.setUp();
        DesiredCapabilities capabilities = new DesiredCapabilities();

                capabilities.setCapability("platformName","Android");
        capabilities.setCapability("deviceName","AndroidTestDevice");
        capabilities.setCapability("platformVersion","9.0");
        capabilities.setCapability("automationName","Appium");
        capabilities.setCapability("appPackage","ru.alfabank.mobile.android");
        capabilities.setCapability("appActivity",".authorization.presentation.activity.SignUpBannerActivity");
        capabilities.setCapability("app","A:/JavaAppiupAutomation/apks/alfamobile-11.23.00-11.23.00.apk");


        actionSteps = new ActionStep(appiumDriver);
        assertionSteps = new AssertsStep(appiumDriver);
        preparatorySteps = new PreparatorySteps(appiumDriver);
        appiumDriver = new AndroidDriver(new URL(AppiumURL), capabilities);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        appiumDriver.quit();
    }

}
