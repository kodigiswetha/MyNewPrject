package generic_library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ReadTheDatFromExternalFile {
WebDriver driver;
public String get_Tittle() {
	String title=driver.getTitle();
	return title;
	
}
public String getCurrent_url() {
	String Current_url=driver.getTitle();
	return Current_url ;
}
public void click(WebElement element_click)
{
	element_click.click();
}
public void selectDropDownValue() {
	Select select=new Select(null);
}
public void selectDropdownbyValue(WebElement dropdown,String value)

{
	Select select=new Select(dropdown);
	select.selectByValue(value);
}
public void selectByVisibleText(WebElement dropdown,String visibletext)
{
	Select select=new Select(dropdown);
	select.selectByVisibleText(visibletext);
}
public void selectByIndex(WebElement dropdown,String index)
{
	Select select=new Select(dropdown);
	select.selectByIndex(0);
}
public void actionClick(WebElement element_Click)
{
	Actions ac=new Actions((WebDriver) element_Click);
			ac.click();
}
public void DoubleClick(WebElement Double_click)
{
	Actions ac=new Actions( (WebDriver) Double_click);
	ac.doubleClick();
}
public void contextClick(WebElement context_Click)
{
	Actions ac=new Actions((WebDriver) context_Click);
	ac.contextClick();
	
}
	public void movetoElement(WebElement movetoElement)
	{
		Actions ac=new Actions((WebDriver) movetoElement);
		ac.contextClick();
		
	}
	public void movetoLocation(WebElement movetoLocation)
	{
		Actions ac=new Actions((WebDriver) movetoLocation);
		ac.contextClick();
		
	}
	
	
public void ScrollToElement(WebElement ScrollToElement)
{
	Actions ac=new Actions((WebDriver) ScrollToElement);
	ac.scrollToElement(ScrollToElement);
	
}
}

