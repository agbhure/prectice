import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
	
	driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
	String ptittle = driver.getTitle();
	System.out.println(ptittle);
		Set<String> wt = driver.getWindowHandles();	
		Iterator<String> windowID = wt.iterator();
		String pid = windowID.next();
		String cid = windowID.next();
		driver.switchTo().window(cid);
		String ctittle = driver.getTitle();
		System.out.println(ctittle);
		
		
		
		

	}

}
