package steps;

import io.appium.java_client.AppiumDriver;
import page.AuthPage;


public abstract class AbstractBaseStep {

    protected AppiumDriver appiumDriver;
    AuthPage authPage;

    AbstractBaseStep(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
        authPage = new AuthPage(appiumDriver);

    }
}
