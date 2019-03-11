package day02;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CaoZuo {
	@Test
	public void ope() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String u1="file:///E:/%E8%BD%AF%E4%BB%B6%E6%96%87%E4%BB%B6/seleum%E6%96%87%E4%BB%B6/index.html";
		driver.get(u1);
		WebElement iput=driver.findElement(By.id("user"));
		iput.sendKeys("控件操作");
		
		//定位下拉框
		WebElement s=driver.findElement(By.id("moreSelect"));
		Select s1=new Select(s); //把s声明为下拉框元素
		
		//第一种，按照索引来选择，第一个选择内容从0开始	
		s1.selectByIndex(3);
		Thread.sleep(1000);  
		
		//第二种，按照value来选择，从HTML里面找元素value值
	     s1.selectByValue("huawei");
	     Thread.sleep(1000);
	     //第三种，用可见的值，不是在HTML找，是直接在下拉框里面找,也可以在
	     //HTML格式里面找
		s1.selectByVisibleText("xiaomi");
		
		//driver.findElement(By.className("Volvo")).click();
		WebElement r1=driver.findElement(By.className("Volvo"));
		System.out.println(r1.isSelected());
		r1.click();
		System.out.println(r1.isSelected()); //打印是否选择了r1.click();
		//如果选择了就返回true，否则false
		//isSelected()  判断按钮是否被选中
		
		
		//复选框多选
		WebElement c1=driver.findElement(By.name("checkbox1"));
		if(!c1.isSelected()) {
		c1.click();
		}
		WebElement c2=driver.findElement(By.name("checkbox2"));
		c2.click();
		
		WebElement b1=driver.findElement(By.name("buttonhtml"));
		System.out.println(b1.isEnabled());  //判断按钮是否可用
		//assertTrue("false",b1.isEnabled()); 后面讲
		
		WebElement a1=driver.findElement(By.className("alert"));
		a1.click();
		Thread.sleep(1000);
		Alert a2=driver.switchTo().alert();//从浏览器跳转到弹出框上面去
		a2.accept();     
		
		WebElement co1=driver.findElement(By.className("confirm"));
		co1.click();
		Alert co2=driver.switchTo().alert();//从浏览器跳转到弹出框上面去
		/*co2.accept(); //这样的叫确定
		Thread.sleep(1000);
		co2.accept(); //这样的叫确定   */
		co2.dismiss();//这样为取消
		co2.accept(); //这样的叫确定
		
		//输入后在点击按钮
		WebElement p1=driver.findElement(By.className("prompt"));
		p1.click();
		Alert p2=driver.switchTo().alert();//从浏览器跳转到弹出框上面去
		Thread.sleep(1500);
		p2.sendKeys("hello word!");
		String aa=p2.getText();  //获取页面信息
		System.out.println(aa);
		Thread.sleep(1500);
		p2.accept();
		p2.accept();
		
		
		//定义文件路径
		String lujin="E:\\a.txt";
		WebElement up=driver.findElement(By.id("load"));
	    up.sendKeys(lujin);
	    
	}
}
