package cn.test;

public class Day {
	private int age;
	private String name;
	public void setAge(int page) {
		if(page<=0) {
			System.out.println("����");
		}else	
			this.age=page;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public void setName(String pname) {
		this.name = pname;
	}
	void speak() {
		System.out.println("����"+name+"����"+age);
	}
	
	private int a;
	private int b;
	private int c;
	int sum=0;
	
	public void zhouC(int da,int db,int dc) {
		this.a=da;
		this.b=db;
		this.c=dc;
	}
	void shuc() {
		System.out.println("�ܳ�:"+(a+b+c));	
	}
}
class Student{
	private int height;
	private String name;
	private int age;
	private String sex;
	public void xs(int a,String b,int c,String d) {
		this.height=a;
		this.name=b;
		this.age=c;
		this.sex=d;
	}	
	public void xg(String me) {
		this.name=me;
	}
	void sp() {
	System.out.println("���"+height+"����"+age+"����"+name+"�Ա�"+sex);
		}
}

	






