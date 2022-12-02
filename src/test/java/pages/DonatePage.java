package pages;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;

import junit.framework.Assert;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class DonatePage extends PageObject{
	
	@Step
	public void verifyPage(String pageTitle){	
		
		System.out.println(getTitle() + "----------------------------------------------------------");
		Assert.assertEquals(getTitle(), pageTitle);
	}
	
	@Step
	public void clickDonateLink() {
		
		$(By.xpath("//span[text()='Next']")).waitUntilClickable().click();
	}
	
	@Step
	public void selectOtherOption() {
		
		$(By.xpath("//div[@class='fieldset-wrapper']//div[1]//div[4]//label/span/i")).waitUntilClickable().click();
	}

	@Step
	public void enterAmount(String amount) {
	
		$(By.xpath("//input[@id='edit-monthly-wrapper-monthly-other']")).waitUntilEnabled().type(amount);
	}
	
}
