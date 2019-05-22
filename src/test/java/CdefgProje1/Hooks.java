package CdefgProje1;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.sun.deploy.cache.Cache.copyFile;
import static javafx.scene.input.KeyCode.P;

public class Hooks extends BasePage {
    BrowserSelected browserSelected=new BrowserSelected();
    static String timeStamp=new SimpleDateFormat("dd.mm.yy.hh.mm.ss").format(new Date());

    @Before
    public void setUpBrowser() {
        browserSelected.setUpBrowser();
        driver.manage().window().fullscreen();
        driver.get("https://demo.nopcommerce.com/");
    }

    @After
    public void closeBrowse(Scenario scenario)throws IOException {
        if (scenario.isFailed()){
            String screenshotName = scenario.getName().replaceAll("[*,:?!]","")+timeStamp+".png";
            try {
                File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                File destinationPath = new File(System.getProperty("user.dir") + "/target/cucumber-reports/extent-reports/screenshots/" + screenshotName);
                copyFile(sourcePath, destinationPath);
                scenario.write("!!!!!!......Scenario Failed....!!!!!! please see attached screenshot for the error/issue");
                scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
            }catch (IOException e){

            }
        }
        driver.close();

    }
}

