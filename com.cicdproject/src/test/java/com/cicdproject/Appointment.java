package com.cicdproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Appointment {
  @Test
  public void test() {
	  System.setProperty("webdriver.chrome.driver","D:\\All Testing\\Browser files\\chromedriver\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://192.168.2.45/DrAppointment/ui.html");
	  String Title=driver.getTitle();
	  System.out.println(Title);
	  String url=driver.getCurrentUrl();
	  System.out.println(url);
	  driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	  driver.findElement(By.xpath("html/body/div[1]/article/form/input[1]")).sendKeys("umasai");
	  driver.findElement(By.xpath("html/body/div/article/form/input[2]")).sendKeys("umasai20@gmail.com");
	  driver.findElement(By.xpath("html/body/div/article/form/input[3]")).sendKeys("9490391360");
	  
	  WebElement ele=driver.findElement(By.xpath("html/body/div/article/form/select[1]"));
	  Select s=new Select(ele);
	  s.selectByVisibleText("Cardiology");
	  
	  WebElement eles=driver.findElement(By.xpath("html/body/div/article/form/select[2]"));
	  Select s1=new Select(eles);
	  s1.selectByVisibleText("Dr.Swetha");
	  
	  driver.findElement(By.xpath("html/body/div/article/form/textarea")).sendKeys("hiii,heello");
	  driver.findElement(By.xpath("html/body/div/article/form/input[5]")).click();
	 
  }
}
