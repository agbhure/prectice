package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(5000);
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));		
		Select s=new Select(month);
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByValue("4");
		Thread.sleep(3000);
		s.selectByVisibleText("Aug");
		System.out.println(s.isMultiple());
		WebElement first = s.getFirstSelectedOption();
		String text = first.getText();
		System.out.println(text);
		String selectall = s.getWrappedElement().getText();
		System.out.println(selectall);
	}

}
