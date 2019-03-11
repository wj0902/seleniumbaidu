package pro3;

public class Demo1 {
public static void main(String[] args) {
	String a="3";
	int b=4;
	int c=5;
	int x=20;
	System.out.println(a+b+c);
	System.out.println(b+c+a);
	int score=80;
	String type=score<60?"不及格":"及格";
	System.out.println(type);
	
	System.out.println(x<0?1:(x>0?2:100));
	
	
}
}
