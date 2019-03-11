package day06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Kshi2 {
	static WebDriver driver;
	static String ur;
	@BeforeClass
	public void setup() {
		 System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
		 driver=new ChromeDriver();
		 ur="http://localhost:8080/Exam_ssh";
		 //打开网址 
	}
	@Test
	public void aaa() {
		
		 driver.get(ur);
		 //用户登录考试系统
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td/a[1]")).click();
		driver.findElement(By.name("stuNumber")).sendKeys("1");
		driver.findElement(By.name("stuName")).sendKeys("1");
		driver.findElement(By.name("B1")).click();
	}
	@Test
	public void abb() {
		//选择考试类型
		WebElement s1=driver.findElement(By.name("examType"));
		Select s2=new Select(s1);
		s2.selectByIndex(1);
	}
	@Test
	public void acc() {
		//开始考试
		driver.findElement(By.name("start_b")).click();
		driver.findElement(By.name("questionOption")).click();
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[4]/td[2]/div/input[1]")).click();
		driver.findElement(By.name("questionOption")).click();
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[4]/td[2]/div/input[1]")).click();	
	}
	@AfterClass
	public static void teardown() {
		driver.close();
	}
}




