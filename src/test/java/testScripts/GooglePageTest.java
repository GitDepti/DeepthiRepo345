package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class GooglePageTest {
  @Test
  public void seleniumSearch() {
	  //ChromeOptions options = new ChromeOptions();
	  //options.setBrowserVersion("120");
	 // WebDriver driver = new ChromeDriver(options);
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/login");
	  WebElement name = driver.findElement(By.id("username"));
	  name.sendKeys("tomsmith");
	  WebElement pswd = driver.findElement(By.id("password"));
	  pswd.sendKeys("SuperSecretPassword!");
	  WebElement btnLogin = driver.findElement(By.tagName("button"));
	  
	  //WebElement btnLogin =driver.findElement(By.className("radius"));
	  btnLogin.click();
	  driver.findElement(By.partialLinkText("Elemental")).click();
	  driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in')"));
	  //driver.findElement(By.linkText("Elemental Selenium")).click();
	
	 driver.close();
	  
	  driver.navigate().back();
	  System.out.println(driver.getTitle());
	
	  System.out.println(driver.getCurrentUrl());
	  
	  driver.navigate().forward();
	  System.out.println(driver.getCurrentUrl());
	  
  }
}
