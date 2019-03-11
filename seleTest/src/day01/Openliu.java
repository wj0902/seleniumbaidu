package day01;


import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.firefox.FirefoxDriver;


public class Openliu {
	@Test
	public void open() throws InterruptedException{
		//打开火狐浏览器
		//System.setProperty("webdriver.Firefox.bin","E:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		//打开谷歌浏览器
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver a=new ChromeDriver();
		//打开网址
		String url1="https://www.baidu.com";
		String url2="http://www.V2EX.com";
		a.get(url1);  // 打开网址第一种方法
		a.manage().window().maximize();  //窗口最大化
		
		a.navigate().refresh();  //刷新页面
		
		Dimension dimension = new Dimension(500, 800);
		a.manage().window().setSize(dimension);
		
		a.navigate().to(url2);  // 打开网址第二种方法
		
		//后退页面
		a.navigate().back();
		//执行完后，退回到百度页面
		String title1=a.getTitle();  //获取标题
		System.out.println(title1);  //打印标题
		
		String url01=a.getCurrentUrl();  //获取URL
		System.out.println(url01);
		
		Thread.sleep(1000);
		//暂停10秒
		
		a.navigate().forward();
		//前进到 url2页面
		System.out.println(a.getTitle());   //打印标题
	    System.out.println(a.getCurrentUrl());
		
	}

}	
