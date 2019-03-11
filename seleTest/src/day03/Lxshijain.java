package day03;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lxshijain {
	@Test
	public void opp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String u="file:///E:/%E8%BD%AF%E4%BB%B6%E6%96%87%E4%BB%B6/seleum%E6%96%87%E4%BB%B6/%E9%A1%B5%E9%9D%A2/index.html";
		driver.get(u);
		String p=driver.getWindowHandle();//获取当前窗口句柄
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
	     * 1.切换到小页面中去
	     * 2.定位到小页面里面的内容
	     * 3.操作小页面中的元素
	     */
	    //两种切换方式
	    //第一种括号中直接写上frame标签的id或者name
	    //如果有多个窗口嵌套，就多写几行
	    //driver.switchTo().frame("aa"); //第一种
	    driver.switchTo().frame(0);//第二种，索引的方式，找iframe出现的次数，从0开始
	    driver.findElement(By.id("user")).sendKeys("abcdefg");
	    Thread.sleep(1500);
	    //跳回到主页面，也有两种方式
	    //跳回到父类页面
	   // driver.switchTo().parentFrame(); //一层一层切换
	    
	    //直接跳转到最外层
	    driver.switchTo().defaultContent();
	    String jin="E:\\破解说明.txt";
		WebElement uup=driver.findElement(By.id("load"));
	    uup.sendKeys(jin);
	}
}
