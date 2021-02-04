package steps;

import io.appium.java_client.AppiumDriver;
import org.junit.Assert;

public class AssertsStep extends AbstractBaseStep{
    public AssertsStep(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    //Проверка логина
    public void assertNameClient(){
        String article_text = authPage.findName();
        Assert.assertEquals(
                "Имя владельца",
                "Мелентий",
                article_text
        );
    }

}
