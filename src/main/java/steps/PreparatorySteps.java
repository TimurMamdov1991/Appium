package steps;

import io.appium.java_client.AppiumDriver;

public class PreparatorySteps extends AbstractBaseStep {

    public PreparatorySteps(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    // Авторизация
    public void authorizationIn(String login){
        authPage.authorization(login);
    }
}
