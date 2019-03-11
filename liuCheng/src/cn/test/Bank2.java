package cn.test;

import java.util.Scanner;

public class Bank2 {
	/*	1.银行业务办理程序
	2.欢迎，开户，存款，取款。在完成开户，存款取款后，都要提示余额信息
	3.退出的时候，提醒用户：携带好随身物品，欢迎下次光临*/
	static int a;
	static String user=null;
	static int flag=0;
	static int usermoney=0;
	public static void main(String[] args) {
		Bank2 u=new Bank2();
		System.out.println("*********欢迎进入银行管理系统!*********");
		System.out.print("开户按1号键\n存款按2号键\n取款按3号键\n退出按4号键\n");		
		while(true) {
			System.out.print("请输入你要进行的操作:");
			Scanner s=new Scanner(System.in);
			a=s.nextInt();
		if(a==1) {
			if(user==null) {
				Scanner g=new Scanner(System.in);
				System.out.print("请输入开户名:");
				user=g.nextLine();
				System.out.println("你的用户名为:"+user);
				System.out.println("你的存储金额为:"+flag);
			}else {
				System.out.println("你已经开户了，不能重新开户!");
			}
		}else if(a==2) {
			if(user==null) {
				System.out.println("你没有开户，请你先开户!");
			}else {
				Cunk j=new Cunk();
				flag=flag+j.cunkuang();
				System.out.println("你的存储金额为:"+flag);
			}
		}else if(a==3) {
				if(flag>=u.qukuang()) {
					flag=flag-u.qukuang();
					System.out.println("你剩下的存储金额为:"+flag);
				}else {
					System.out.println("你的取款金额大于存储金额，请重输入取款金额!");
				}			
			}
		else if(a==4) {
			TuiChu r=new TuiChu();
			r.tui();
			break;
		}
		else {
			System.out.println("你输入的有误!请重新输入");
		}
		}
		
		
	}
	public int qukuang() {
		if(user==null) {
			System.out.println("你没有开户，请你先开户!");
		}else{
			System.out.print("请输入取款金额：");	
			Scanner d=new Scanner(System.in);
			usermoney=d.nextInt();
			return usermoney;
		}
		return 0;
	}
}
class Cunk{
	public int cunkuang() {
		System.out.print("请输入你的存储金额:");
		Scanner h=new Scanner(System.in);
		int b=h.nextInt();
		return b;
	}
}



class TuiChu{
	public int tui() {
		System.out.println("安全退出!");
		return 0;
	}
}