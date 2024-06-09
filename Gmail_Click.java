package Batch40;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Gmail_Click 
{
@Test
public void testcase1()
	{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");	
	//driver.findElement(By.linkText("Gmail")).click();
	WebElement e1=	driver.findElement(By.linkText("Gmail"));
	
	Point p1=		e1.getLocation();
			System.out.println(p1.getX());
			System.out.println(p1.getY());

//	WebElement pressenceofcomponent1=	driver.findElement(By.xpath("(//div[@class='dropdown__label'])[1]"));
//	Assert.assertEquals(driver.getTitle(), "Gmail: Private and secure email at no cost | Google Workspace");
//	Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com/gmail/about/");
//Assert.assertTrue(pressenceofcomponent1.isDisplayed());
	
	
	
	}
}
