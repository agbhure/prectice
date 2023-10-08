package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/agbhu/OneDrive/Desktop/fileupload.html");
		Thread.sleep(3000);
		File f=new File("./data/resume.docs.docx");
		String abs = f.getAbsolutePath();
		driver.findElement(By.id("cv")).sendKeys(abs);
	}

}
