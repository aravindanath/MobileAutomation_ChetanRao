package day1;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    protected AndroidDriver driver= null;

    @BeforeClass
    public void setup() throws MalformedURLException {
           DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability("appActivity","com.manutd.ui.activity.SplashScreenActivity");
            desiredCapabilities.setCapability("appPackage","com.mu.muclubapp.staging");
            desiredCapabilities.setCapability("platformName","Android");
            desiredCapabilities.setCapability("automationName","UiAutomator2");
            desiredCapabilities.setCapability("deviceName","emulator-5554");
            desiredCapabilities.setCapability( "deviceName", "Pixel 6 API 31");
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"),desiredCapabilities);
            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        }
    }
