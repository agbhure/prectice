package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/agbhu/OneDrive/Desktop/drivers/fileupload.html");
		Thread.sleep(2000);
		File f=new File("./data/resume.docs.docx");
		String abs = f.getAbsolutePath();
		driver.findElement(By.id("cv")).sendKeys(abs);
	}

}
