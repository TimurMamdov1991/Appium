package page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.By;

import java.util.List;


public class AuthPage extends BasePage {

    public AuthPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(xpath = "//*[@resource-id='ru.alfabank.mobile.android:id/sign_up_dev_setting']")
    AndroidElement navigateTo;

    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.CheckBox")
    AndroidElement checkBox;

    @AndroidFindBy(xpath = "//*[@text='Быстрая авторизация']")
    AndroidElement FastAuthorization;

    @AndroidFindBy(xpath = "//*[@text='Введите логин']")
    AndroidElement login;

    @AndroidFindBy(xpath = "//*[@resource-id='ru.alfabank.mobile.android:id/main_list_on_widgets_user_name']")
    AndroidElement name_client;

    @AndroidFindBy(xpath = "//*[@text='ОК']")
    AndroidElement clickOk;

    @AndroidFindBy(xpath = "//*[@class='android.widget.EditText'][1]")
    List<AndroidElement> confirmation;


    public void authorization(String string) {
        navigateTo.click();
        checkBox.click();
        FastAuthorization.click();
        login.sendKeys(string);
        clickOk.click();
        confirmation.get(1).sendKeys("0");
        confirmation.get(2).sendKeys("0");
        confirmation.get(3).sendKeys("0");
        confirmation.get(4).sendKeys("0");

    }

    public String findName(){
        name_client.getText();
        return null;
    }

}
