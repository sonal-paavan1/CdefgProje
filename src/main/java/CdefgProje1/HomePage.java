package CdefgProje1;

import org.openqa.selenium.By;

public class HomePage extends Utils{

    private By _registerLink =By.linkText("Register");
    private By _computerLink =By.linkText("Computers");
    private By _electronicsLink =By.linkText("Electronics");
    private By _apparelLink =By.linkText("Apparel");

    public void clickOnRegisterButton() {

        clickElemenetBY(_registerLink);
        clickElemenetBY(_computerLink);
        clickElemenetBY(_electronicsLink);
        clickElemenetBY(_apparelLink);

    }
}

