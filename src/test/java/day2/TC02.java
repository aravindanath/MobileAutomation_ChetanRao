package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.*;
import java.util.List;

public class TC02 extends BaseClass {


    @Test
    public void tc01() throws InterruptedException, IOException {

        Thread.sleep(2000);

       String text =  driver.getPageSource();

        String path = System.getProperty("user.dir")+ File.separator+"source.xml";

        File file = new File(path);
        if(file.exists()) {
            System.out.println("File exists");
        }else {
            file.createNewFile();
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        bw.write(text);
        bw.flush();
        bw.close();
    }


}
