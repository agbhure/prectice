package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/agbhu/OneDrive/Desktop/hotel.html");
	 WebElement mtrlistbox = driver.findElement(By.id("mtr"));
	Select s=new Select(mtrlistbox);
	s.selectByIndex(0);
	Thread.sleep(2000);
	s.selectByValue("d");
	Thread.sleep(2000);
	s.selectByVisibleText("voda");
	Thread.sleep(2000);
	s.deselectByIndex(0);
	Thread.sleep(2000);
	s.deselectByValue("d");
	Thread.sleep(2000);
	s.deselectByVisibleText("voda");
	Thread.sleep(2000);
	;
	}

}
