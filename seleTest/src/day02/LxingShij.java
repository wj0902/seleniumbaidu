package day02;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LxingShij {
	@Test
	public void op() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String u="file:///E:/%E8%BD%AF%E4%BB%B6%E6%96%87%E4%BB%B6/seleum%E6%96%87%E4%BB%B6/%E9%A1%B5%E9%9D%A2/autotest.html";
		driver.get(u);
		WebElement name=driver.findElement(By.name("account"));
		name.sendKeys("wj");
		WebElement pwd=driver.findElement(By.id("passwordID"));
		pwd.sendKeys("123456");
		WebElement sele=driver.findElement(By.id("areaID"));
		Select s2=new Select(sele);
		s2.selectByValue("beijing");  //用value等于的值
		Thread.sleep(1500);
		s2.selectByVisibleText("陕西省");  //用值
		driver.findElement(By.id("sexID2")).click();
		driver.findElement(By.id("u1")).click();
		driver.findElement(By.id("u2")).click();
		driver.findElement(By.id("u3")).click();
		String wenjian="E:\\a.txt";  //这种要两个\，/这种只要一个
		WebElement up=driver.findElement(By.name("file"));
		up.sendKeys(wenjian);
		driver.findElement(By.id("buttonID")).click();
		Alert p1=driver.switchTo().alert();
		p1.accept();
		
	}
}
