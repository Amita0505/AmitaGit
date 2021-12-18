package ObjectRepository;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	import Resource.Basefile;

	public class Panel2object extends Basefile {

	public WebDriver driver;




		
	By firstname= By.xpath("//*[@data-testid='first_name']");
	By lastname = By.cssSelector("*[data-testid='last_name']");
	By day= By.xpath("//*[contains(@class,'day_selector')]");
	By dayselector= By.xpath("//*[text()='02']");
	By month= By.xpath("//*[contains(@class,'month_selector')]");
	By monthselector= By.xpath("//*[text()='May']");
	By year= By.xpath("//*[contains(@class,'year_selector')]");
	By yearselector= By.xpath("//*[text()='1992']");
	By community= By.xpath("//*[contains(@class,'community_selector')]");
	By communityselector= By.xpath("//*[text()='Hindu']");
	By language= By.xpath("//div[contains(@class,'mother_tongue_selector ')]");
	By languagevalue = By.xpath("//div[text()='Marathi']");
	By sign = By.xpath("//button[text()='Sign up']");


	public Panel2object(WebDriver driver) {
		// TODO Auto-generated constructor stub
	   
		 this.driver=driver;
	
	}

	public WebElement First_name()
	{
		return driver.findElement(firstname);

	}

	public WebElement Last_name()
	{
		return driver.findElement(lastname);

	}

	public WebElement Dob_Day()
	{
		return driver.findElement(day);

	}

	public WebElement DayValue()
	{
		return driver.findElement(dayselector);

	}

	public WebElement Dob_Month()
	{
		return driver.findElement(month);

	}

	public WebElement MonthValue()
	{
		return driver.findElement(monthselector);

	}

	public WebElement Dob_Year()
	{
		return driver.findElement(year);

	}
	public WebElement YearValue()
	{
		return driver.findElement(yearselector);

	}
	public WebElement Religion()
	{
		return driver.findElement(community);

	}
	public WebElement ReligionValue()
	{
		return driver.findElement(communityselector);
	}
  

	public WebElement Languagedropdown()
	{
		return driver.findElement(language);
	}

	public WebElement Language_Selected()
	{
		return driver.findElement(languagevalue);
	}

	
	public WebElement Signup_button()
	{
		return driver.findElement(sign);
	}





	}

