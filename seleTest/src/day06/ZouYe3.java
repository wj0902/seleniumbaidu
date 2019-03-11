package day06;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ZouYe3 {
	static WebDriver driver;
	static String u1;
	@BeforeClass
	public void stup1() {
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		driver=new ChromeDriver();
		u1="http://localhost:8080/shop1";
	}
	@Test
	public void aaa1() {
		driver.get(u1);
		driver.findElement(By.name("c_name")).sendKeys("aaaaaa");
		driver.findElement(By.name("c_pass")).sendKeys("aaa");
		driver.findElement(By.xpath("/html/body/center[4]/table/tbody/tr/td[1]/table/tbody/tr[1]/td/form/table/tbody/tr[5]/td/input[1]")).click();
	}
	@Test (dependsOnMethods="aaa1")
	public void bbb2() throws InterruptedException {
		String p=driver.getWindowHandle();//获取当前句柄
		String p2="http://localhost:8080/shop1/message.jsp";//意见反馈网址
		driver.findElement(By.linkText("意见反馈")).click();
		Set<String>w=driver.getWindowHandles();
		for(String handle:w) {
			driver.switchTo().window(handle);
			String p3=driver.getCurrentUrl();
			if(p2.equals(p3)) {
				Thread.sleep(3000);
				driver.findElement(By.name("c_message")).sendKeys("123");
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/center[4]/form/table/tbody/tr[7]/td/input[1]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("/html/body/center[4]/form/table/tbody/tr[7]/td/input[2]")).click();
			
			}
		}
		driver.switchTo().window(p);
	}
	@AfterClass
	public void step2() {
		
	}
}
