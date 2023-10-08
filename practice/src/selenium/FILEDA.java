package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.batik.apps.rasterizer.Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FILEDA {
public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.selenium.dev/");
	Thread.sleep(5000);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_P);
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(5000);
	r.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(5000);
	r.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(5000);
	r.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(5000);
	r.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(5000);
	r.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(5000);
	r.keyPress(KeyEvent.VK_1);
	r.keyPress(KeyEvent.VK_MINUS);
	r.keyPress(KeyEvent.VK_2);
	Thread.sleep(5000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	r.keyPress(KeyEvent.VK_B);
	Thread.sleep(5000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	
	
}
}
