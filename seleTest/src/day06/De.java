package day06;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class De {
	 @BeforeClass  //开始之前
	public static void cc() {
		System.out.println("打开浏览器");
	}
	@Test  //测试开始之前的测试用例
	public void aa() {
		System.out.println("登录");
	}
	@Test  //测试开始之后的测试用例
	public void bb() {
		System.out.println("购买流程");
	}
	@AfterClass
	public static void dd() {
		System.out.println("关闭浏览器");
	} 
	/*
	@Before  //开始之前
	public void cc() {
		System.out.println("这是@BeforeTest");
	}
	@Test  //测试开始之前的测试用例
	public void aa() {
		System.out.println("这是第一个@test");
	}
	@Test  //测试开始之后的测试用例
	public void bb() {
		System.out.println("这是第二个@test");
	}
	@After
	public void dd() {
		System.out.println("这是@After");
	}*/
	
}
