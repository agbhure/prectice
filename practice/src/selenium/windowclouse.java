package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowclouse {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String windowID = driver.getWindowHandle();
		System.out.println(windowID);//20FBFA4507ACD0A7758A4B31B494EDEC
		                             //4E2EDDEE2FB3D8235CA029FD66890335
	driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
	Set<String> winIDs = driver.getWindowHandles();
	System.out.println(winIDs);
	Iterator<String> it = winIDs.iterator();
	String parentID = it.next();
	String chieldID = it.next();
	System.out.println("parent ID is"+parentID);
	System.out.println("Chield ID is"+chieldID);
	for(String win:winIDs) {
		driver.switchTo().window(windowID).getTitle();
		
	}
	}

}
