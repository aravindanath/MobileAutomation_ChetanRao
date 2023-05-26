package day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC01 extends BaseClass {


    @Test
    public void tc01() throws InterruptedException {
        Thread.sleep(25000);
        try {
            driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Lets Go Button\"]")).click();
        }catch (Exception e){
            e.printStackTrace();
        }
        Thread.sleep(5000);
        driver.findElement(By.id("com.mu.muclubapp.staging:id/bottom_button")).click();
    }


}
