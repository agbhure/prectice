package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class printAllOption {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/agbhu/OneDrive/Desktop/hotel.html");
	WebElement mtrlist = driver.findElement(By.id("mtr"));
	Select s=new Select(mtrlist);
	String wrapped = s.getWrappedElement().getText();
	System.out.println(wrapped);
}
}
