package day05;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class YanJun {
	@Test  //注解,也是一个测试
	public void opp() throws InterruptedException, IOException, AWTException {
		//打开火狐浏览器
		//System.setProperty("webdriver.Firefox.bin","E:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		//WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); //driver浏览器变量名
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		/**
		 * 基本操作
		 */
		/*String u="file:///E:/%E8%BD%AF%E4%BB%B6%E6%96%87%E4%BB%B6/seleum%E6%96%87%E4%BB%B6/%E9%A1%B5%E9%9D%A2/index.html";
		String u2="file:///E:/%E8%BD%AF%E4%BB%B6%E6%96%87%E4%BB%B6/seleum%E6%96%87%E4%BB%B6/%E9%A1%B5%E9%9D%A2/frame.html";
		driver.get(u);
		Thread.sleep(2000);
		driver.get(u2);
		Thread.sleep(2000);
		driver.navigate().back();//后退
		Thread.sleep(2000);
		driver.navigate().forward();//前进
		driver.navigate().refresh();//刷新
		driver.manage().window().maximize();//最大化
		Thread.sleep(2000);
		//设置浏览器大小
		Dimension aa=new Dimension(800,500); //导入第二个selenium
		driver.manage().window().setSize(aa); //执行 
		String a;
		a=driver.getCurrentUrl();
		System.out.println(a);
		System.out.println(driver.getTitle());*/
		/**
		 * 八种定位
		 */
		/*String u3="https://www.baidu.com";
		driver.get(u3);
		driver.findElement(By.cssSelector("#u1 > a:nth-child(1)")).click();
		
		//int b =driver.findElements(By.tagName("a")).size();//记住复数
	   // System.out.println(b); 
	    driver.findElement(By.partialLinkText("国家游泳跳水")).click(); */
	   
		/**
		 * 操作
		 * 1.输入、单选、多选
		 * 2.下拉框
		 * 3.弹出框
		 */
		//String u4="file:///E:/%E8%BD%AF%E4%BB%B6%E6%96%87%E4%BB%B6/seleum%E6%96%87%E4%BB%B6/%E9%A1%B5%E9%9D%A2/index.html";
		//driver.get(u4);
		//WebElement iput=driver.findElement(By.id("user"));
		//iput.sendKeys("aaa");
		//driver.findElement(By.id("user")).sendKeys("aaa");
		
		/*WebElement s1=driver.findElement(By.id("moreSelect"));
		Select s2=new Select(s1);  //把s1声明为下拉框元素
		s2.selectByIndex(5);
		Thread.sleep(2000);
		s2.selectByValue("vivo");
		Thread.sleep(2000);
		s2.selectByVisibleText("huawei");
		*//**
		 * 单选框判断
		 * isSelected()
		 *//*
		WebElement r1=driver.findElement(By.className("Saab"));
		System.out.println(r1.isSelected());
		if (!r1.isSelected()){  //判断是否点击，没有则点击	
		r1.click();
		}
		System.out.println(r1.isSelected()); //打印是否点击
		
		*//**
		 * 复选框判断
		 * isEnabled()
		 *//*	
		WebElement c1=driver.findElement(By.name("checkbox4"));
		System.out.println(c1.isEnabled());
		if(c1.isEnabled()) {
			c1.click();
		}
		driver.findElement(By.className("btnSousuo")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle()); 
		driver.navigate().back();
		
		driver.findElement(By.className("confirm")).click();
		Alert p=driver.switchTo().alert();
		p.dismiss(); //取消
		p.accept(); //确定
		
		Thread.sleep(2000);
		driver.findElement(By.className("prompt")).click();
		Alert p2=driver.switchTo().alert();
		p2.sendKeys("你好");
		Thread.sleep(4000);
		System.out.println(p2.getText());//获取页面信息
		Thread.sleep(2000);
		p2.accept(); //确定
		Thread.sleep(2000);
		p2.accept(); 
		Thread.sleep(2000);
		
		String wenjian="E:/a.txt";
		driver.findElement(By.id("load")).sendKeys(wenjian);*/
		
		
		/**
		 * iFrame窗口处理
		 * 获取文本信息
		 */
		/*
		String u6="file:///E:/%E8%BD%AF%E4%BB%B6%E6%96%87%E4%BB%B6/seleum%E6%96%87%E4%BB%B6/%E9%A1%B5%E9%9D%A2/frame.html";
		driver.get(u6);
		driver.switchTo().frame(0);
		String wenben=driver.findElement(By.id("div1")).getText();
		System.out.println(wenben);
		driver.switchTo().parentFrame();
		String wb=driver.findElement(By.id("id1")).getText();
		System.out.println(wb);
		
		*//**
		 * 截图操作
		 *//*
		File jietu=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(jietu, new File("E:\\testi.jpg"));//第一个文件参数和第二个文件存放地址
*/	
		
		/**
		 * 多窗口处理
		 */
		//通过网址处理多窗口
		/*String u8="http://localhost:8080/mobile_mysql/goodsAction.do?action=16&id=7";
		String u5="http://localhost:8080/mobile_mysql/index.jsp";	
		driver.get(u5);
		String p3=driver.getWindowHandle();//获取当前窗口句柄
		driver.findElement(By.name("name")).sendKeys("lisi");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.className("input1")).click();
		driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[2]/table[2]/tbody/tr/td[2]/table/tbody/tr[5]/td/div/a")).click();
		
		Set<String>w=driver.getWindowHandles();  //变量w是一个集合
		//获取当前页面所有句柄，因为有两个页面，所有用了一个字符串集合w来接收两个句柄
		for(String handle:w) {  //在集合w里面随机取一个句柄页签
			driver.switchTo().window(handle);
			String curr=driver.getCurrentUrl();//获取标题来判断获取的页面是否是需要的
			
			if(u8.equals(curr)) {
				driver.findElement(By.name("Submit")).click();
				Alert alert=driver.switchTo().alert();
				alert.accept();
			}
		}
		driver.switchTo().window(p3); 	
		driver.findElement(By.linkText("购物车")).click();
		driver.findElement(By.linkText("去收银台结账")).click();*/
		
		//通过标题处理多窗口
		/*String u9="file:///E:/%E8%BD%AF%E4%BB%B6%E6%96%87%E4%BB%B6/seleum%E6%96%87%E4%BB%B6/%E9%A1%B5%E9%9D%A2/index.html";
		driver.get(u9);
		String p=driver.getWindowHandle();//获取当前窗口句柄
		WebElement a1=driver.findElement(By.className("alert"));
		a1.click();
		Thread.sleep(1000);
		Alert a2=driver.switchTo().alert();//从浏览器跳转到弹出框上面去
		a2.accept();     
		WebElement co1=driver.findElement(By.className("confirm"));
		co1.click();
		Alert co2=driver.switchTo().alert();//从浏览器跳转到弹出框上面去
		co2.dismiss();//这样为取消
		co2.accept(); //这样的叫确定
		String lujin="E:\\a.txt";
		WebElement up=driver.findElement(By.id("load"));
	    up.sendKeys(lujin);
		driver.findElement(By.className("open")).click();
		
		Set<String>w=driver.getWindowHandles();
		for(String handle:w) {
			driver.switchTo().window(handle);
			String title=driver.getTitle();
			if("UIAutomation iFrame".equals(title)) {
				driver.findElement(By.id("user")).sendKeys("text");//直接输入
				Thread.sleep(3000);
			}
		}
		driver.switchTo().window(p);
		driver.findElement(By.id("user")).sendKeys("texting");//直接输入
*/		
		/**
		 * 右击和双击
		 * 元素等待
		 * 1.线程等待
		 * 2.全局等待
		 * 3.显示等待（不讲）
		 */
		String u9="file:///E:/%E8%BD%AF%E4%BB%B6%E6%96%87%E4%BB%B6/seleum%E6%96%87%E4%BB%B6/%E9%A1%B5%E9%9D%A2/index.html";
		driver.get(u9);
		String p=driver.getWindowHandle();//获取当前窗口句柄
		WebElement a1=driver.findElement(By.className("alert"));
		a1.click();
		Thread.sleep(1000);
		Alert a2=driver.switchTo().alert();//从浏览器跳转到弹出框上面去
		a2.accept();     
		WebElement co1=driver.findElement(By.className("confirm"));
		co1.click();
		Alert co2=driver.switchTo().alert();//从浏览器跳转到弹出框上面去
		co2.dismiss();//这样为取消
		co2.accept(); //这样的叫确定
		String lujin="E:\\a.txt";
		WebElement up=driver.findElement(By.id("load"));
	    up.sendKeys(lujin);
	    //右击和双击
	    //Actions sss=new Actions(driver);
	    //sss.contextClick().perform();
	   /* WebElement sss=driver.findElement(By.className("wait"));
	    Actions qqq=new Actions(driver);
	    qqq.doubleClick(sss).perform();*/
	    WebElement sss=driver.findElement(By.className("wait"));
	    sss.click();
	    //Thread.sleep(4000);
	    String swu=driver.findElement(By.className("red")).getText();
	    System.out.println(swu);
	    /**
	     * 键盘事件，通过sendKeys
	     * 选择事件
	     */
	    WebElement select=driver.findElement(By.id("selectWithMultipleEqualsMultiple"));
	    List<WebElement> aaa=select.findElements(By.tagName("option"));
	    //不能在driver里面找，在select里面找，因为上面有option
		 //List导入第三个
	    Actions sele2=new Actions(driver);//从第一个开始
	    sele2.sendKeys(Keys.CONTROL).click(aaa.get(2)).perform();
	    //sele2.keyDown(Keys.CONTROL).click(option.get(2)).perform();
	   /* Robot aa=new Robot();
	    aa.keyPress(KeyEvent.VK_CONTROL);//按住
	    aa.keyPress(KeyEvent.VK_S);	
	    aa.keyRelease(KeyEvent.VK_S);//松开
	    aa.keyRelease(KeyEvent.VK_CONTROL);
	    Thread.sleep(2000);
	    aa.keyPress(KeyEvent.VK_ESCAPE);
	    Thread.sleep(2000);
	    aa.keyRelease(KeyEvent.VK_ESCAPE);*/
	    FileHandler.createDir(new File("d://dataaa//a.txt"));
	    
	}
}
