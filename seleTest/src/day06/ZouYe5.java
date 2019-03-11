package day06;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ZouYe5 {
	static WebDriver driver;
	static String u1;
	@BeforeClass
	public void stp1() {
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		driver=new ChromeDriver();
		u1="http://localhost:8080/shop1/admin/login2?op=login";
	}
	@Test
	public void a1() {
		driver.get(u1);
		driver.switchTo().frame("Left");
		driver.findElement(By.xpath("/html/body/table/tbody/tr[13]/td/span/a")).click();	
	}
}
