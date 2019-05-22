package CdefgProje1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CurrencyChange extends Utils {
    public void priceCurrency(){
        //code to perform hovering task on Apparels
        clickElemenetBY(By.xpath("/html/body/div[6]/div[3]/div[2]/div[2]/div/div[1]/h1"));

        //click on Clothing
        clickElemenetBY(By.xpath("/html/body/div[6]/div[3]/div[2]/div[2]/div/div[1]/h1"));

        //click on Currency
        clickElemenetBY(By.xpath("//*[@id=\"customerCurrency\"]"));

        //click on Euro
        selecTestByvalue(By.xpath("//*[@id=\"customerCurrency\"]"),"Euro");

        //Click on Sort Currency
        clickElemenetBY(By.xpath("//*[@id=\"customerCurrency\"]"));

        //Click on USD
        selecTestByvalue(By.xpath("//*[@id=\"customerCurrency\"]"),"US Dollar");

        //Check for $ value
        boolean present = false;
        List<WebElement> activeList = driver.findElements(By.className("actual-price"));

        for (WebElement element : activeList) {
            String str = element.getText();

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == '$') {
                    present = true;

                }
            }
            if (present == true) {
                System.out.println("$" + "is present in the array list");
            } else {
                System.out.println("The $ is not present at the array list");
            }
        }
    }
}




