package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class slvlistbox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/agbhu/OneDrive/Desktop/hotel.html");
		WebElement slvlistbox = driver.findElement(By.id("slv"));
		Select s=new Select(slvlistbox);
		s.deselectByIndex(0);
		Thread.sleep(2000);
		s.deselectByVisibleText("bisibele bath");
		Thread.sleep(2000);
		s.deselectByVisibleText("selected");
		Thread.sleep(2000);
		s.deselectByVisibleText("chole bature");
		Thread.sleep(2000);
		s.deselectByVisibleText("vangi bath");
		Thread.sleep(2000);
		s.deselectByVisibleText("pulivogare");
		Thread.sleep(2000);
		s.deselectByVisibleText("chapathi");
		Thread.sleep(2000);
		s.deselectByVisibleText("veg biryani");
		
	}

	
}
