package day07;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class YxingLx2 {
	
	public static class sanwork {
		@Test
		  public void w126() throws InterruptedException {
			  System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				//打开机票首页
			String url="http://flight.qunar.com";
				driver.get(url);
				
				driver.findElement(By.name("searchType")).click();
			        WebElement Box = driver.findElement(By.xpath("//div[@id='js_flighttype_tab_domestic']//input[@class='inp_chk js-searchtype-oneway']"));
			        if (!Box.isSelected()) {
			            Box.click();
			        }
		    	driver.findElement(By.name("fromCity")).click();
		    	driver.findElement(By.xpath("//*[@id=\"dfsForm\"]/div[2]/div[1]/div/div[2]/div/div[2]/div[2]/dl/dd/ul/li[2]/a")).click();
		}
	}

}
	/*static String u;
	static WebDriver driver;
	@BeforeClass
	public void stp1() {
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		driver=new ChromeDriver();
		u="http://flight.qunar.com";
	}
	@Test
	public void c() {
		driver.get(u);
		
		//driver.findElement(By.xpath("//*[@id=\"dfsForm\"]/div[2]/div[2]/div/div[1]/div[1]")).sendKeys("上海");
		driver.findElement(By.id("fromDate")).sendKeys("2019-02-11");
		driver.findElement(By.xpath("//*[@id=\"dfsForm\"]/div[2]/a")).click();
		driver.findElement(By.name("fromCity")).sendKeys("北京");
		//driver.find_element_by_css_selector('div.panel-body>div').click();
		//driver.findElement(By.cssSelector("div:berore.qcbox-info>div")).click();
		//driver.findElement(By.cssSelector("b.iconfont f-location>b:berore")).click();
		//driver.findElement(By.cssSelector("b.qcbox-info>b:berore")).click();
		//Select s1=new Select(s);
		//s1.selectByIndex(3);
		
		//driver.findElement(By.xpath("//input[contains(@id,'fuck')]"));
		//driver.findElement(By.name("userNO")).sendKeys("1548988310922");
		//driver.findElement(By.xpath("//input[start-with(@id,'fuck')]"));//匹配id以fuck开头的元素，id='fuckyou'
		//driver.findElement(By.xpath("//input[ends-with(@id,'fuck')]"));//匹配id以fuck结尾的元素，id='youfuck'
		//driver.findElement(By.xpath("//input[contains(@id,'loginValidate_password')]")).sendKeys("123456");;//匹配id中含有fuck的元素，id='youfuckyou'
	}
	@AfterClass
	public void k() {
		//driver.close();
	}*/


