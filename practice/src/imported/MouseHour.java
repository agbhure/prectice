package imported;

import org.apache.xml.security.stax.ext.XMLSecurityConstants.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHour {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
	WebElement target = driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/i"));
	
target.click();
driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[7]/a")).click();
driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[33]/li[6]/a")).click();
}
}
