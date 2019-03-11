/*
 * 键盘输入
 * */
package pro3;

import java.util.*;//系统默认包之外的类，要使用的话，要导用这个类

public class TestScanner {
public static void main(String[] args) {
	
	/*  char i=6;
	System.out.println(i);
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("请输入名字:");
	String name=scanner.nextLine();
	System.out.println(name);
	System.out.println("请输入你的爱好:");
	String favo=scanner.nextLine();
	System.out.println(favo);
	System.out.println("请输入你的年龄:");
	int age=scanner.nextInt();
	
	System.out.println("#########################");
	
	System.out.println("来到地球的天数:"+age*365);
	System.out.println("离开地球的天数:"+(72-age)*365);  */
	
	/* 	Scanner bottomPour=new Scanner(System.in);
	System.out.println("#########请开始你的下注##########");
	
	System.out.print("在3-18里面选择你要押的数字:");			
	int shuzi=bottomPour.nextInt();
	
	while(shuzi<3||shuzi>18) {
		System.out.print("在3-18里面选择你要押的数字:");	
		shuzi=bottomPour.nextInt();
	}
	
	System.out.print("请输入要下注的倍数:");
	int beishu=bottomPour.nextInt();
	 System.out.print("赢了将得到:"+shuzi*beishu);
	 
	 System.out.print("\n");    */
	
	Scanner name=new Scanner(System.in);
	System.out.print("请输入要选举的姓名:");
	String mingZi=name.nextLine();
	System.out.print("选举人是:"+mingZi);  
	System.out.print("\n");
	System.out.print("请输入年龄:");
	int age=name.nextInt();
	System.out.print("选举人年龄是:"+age);
}
}
