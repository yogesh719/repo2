package Selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IMDB
{   
	 static int i=0;
	
	

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
	    driver.get("https://www.imdb.com/chart/top/");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    Select Sort=new Select(driver.findElement(By.id("lister-sort-by-options")));
	    Thread.sleep(5000L);
	    for (int y=0;y<=4;y++)
	    {
	    Sort.selectByIndex(y);
	    List<WebElement> ls=driver.findElements(By.xpath("//tbody[@class='lister-list']"));

	    Thread.sleep(5000L);
	    
	    for(WebElement option :ls)	    	
	      {  	    	
	        System.out.println("a");
	        String St = option.getText();
	       
	        System.out.println(St);	
	      }
	   
	    } 
	   
	 }

}
