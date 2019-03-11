package day06;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ZouYe4 {
	static WebDriver driver;
	static String u1;
	@BeforeClass
	public void stp1() {
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		driver=new ChromeDriver();
		u1="http://localhost:8080/shop1";
	}
	@Test
	public void a1() {
		driver.get(u1);
		driver.findElement(By.xpath("/html/body/center[6]/table/tbody/tr/td/a")).click();
	}
	@Test(dependsOnMethods="a1")
	public void b2() {
		String p1="http://localhost:8080/shop1/admin/index.jsp";
		Set<String>w=driver.getWindowHandles();
		for(String handler:w) {
			driver.switchTo().window(handler);
			String p2=driver.getCurrentUrl();
			if(p1.equals(p2)) {
				driver.findElement(By.name("a_name")).sendKeys("admin");
				driver.findElement(By.name("a_pass")).sendKeys("admin");
				driver.findElement(By.name("submit2")).click();
				
			}
		}
	}
	@Test(dependsOnMethods="b2")
	public void c3() {

		String p3="http://localhost:8080/shop1/admin/login2?op=login";
		Set<String>q=driver.getWindowHandles();
		for(String handle:q) {
			driver.switchTo().window(handle);
			String p4=driver.getCurrentUrl();
			if(p3.equals(p4)) {
				driver.switchTo().frame(0);
				driver.switchTo().frame("Left");
				driver.findElement(By.xpath("/html/body/table/tbody/tr[13]/td/span/a")).click();
	            driver.switchTo().parentFrame();
	            driver.switchTo().frame("Rigth");
				driver.findElement(By.name("t_name")).sendKeys("123");
				driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr[2]/td[3]/input[1]")).click();
				driver.switchTo().parentFrame();
				driver.switchTo().frame("Left");
				driver.findElement(By.xpath("/html/body/table/tbody/tr[9]/td/span/a")).click();
				driver.switchTo().parentFrame();
				driver.switchTo().frame("Rigth");
				driver.findElement(By.xpath("/html/body/center/table/tbody/tr[2]/td[6]/span/a")).click();
				driver.switchTo().parentFrame();
				driver.switchTo().frame("Left");
				driver.findElement(By.xpath("/html/body/table/tbody/tr[16]/td/span/a")).click();
				driver.switchTo().parentFrame();
				driver.switchTo().frame("Rigth");
				driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr[5]/td/input[1]")).click();
			}
		}
	}
	@AfterClass
	public void stp2() {
		
	}
}
