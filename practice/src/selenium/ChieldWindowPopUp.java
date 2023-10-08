package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChieldWindowPopUp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Continue with Google']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
	Set<String> allwh = driver.getWindowHandles();
	for(String wh:allwh) {
		System.out.println(wh);
		driver.quit();
	}
	}

}
