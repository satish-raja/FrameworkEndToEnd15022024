package testObjects;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import testComponents.BaseTest2;

public class LoginErrorValidationTest extends BaseTest2{
	WebDriver driver ;
	String userName ="satishraja@gmail.com" ,  password = "Raja1234" ;
	
	@Test
	public void loginErrorValidation()   {
		loginPage.LoginApplication( userName, password);
		Assert.assertEquals(loginPage.loginErrorValidation(),"Incorrect email or password.","Login Error Message Validation Failed. ");
		System.out.println("Login Error Message Validation Completed");
	}
}