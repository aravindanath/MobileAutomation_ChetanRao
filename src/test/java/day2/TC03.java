package day2;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TC03 extends BaseClass {


    @Test
    public void tc01() throws InterruptedException, IOException {

        Thread.sleep(2000);
        driver.findElement(By.className("android.widget.EditText")).click();
//        driver.getKeyboard();

        driver.pressKey(new KeyEvent().withKey(AndroidKey.A));
        driver.pressKey(new KeyEvent().withKey(AndroidKey.R));
        driver.pressKey(new KeyEvent().withKey(AndroidKey.V));
        driver.pressKey(new KeyEvent().withKey(AndroidKey.I));
        driver.pressKey(new KeyEvent().withKey(AndroidKey.N));
        driver.pressKey(new KeyEvent().withKey(AndroidKey.D));
        Thread.sleep(2000);
        driver.hideKeyboard();


    }


}
