package day2;

import day2.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TC01 extends BaseClass {


    @Test
    public void tc01() throws InterruptedException {
        driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();

        List<WebElement> country = driver.findElements(By.className("android.widget.TextView"));

        for(WebElement countryElement : country){
            System.out.println(countryElement.getText());
        }

        driver.findElement(By.xpath("//*[@text='Afghanistan']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();

        Generic.scrollAndClick(driver,"China");

    }


}
