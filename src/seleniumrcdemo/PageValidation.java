package seleniumrcdemo;

import org.junit.Assert;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class PageValidation {

	static Selenium selenium = new DefaultSelenium("localhost", 4444,"*iexplore ", "https://www.quora.com/");
	public static void main(String[] args) {
		
		selenium.start();// to start the selenium
		selenium.open("/");
		selenium.windowMaximize();
		facebookLogin();

	}
	public static void facebookLogin() {
		/*
		 * defining all the elements in Quora.com
		 */
		String quoraLogo= "class=NetworkLogo";
		String tagLine ="class=tagline";
		String googleLinkText= "class=google_button submit_button";
		String facebookLinkText="class=facebook_button_text";
		String disclaimerText="class=tos_disclaimer";
		String aboutLink="class=about";
		String prizesLink="class=prizes";
		String careersLink="class=careers";
		String siteMapLink="class=sitemap";
		String privacyLink="class=privacy";
		String termsLink="class=tos";
		String contactLink="class=feedback";
		/*
		 * getting the text values and printing them 
		 */
		System.out.println("Printing quora logo text: "+selenium.getText(quoraLogo));
		System.out.println("Printing Tagline below Quora logo: "+selenium.getText(tagLine));
		System.out.println("printing google link text : "+selenium.getText(googleLinkText));
		System.out.println("printing facebook link text : "+selenium.getText(facebookLinkText));
		System.out.println("printing disclaimer link text : "+selenium.getText(disclaimerText));
		System.out.println("printing About link text : "+selenium.getText(aboutLink));
		System.out.println("printing Prizes link text : "+selenium.getText(prizesLink));
		System.out.println("printing careers link text : "+selenium.getText(careersLink));
		System.out.println("printing siteMap link text : "+selenium.getText(siteMapLink));
		System.out.println("printing terms link text : "+selenium.getText(termsLink));
		System.out.println("printing contact link text : "+selenium.getText(contactLink));
		System.out.println("printing privacy link text : "+selenium.getText(privacyLink));

		//validating for Quora logo text
		Assert.assertTrue(selenium.getText(quoraLogo).equals("Quora")); 
		
		//validating for tagline text
				Assert.assertTrue(selenium.getText(tagLine).equals("The best answer to any question")); 
				
		//validating for google link text
				Assert.assertTrue(selenium.getText(googleLinkText).equals("Continue with Google")); 
		//validating for facebook link text
				Assert.assertTrue(selenium.getText(facebookLinkText).equals("Continue with Facebook")); 
		//validating for disclaimer text
				Assert.assertTrue(selenium.getText(disclaimerText).equals(". By signing up you indicate that you have read and agree to the Terms of Service and Privacy Policy.")); 
		//validating for about link text
				Assert.assertTrue(selenium.getText(aboutLink).equals("About")); 
		//validating for prizes text
				Assert.assertTrue(selenium.getText(prizesLink).equals("Prizes")); 
		//validating for careers text
				Assert.assertTrue(selenium.getText(careersLink).equals("Careers")); 
		//validating for sitemap text
				Assert.assertTrue(selenium.getText(siteMapLink).equals("Sitemap")); 
		//validating for privacy text
				Assert.assertTrue(selenium.getText(privacyLink).equals("Privacy")); 
		//validating for terms text
				Assert.assertTrue(selenium.getText(termsLink).equals("Terms")); 
		//validating for contact us text
				Assert.assertTrue(selenium.getText(contactLink).equals("Contact")); 
		selenium.close();
	}

}
