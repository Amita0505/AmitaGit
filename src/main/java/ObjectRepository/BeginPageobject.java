package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class BeginPageobject  {

	public WebDriver driver;

By beginclick= By.xpath("//button[@data-testid='lets_begin']");
By mail = By.name("email");
By password= By.cssSelector("input[type='password']");
By next=By.xpath("//button[@data-testid='next_button']");
By select=By.xpath("//*[contains(@class,'Dropdown-control')]");
By profile= By.xpath("//div[text()='Brother']");

public BeginPageobject(WebDriver driver) {
	
	this.driver=driver;
	// TODO Auto-generated constructor stub
}


public WebElement Begin()
{
	return driver.findElement(beginclick);
}


public WebElement Email()
{
	return driver.findElement(mail);
}


public WebElement Pwd()
{
	return driver.findElement(password);
}


public WebElement NextButton()
{
	return driver.findElement(next);
}

public WebElement Dropdown()
{
	return driver.findElement(select);

}

public WebElement ValueSelection()
{
	return driver.findElement(profile);

}

}







