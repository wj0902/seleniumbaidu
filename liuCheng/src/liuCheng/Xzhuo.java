package liuCheng;
import java.util.Scanner;
public class Xzhuo {
	public static void bor() {
		System.out.println("狮子座\t"+"天平座\t"+"双子座\t"+"射手座");
		System.out.println("水瓶座\t"+"摩羯座\t"+"天蝎座\t"+"金牛座");
		System.out.println("处女座\t"+"双鱼座\t"+"白羊座\t"+"巨蟹座");
	}
	public static void borthday(int month,int date) {
		switch(month) {
		case 1:
			if(date<15) {
				System.out.println("处女座");
			}else {
				System.out.println("双鱼座");
			}
			break;
		case 2:
			if(date<15) {
				System.out.println("双鱼座");
			}else {
				System.out.println("水瓶座");
			}
			break;
		case 3:
			if(date<15) {
				System.out.println("水瓶座");
			}else {
				System.out.println("狮子座");
			}
			break;
		case 4:
			if(date<15) {
				System.out.println("狮子座");
			}else {
				System.out.println("天蝎座");
			}
			break;
		case 5:
			if(date<15) {
				System.out.println("天蝎座");
			}else {
				System.out.println("白羊座");
			}
			break;
		case 6:
			if(date<15) {
				System.out.println("白羊座");
			}else {
				System.out.println("金牛座");
			}
			break;
		case 7:
			if(date<15) {
				System.out.println("金牛座");
			}else {
				System.out.println("巨蟹座");
			}
			break;
		case 8:
			if(date<15) {
				System.out.println("巨蟹座");
			}else {
				System.out.println("双子座");
			}
			break;
		case 9:
			if(date<15) {
				System.out.println("双子座");
			}else {
				System.out.println("摩羯座");
			}
			break;
		case 10:
		if(date<15) {
			System.out.println("摩羯座");
		}else {
			System.out.println("天平座");
		}
		break;
		case 11:
			if(date<15) {
				System.out.println("天平座");
			}else {
				System.out.println("射手座");
			}
			break;
		case 12:
			if(date<15) {
				System.out.println("射手座");
			}else {
				System.out.println("处女座");
			}
			break;
		}
		
	}

	public static void main(String[] args) {
		bor();
		Scanner s=new Scanner(System.in);
		System.out.print("请输入你的月份:");
		int month=s.nextInt();
		while(month>12) {
			System.out.print("请重新输入你的月份:");
			month=s.nextInt();
		}
		System.out.print("请输入你的日期:");
		int date=s.nextInt();
		while(date<=0) {
			System.out.print("请重新输入你的日期:");
			date=s.nextInt();
		}
		borthday(month,date);
	}
}
