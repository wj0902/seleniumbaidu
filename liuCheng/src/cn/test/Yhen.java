package cn.test;
import java.util.Scanner;
public class Yhen {
	static String name;
	public static void main(String[] args) {		
		System.out.println("\t\t\t欢迎进入银行业务办理系统");
		System.out.println("开户输入1号键\t存款输入2号键\t取"
				+ "款输入3号键\t退出输入4号键");
				int n;
				Scanner s=new Scanner(System.in);
				//System.out.print("请输入你要办理的业务序号:");
				int total=0;
				int quk=0;
				while(true) {
					System.out.print("请输入你要办理的业务序号:");
					n=s.nextInt();			
				if(n==1) {	
					if(name==null) {
						Scanner w=new Scanner(System.in);
						System.out.print("请输入用户号:");
						name=w.nextLine();	
						System.out.println("业务办理成功!");
					}else
						System.out.println("你的用户账号已经办理!");
				}
				if(n==2){
					if(name==null)
					{
							System.out.println("请先开户才能进行存款");
					}else
					{
					System.out.print("请输入存储金额:");
					Add p1=new Add();
					total+=p1.su();
					System.out.println("用户"+name+"你的存储金额为:"+total);
					}
				}
				if(n==3) {
					Jia p3=new Jia();
					System.out.print("请输入取款余额:");
					quk=p3.jian();
					if(total==0)
					{
						System.out.println("账户余额为0，不能进行取款");
					}
					else if(quk>total)
					{
						System.out.println("输入的取款金额大于账户余额，请重新输入");
					}
					else
					{
						total-=quk;
						System.out.println("用户"+name+"取款成功！当前余额为："+total);				
					}
				}
				if(n==4) {
					System.out.println("用户"+name+"请携带好随身物品，不要丢了!");
					break;
				}
				if(n>4) {
					System.out.print("你输入的有误!");
				}
				
				}
			}	
}
class Add{
	public int su() {			
		Scanner q=new Scanner(System.in);
		int m=q.nextInt();
		return m;
	}
}
class Jia{
	public int jian() {
		Scanner q=new Scanner(System.in);
		int m=q.nextInt();
		return m;
	}
}