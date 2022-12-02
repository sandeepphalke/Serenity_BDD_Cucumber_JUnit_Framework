package pages;

import org.openqa.selenium.By;

import junit.framework.Assert;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class CommonPage extends PageObject{
	

	@Step
	public void clickButton(String text)
	{
		$(By.xpath("//span[text()='"+text+"']")).waitUntilEnabled().click();
	}

	@Step
	public void validateError(String expectedError){
		
		Assert.assertEquals($(By.xpath("//small[@id='edit-monthly-wrapper-monthly-other-error']")).getText(), expectedError);	
	}
}
