package seleniumrcdemo;

import org.junit.Assert;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class FacebookLogin {

	static Selenium selenium = new DefaultSelenium("localhost", 4444,"*iexplore ", "https://www.facebook.com/login/");
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		selenium.start();// to start the selenium
		selenium.open("/");
		selenium.windowMaximize();
		facebookLogin();
	}
	
	public static void facebookLogin() throws Exception{
		String email = "edureka@gmail.com";
		selenium.type("id=email", ""); // making username text box empty
		selenium.type("id=email", email);//entering username
		selenium.type("id=pass", ""); // making password text box empty
		selenium.type("id=pass", "testing123"); // entering password 
		System.out.println(selenium.getValue("//input[@id='email']"));
		// validating username text given is present or not
		Assert.assertTrue(selenium.getValue("//input[@id='email']").equals(email)); 
		selenium.close();
	}
}
