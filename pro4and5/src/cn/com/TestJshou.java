package cn.com;

public class TestJshou {
	public static void main(String[] args) {
		Plane p=new Plane();
		showFly(p);
		Brid p2=new Brid();
		showFly(p2);
		
		Flyable p3=new Brid();  //向上转型
		showFly(p3);
		
		Brid p4=(Brid)p3; //向下转型
		showFly(p4);
				
		showXi(p); 
		Sleepable p5=new Plane();
		showXi(p5);
		
		Plane p6=(Plane)p5;
		showXi(p6);
		
	}
	
	public static void showFly(Flyable ccc) {
		ccc.fly();
	}
	
	public static void showXi(Sleepable kkk) {
		kkk.sleep();
	}
	
}


