package Testcases;

import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import ObjectRepository.BeginPageobject;
import ObjectRepository.Panel2object;
import Resource.Basefile;

public class Beginhomepage extends Basefile {
	
	public WebDriver driver;

	@Test
public void BeginPage() throws IOException
{
	
	driver = Utility();
	driver.get("https://www.marathishaadi.com/");
	driver.manage().window().maximize();
		
	BeginPageobject obj = new BeginPageobject(driver);
	ExcelData P1= new ExcelData(driver);
	obj.Begin().click();
	ArrayList data =P1.DataDriven("panelone");
	String mail= data.get(1).toString();
	String pd = data.get(2).toString();

	obj.Email().sendKeys(mail);
	obj.Pwd().sendKeys(pd);
	obj.Dropdown().click();
	obj.ValueSelection().click();
    obj.NextButton().click();
	Panel2object obj2= new Panel2object(driver);
    ExcelData2 P2= new ExcelData2(driver);
    ArrayList datapanel2= P2.DataDriven2("panel2");
    String Firstname= datapanel2.get(1).toString();
    String lastname= datapanel2.get(2).toString();
    obj2.First_name().sendKeys(Firstname);
    obj2.Last_name().sendKeys(lastname);
    obj2.Dob_Day().click();
    obj2.DayValue().click();
    obj2.Dob_Month().click();
    obj2.MonthValue().click();
    obj2.Dob_Year().click();
    obj2.YearValue().click();
    obj2.Religion().click();
    obj2.ReligionValue().click();
    System.out.println("Community is selected:"+obj2.ReligionValue().getText());
    System.out.println("Mother Tongue is already selected:"+obj2.Language_Selected().getText());
    obj2.Signup_button().click();
    


}}
	



