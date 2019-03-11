package day03;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Wsn2 {
	@Test
	public void po() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); //全局等待
		String u="file:///E:/%E8%BD%AF%E4%BB%B6%E6%96%87%E4%BB%B6/seleum%E6%96%87%E4%BB%B6/%E9%A1%B5%E9%9D%A2/index.html";
		/*
		 * 1.进入index页面
		 * 2.找到输入框
		 * 3.点击右键
		 */
		driver.get(u);	
		WebElement iput=driver.findElement(By.id("user"));
		Actions a=new Actions(driver);  //声明一个Action类
		//a.contextClick(iput).perform(); //执行右键命令
		Thread.sleep(2000);        		
		String p=driver.getWindowHandle();//获取当前窗口句柄
		//System.out.println(p);
		driver.findElement(By.name("checkbox4")).click();
		WebElement co1=driver.findElement(By.className("confirm"));
		co1.click();
		Alert co2=driver.switchTo().alert();//从浏览器跳转到弹出框上面去
		co2.accept();
		co2.accept();
		String lujin="E:\\a.txt";
		WebElement up=driver.findElement(By.id("load"));
	    up.sendKeys(lujin);
	    Thread.sleep(1500);	  
	    
	    /**
	     * 找到wait按钮，点击双击
	     */
	    WebElement wa=driver.findElement(By.className("wait"));
	    Actions b=new Actions(driver);//括号里面driver是浏览器变量
	    b.doubleClick(wa).perform(); //perform()是执行的意思
	    Thread.sleep(4000); //线程等待
	    String cc=driver.findElement(By.className("red")).getText();
	    System.out.println(cc);
	    /**
	     * 键盘事件，通过sendKeys
	     * 选择事件
	     */
	    WebElement sele=driver.findElement(By.id("selectWithMultipleEqualsMultiple"));
	    List<WebElement> option=sele.findElements(By.tagName("option"));//不能在driver里面找，在sele里面找，因为上面有option
	   //List导入第三个
	    
	    Actions sele2=new Actions(driver);
	    //sele2.sendKeys(Keys.CONTROL);//按住ctrl选择
	   // sele2.keyDown(Keys.CONTROL);//按住ctrl选择
	    //sele2.click(option.get(1)).click(option.get(2)).perform();//0号默认选择了，如果在点击就会取消
	    sele2.sendKeys(Keys.CONTROL).click(option.get(2)).perform();
	    //sele2.keyDown(Keys.SHIFT); //按住shift键选择
	    
	   // sele2.keyDown(Keys.SHIFT).click(option.get(2)).perform();
	    
	   // sele2.keyUp(theKey)
	}
}
