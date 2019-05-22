package CdefgProje1;

import javafx.scene.input.DataFormat;
import org.openqa.selenium.By;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RegisterPage  extends Utils{

    LoadProp loadProp = new LoadProp();


    private By _firsName = By.id("FirstName");
    private By _lastName = By.id("LastName");
    private By _email = By.id("Email");
    private By _password = By.id("Password");
    private By _confirmPassword = By.id("comfirmPassword");
    private By _registerButton = By.id("registerButton");

    //private static String timeStamp = CreateTimeStamp();                                   //createTimeStamp();//23

    public void verifyUserIsonRegisterPage() {
        assertURL("register");
    }
    public void useEnterRegistersIsOnRegisterPage(){
        assertURL("register");

    }
    public void userEntersRegistratoinDetails()
    {
            //Register for new user
            clickElemenetBY(_registerButton);

            //select  gender by id
            clickElemenetBY(By.id("gender-female"));

            //Enter  name by xpath
            enterText(_firsName,loadProp.getProperty("firstname"));

            //Enter the last name by xpath
            enterText(_lastName,loadProp.getProperty("lastname"));

            //select birthday
            selecTestByvalue(By.name("DateOfBirthday"),loadProp.getProperty("DOBDay"));

            //select birthday month
            selecTestByvalue(By.name("DateOfMonth"),"3");

            //select  birthday year
             selecTestByvalue(By.name("DateOfYear"),loadProp.getProperty("DoBDay"));

            DateFormat dateFormat = new SimpleDateFormat("yyyymmddhmmss");
            Date date = new Date();

            String daystamp = dateFormat.format(date);
            String email = "goldydev"+daystamp+"yahoo.com";
            driver.findElement(By.id("Email")).sendKeys(email);
            System.out.println(email);

            //Enter company name
            enterText(By.xpath("//input[@id='Company']"),"london ltd");

            //Enter  password
            enterText(By.id("Password"),loadProp.getProperty("password"));


            //confirm  password
            enterText(By.id("ConfirmPassword"),loadProp.getProperty("ConfirmPassword"));

            //click on register button
            clickElemenetBY(_registerButton);

            clickElemenetBY(By.xpath("//a[@class='ico-logout']"));


    }


    }


