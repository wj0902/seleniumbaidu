package liuCheng;
import java.util.Scanner;
public class Tere {
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		System.out.print("请输入年份：");
		int year=s.nextInt();
	    System.out.print("请输入月份:");
		int month=s.nextInt();
		System.out.print("请输入该月几号:");
		int date=s.nextInt();
		int sum=0;
		int m=1;
		for(m=1;m<month;m++){
		switch(m){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
		sum+=31;
		break;
		case 4:
		case 6:
		case 9:
		case 11:
		sum+=30;
		break;
		case 2: 
		if((year%4==0&&year%100!=0)||year%400==0){
			 sum+=29;
		}else{
		sum+=28;
		}

		}
		}
		System.out.println("该日期是本年的第"+(sum+date)+"天");
		}
}
