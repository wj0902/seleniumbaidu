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

public class ZouYe1 {
	static WebDriver driver;
	static String u1;
	@BeforeClass
	public void setup1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		driver=new ChromeDriver();
		u1="http://localhost:8080/shop1";
	}
	@Test
	public void aa1() throws InterruptedException{
		driver.get(u1);	
		String p=driver.getWindowHandle();
		WebElement s1=driver.findElement(By.name("select_type"));
		Select s2=new Select(s1);
		s2.selectByVisibleText("电脑专区");
		Thread.sleep(2000);
		driver.findElement(By.name("Submit")).click();
		String u2="http://localhost:8080/shop1/select_ok.jsp";
		Set<String>w=driver.getWindowHandles();
		for(String handle:w) {  //在集合w里面随机取一个句柄页签
			driver.switchTo().window(handle);
			String curr=driver.getCurrentUrl();//获取网址来判断获取的页面是否是需要的
			if(u2.equals(curr)) {
				Thread.sleep(3000);
				driver.findElement(By.xpath("/html/body/center[3]/table/tbody/tr/td[2]/input")).click();
					  }
				}
		driver.switchTo().window(p);
	}
	@Test(dependsOnMethods="aa1")//依赖性测试
	public void bb2() throws InterruptedException{
		
		driver.findElement(By.name("select_p_name")).sendKeys("海尔A62-T20");
		driver.findElement(By.name("Submit")).click();
		Alert b=driver.switchTo().alert();
		Thread.sleep(3000);
		b.accept();
	}
	@Test (dependsOnMethods="bb2")//依赖性测试
	public void cc3() throws InterruptedException{	
		WebElement s3=driver.findElement(By.name("select_type"));
		Select s4=new Select(s3);
		s4.selectByVisibleText("电脑专区");
		driver.findElement(By.name("select_p_name")).sendKeys("海尔A62-T20");
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
	}
	@AfterClass
	public void setup2() {
	
	}
}
