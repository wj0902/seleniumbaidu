package day01;


import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.firefox.FirefoxDriver;


public class Openliu {
	@Test
	public void open() throws InterruptedException{
		//�򿪻�������
		//System.setProperty("webdriver.Firefox.bin","E:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		//�򿪹ȸ������
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver a=new ChromeDriver();
		//����ַ
		String url1="https://www.baidu.com";
		String url2="http://www.V2EX.com";
		a.get(url1);  // ����ַ��һ�ַ���
		a.manage().window().maximize();  //�������
		
		a.navigate().refresh();  //ˢ��ҳ��
		
		Dimension dimension = new Dimension(500, 800);
		a.manage().window().setSize(dimension);
		
		a.navigate().to(url2);  // ����ַ�ڶ��ַ���
		
		//����ҳ��
		a.navigate().back();
		//ִ������˻ص��ٶ�ҳ��
		String title1=a.getTitle();  //��ȡ����
		System.out.println(title1);  //��ӡ����
		
		String url01=a.getCurrentUrl();  //��ȡURL
		System.out.println(url01);
		
		Thread.sleep(1000);
		//��ͣ10��
		
		a.navigate().forward();
		//ǰ���� url2ҳ��
		System.out.println(a.getTitle());   //��ӡ����
	    System.out.println(a.getCurrentUrl());
		
	}

}	
