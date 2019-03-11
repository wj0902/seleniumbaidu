package day04;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tdong4 {
	@Test
	public void pp() throws IOException, AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		String u="file:///E:/%E8%BD%AF%E4%BB%B6%E6%96%87%E4%BB%B6/seleum%E6%96%87%E4%BB%B6/%E9%A1%B5%E9%9D%A2/index.html";
		/**
		 * 1.进入网址
		 * 2.点击ctrl+s
		 * 3.点击取消
		 */
		driver.get(u);	
		WebElement a=driver.findElement(By.id("user"));
		//a.sendKeys(Keys.CONTROL,"s");  拒绝
		//点击ctrl
		Robot aa=new Robot();
		aa.keyPress(KeyEvent.VK_CONTROL);//VK_CONTROL是点击ctrl键
		aa.keyPress(KeyEvent.VK_S);//VK_SL是点击s键
		Thread.sleep(2000);
		aa.keyRelease(KeyEvent.VK_S);//放开s键
		Thread.sleep(2000);
		aa.keyRelease(KeyEvent.VK_CONTROL);//放开ctrl键
		//aa.keyPress(KeyEvent.VK_TAB);
		//aa.keyPress(KeyEvent.VK_ESCAPE);
		//aa.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);
		aa.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);
	}

}
