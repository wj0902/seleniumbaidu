package day06;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class As{
	static WebDriver driver;
	static String url;
	@BeforeClass
	public static void  setup() {
		 System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
		 driver=new ChromeDriver();
		 url="http://192.168.1.174:8080/Banksys_ssh/login.jsp";
		
	}
	
	/*
	 * 1,登录---取款---打印
	 */
	
	
	/*
	 * 1,打开网址
	 * 2，输入用户名
	 * 3，输入密码
	 * 4，点击登录
	 */
	@Test   //登录
	public void alogin() {
		//打开网址
			driver.get(url);
		//输入用户名	
	 WebElement input=driver.findElement(By.id("loginValidate_userNO"));
	 input.sendKeys("1536220784968");
	 //输入密码
	WebElement pad=driver.findElement(By.id("loginValidate_password"));
	pad.sendKeys("123456");
	//点击登录按钮
	WebElement button=driver.findElement(By.id("loginValidate_0"));
	button.click(); 
	}
	
	@Test(dependsOnMethods="alogin")  //取款1
	@Parameters("data1")
	
	public void  bqukuan1(String data1) {
		   //跳转左边框架，点击菜单    
		    driver.switchTo().frame(1);
		   	driver.findElement(By.xpath("/html/body/p[3]/a/img")).click();
		   //跳转至右边框架
		   	driver.switchTo().defaultContent();
		   	driver.switchTo().frame(2);
		   	//输入取款的金额 ，点击确定按钮  
		   	driver.findElement(By.id("fmoneyValidate_money")).sendKeys(data1);
		   	driver.findElement(By.id("fmoneyValidate_0")).click();
		   	      
		   	//获取：取款成功
		   	   WebElement s=driver.findElement(By.xpath("/html/body/center"));
	           System.out.println(s.getText());
	       //打印交易信息
	       //跳转到左边框架
	           driver.switchTo().defaultContent();
	           driver.switchTo().frame(1);
	       //点击交易信息菜单
		   	   driver.findElement(By.xpath("/html/body/p[4]/a/img")).click();
		   //跳转到右边框架	
		   	   driver.switchTo().defaultContent();
		   	   driver.switchTo().frame(2);
		   //打印交易信息
		   	   WebElement aa=driver.findElement(By.xpath("/html/body/center"));
	           System.out.println(aa.getText());
	}
	@Test(dependsOnMethods="bqukuan1")
	@Parameters("data1")
	public void cqukuan2(String data1) {
		      //跳至左边框架
	           driver.switchTo().defaultContent();
	           driver.switchTo().frame(1);
	          //点击取款菜单 
		   	   driver.findElement(By.xpath("/html/body/p[3]/a/img")).click();
		   	  //跳转至右边框架
		   	   driver.switchTo().defaultContent(); 
		   	   driver.switchTo().frame(2);
		   	  //输入取款金额，点击确认按扭
		   	   driver.findElement(By.id("fmoneyValidate_money")).sendKeys(data1);
		   	   driver.findElement(By.id("fmoneyValidate_0")).click();
			  //获取错误信息
			   WebElement q=driver.findElement(By.xpath("/html/body/center"));
		       System.out.println(q.getText());



	}
	@AfterClass
	public static void teardown() {
		
	}
}

