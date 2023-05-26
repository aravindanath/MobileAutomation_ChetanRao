package day2;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.WebDriver;

public class Generic {

    public static void scrollAndClick(AndroidDriver driver, String text){
        String str = "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().textContains(\""+text+"\"));";
        driver.findElementByAndroidUIAutomator(str).click();
    }


    public static void scrollTOText(AndroidDriver driver, String text){
        String str = "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().textContains(\""+text+"\"));";
        driver.findElementByAndroidUIAutomator(str);
    }




}
