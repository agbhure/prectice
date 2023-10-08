package imported;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingfirstOpetion {
private static final WebElement WebElement = null;

public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/agbhu/OneDrive/Desktop/hotel.html");
	 List<WebElement> mtrlistbox = driver.findElements(By.id("mtr"));
Select s=new Select(WebElement);
	List<WebElement> alloption = s.getOptions();
}
}
