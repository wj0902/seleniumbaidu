package day06;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ZouYe2 {
	
	static WebDriver driver;
	static String u1;
	@BeforeClass
	public void setup3() {
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		driver=new ChromeDriver();
		u1="http://localhost:8080/shop1";
	}
	@Test
	public void a1() {
		driver.get(u1);
		driver.findElement(By.name("c_name")).sendKeys("aaaaaa");
		driver.findElement(By.name("c_pass")).sendKeys("aaa");
		driver.findElement(By.xpath("/html/body/center[4]/table/tbody/tr/td[1]/table/tbody/tr[1]/td/form/table/tbody/tr[5]/td/input[1]")).click();
	}
	@Test(dependsOnMethods="a1")//依赖性测试
	public void b2() throws InterruptedException {
		String p=driver.getWindowHandle();//获取当前句柄
		String p2="http://localhost:8080/shop1/message.jsp";//意见反馈网址
		driver.findElement(By.linkText("意见反馈")).click();
		Set<String>w=driver.getWindowHandles();
		for(String handle:w) {
			driver.switchTo().window(handle);
			String p3=driver.getCurrentUrl();
			if(p2.equals(p3)) {
				Thread.sleep(3000);
				driver.findElement(By.xpath("/html/body/center[4]/form/table/tbody/tr[7]/td/input[2]")).click();
			
			}
		}
		driver.switchTo().window(p);
	}
	@Test(dependsOnMethods="b2")
	public void c3() throws InterruptedException {
		String p6=driver.getWindowHandle();//获取当前句柄
		driver.findElement(By.xpath("/html/body/center[4]/table/tbody/tr/td[2]/table[2]/tbody/tr[1]/td[4]/p[3]/input")).click();
		String p5="http://localhost:8080/shop1/my_cart.jsp";
		Set<String>w=driver.getWindowHandles();
		for(String handle:w) {
			driver.switchTo().window(handle);
			String p7=driver.getCurrentUrl();
			if(p5.equals(p7)) {
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/center[3]/table/tbody/tr[2]/td[2]/table/tbody/tr[4]/td/form/table[2]/tbody/tr[1]/td/font/input[1]")).click();
				WebElement s1=driver.findElement(By.name("pay_fangshi"));
				Select s2=new Select(s1);
				s2.selectByIndex(1);
				driver.findElement(By.name("pay_address")).sendKeys("江西");
				driver.findElement(By.name("pay_email")).sendKeys("183@qq.com");
				driver.findElement(By.xpath("/html/body/center[3]/table/tbody/tr/td[2]/table/tbody/tr[6]/td/form/table/tbody/tr[7]/td/input[1]")).click();
				String pp2="http://localhost:8080/shop1/payment.jsp";
				Set<String>q=driver.getWindowHandles();
				for(String hand:q) {
					driver.switchTo().window(hand);
					String pp3=driver.getCurrentUrl();
					if(pp3.equals(pp2)) {
						driver.findElement(By.xpath("/html/body/center[3]/table/tbody/tr/td[2]/table/tbody/tr[11]/td/table/tbody/tr[4]/td/input[1]")).click();
						Thread.sleep(3000);
						String pp4="http://localhost:8080/shop1/message.jsp";
						Set<String>e=driver.getWindowHandles();
						for(String h:e) {
							driver.switchTo().window(h);
							String pp5=driver.getCurrentUrl();
							if(pp4.equals(pp5)) {
								Thread.sleep(3000);
								driver.findElement(By.xpath("/html/body/center[4]/form/table/tbody/tr[7]/td/input[2]")).click();
							}
						}
					}
				}
			}
		}	
	}
	@AfterClass
	public void setup4() {
		
	}
}
