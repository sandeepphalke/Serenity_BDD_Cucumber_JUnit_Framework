package pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class HomePage extends PageObject{
	
	@Step
	public void clickOnDonateButton()
	{
		$(By.xpath("//a[text()='Donate']")).waitUntilEnabled().waitUntilClickable().click();
	}
	
	@Step
	public void clickOnBecomeADonarButton()
	{
		$(By.xpath("//a[text()='Become a donor']")).waitUntilClickable().click();
	}

}
