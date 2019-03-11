package day04;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Thse {
	@Test
	public void ppp() throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	String u="https://www.baidu.com";
	driver.get(u);
	/*Robot aa=new Robot();
	aa.keyPress(KeyEvent.VK_ALT);
	Thread.sleep(2000);
	aa.keyPress(KeyEvent.VK_F4);
	Thread.sleep(1000);
	aa.keyRelease(KeyEvent.VK_ALT);
	aa.keyRelease(KeyEvent.VK_F4);*/
	/*Actions sele2=new Actions(driver);
	sele2.keyDown(Keys.ALT);
	sele2.keyDown(Keys.F4);
	//Thread.sleep(1000);
	sele2.keyUp(Keys.ALT);
	sele2.keyUp(Keys.F4);*/
	}
}
