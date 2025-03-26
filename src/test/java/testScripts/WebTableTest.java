package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableTest {
  @Test
  public void dynamicWebTable() {
  WebDriver driver=new ChromeDriver();
  driver.get("https://testautomationpractice.blogspot.com/");
  List<WebElement> items = driver.findElements(By.xpath("//td[contains(text(), 'Master In Selenium')]//following-sibling::td"));
  List<WebElement> items1 = driver.findElements(By.xpath("//td[contains(text(), '2000')]//preceding-sibling::td[3]"));
  System.out.println("Details of book are ");
  for (WebElement item:items1) {
	  System.out.println(item.getText());
  }
  } 
}
