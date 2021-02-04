package page;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public abstract class BasePage {

    protected AppiumDriver appiumDriver;

        public BasePage(AppiumDriver appiumDriver) {
            PageFactory.initElements(new AppiumFieldDecorator(appiumDriver,
              /*searchContext is a WebDriver or WebElement
              instance */
                            15, //default implicit waiting timeout for all strategies
                            TimeUnit.SECONDS),
                    appiumDriver //an instance of PageObject.class
            );
            this.appiumDriver = appiumDriver;
        }
}
