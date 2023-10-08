package imported;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prilntAllLinks {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		int size = allLinks.size();
		for(int i=0;i<size;i++) {
			String link = allLinks.get(i).getText();
			System.out.println(link);
		}
		driver.close();
		
	}

}
