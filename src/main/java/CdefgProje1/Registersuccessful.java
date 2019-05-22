package CdefgProje1;

import org.openqa.selenium.By;

public class Registersuccessful extends Utils

    {
        LoadProp loadProp = new LoadProp();
        By registersuccessfulmessage=By.xpath("//div[@class=\"result\"]");

        public void verifyUserSeeSuccessfulMessage(){
            clickElemenetBY(registersuccessfulmessage);
        }
    }
