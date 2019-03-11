package day02;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Zye {
	@Test
	public void aaa() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String u="file:///E:/%E8%BD%AF%E4%BB%B6%E6%96%87%E4%BB%B6/seleum%E6%96%87%E4%BB%B6/%E9%A1%B5%E9%9D%A2/autotest.html";
		driver.get(u);
		WebElement user=driver.findElement(By.name("account"));
		user.sendKeys("wj");
		WebElement pwd=driver.findElement(By.name("password"));
		pwd.sendKeys("123456");
		WebElement dqu=driver.findElement(By.id("areaID"));
		Select s=new Select(dqu);
		s.selectByIndex(2);
		driver.findElement(By.id("sexID1")).click();
		driver.findElement(By.id("u1")).click();
		driver.findElement(By.id("u2")).click();
		driver.findElement(By.id("u3")).click();
		String wenjian="E:\\软件文件\\第一主题.txt";
		WebElement wen=driver.findElement(By.name("file"));
		wen.sendKeys(wenjian);
		driver.findElement(By.className("u16")).click();
		Alert p2=driver.switchTo().alert();
		Thread.sleep(1500);
		p2.accept();
		
	}
}
