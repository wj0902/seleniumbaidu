package day07;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HaiJia {
	@Test
	public void stpp1() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //driver是浏览器变量名
		//.implicitlyWait(30, TimeUnit.SECONDS)
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		String u0="file:///E:/%E8%BD%AF%E4%BB%B6%E6%96%87%E4%BB%B6/seleum%E6%96%87%E4%BB%B6/%E9%A1%B5%E9%9D%A2/index.html";
		driver.get(u0);
		driver.findElement(By.id("user")).sendKeys("王军爱乐思琪");
		WebElement s1=driver.findElement(By.name("select"));
		Select s=new Select(s1);
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByValue("vivo");
		driver.findElement(By.className("Saab")).click();
		driver.findElement(By.name("checkbox4")).click();
		driver.findElement(By.xpath("//*[@id=\"alert\"]/input")).click();
		Alert s3=driver.switchTo().alert();
		Thread.sleep(2000);
		s3.accept();
		driver.findElement(By.xpath("//*[@id=\"confirm\"]/input")).click();
		Alert s4=driver.switchTo().alert();
		s4.dismiss();
		s4.accept();
		WebElement jian=driver.findElement(By.id("load"));
		String wen="E://a.txt";
		jian.sendKeys(wen);
		driver.manage().window().maximize();
		WebElement s5=driver.findElement(By.xpath("//*[@id=\"action\"]/input"));
		Actions s6=new Actions(driver);
		s6.moveToElement(s5).perform();
		WebElement s7=driver.findElement(By.xpath("//*[@id=\"wait\"]/input"));
		Actions s8=new Actions(driver);
		s8.doubleClick(s7).perform();
		WebElement ss1=driver.findElement(By.xpath("/html/body/div/table/tbody/tr[14]/td[2]"));	
		List<WebElement> option=ss1.findElements(By.tagName("option"));
		Actions ss2=new Actions(driver);//从第一个开始
		//ss2.sendKeys(Keys.CONTROL).click(option.get(2)).click(option.get(3)).perform();
		ss2.keyDown(Keys.CONTROL).click(option.get(2)).click(option.get(3)).perform();
		driver.switchTo().frame("aa");
		String ss3=driver.findElement(By.xpath("/html/body/div")).getText();
		System.out.println(ss3);
		driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent();
	} 
}
