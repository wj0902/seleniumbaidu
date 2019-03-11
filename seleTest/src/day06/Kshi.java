package day06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Kshi {
	static WebDriver driver;
	static String ur;
	@BeforeClass
	public void setup() {
		 System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
		 driver=new ChromeDriver();
		 ur="http://localhost:8080/Exam_ssh";
	}
	@Test
	public void app() {
		
		 driver.get(ur);
		 //进入后台管理
		 driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td/a[2]")).click();
		//用户登录
		 driver.findElement(By.id("name")).sendKeys("admin");
		 driver.findElement(By.id("pass")).sendKeys("admin");
		 driver.findElement(By.name("B1")).click();
	}
	@Test(dependsOnMethods="app")//依赖性测试
	public void bpp() {
		
		 //添加考试类型
		 driver.findElement(By.xpath("//*[@id=\"questionChild\"]/a[1]")).click();
		 driver.findElement(By.id("testName")).sendKeys("C语言");
		 driver.findElement(By.id("testTime")).sendKeys("29");
		 driver.findElement(By.name("submit")).click();
		 //添加试题
		 driver.findElement(By.xpath("//*[@id=\"questionChild\"]/a[3]")).click();
		 driver.findElement(By.id("title")).sendKeys("为什么？");
		 //通过可见值选择类别
		 WebElement s1=driver.findElement(By.id("examType"));
		 Select s2=new Select(s1);
		 s2.selectByVisibleText("C语言");
		 driver.findElement(By.id("choices")).sendKeys("1");
		 driver.findElement(By.id("standardAnswer")).sendKeys("1");
		 driver.findElement(By.name("submit")).click();
		 //浏览试题打印
		 driver.findElement(By.xpath("//*[@id=\"questionChild\"]/a[2]")).click();
		 String s3=driver.findElement(By.xpath("/html/body/div/table[1]/tbody/tr[2]/td[2]")).getText();
		 System.out.println(s3);
	}
	@Test(dependsOnMethods="bpp")
	public void cpp() {
		
		 //添加学生
		 driver.findElement(By.xpath("//*[@id=\"studentChild\"]/a[2]")).click();
		 driver.findElement(By.id("id")).sendKeys("3625");
		 driver.findElement(By.id("realname")).sendKeys("1");
		 driver.findElement(By.id("stuNumber")).sendKeys("1");
		 driver.findElement(By.id("className")).sendKeys("1");
		 driver.findElement(By.id("address")).sendKeys("1");
		 driver.findElement(By.id("phone")).sendKeys("1");
		 driver.findElement(By.id("email")).sendKeys("1");
		 driver.findElement(By.id("humanId")).sendKeys("3625");
		 driver.findElement(By.name("submit")).click();
		 //浏览全部学生并打印
		 driver.findElement(By.xpath("//*[@id=\"studentChild\"]/a[1]")).click();
		 String s4=driver.findElement(By.xpath("/html/body/div/table[1]/tbody/tr[2]/td[2]")).getText();
		 System.out.println(s4);
		 }
	
	@AfterClass
	public static void teardown() {
		
	}
}




