package day0106;

public class Stent {
	public static void main(String[] args) {
		Student p1=new Student("����","��",17);
		Student p2=new Student("����","��",25);
		p1.setAge(p1.getAge()+1);
		p2.setAge(p2.getAge()+1);
		if(p1.getAge()<20) {
			p1.outinfo();
		}
		if(p2.getAge()<20) {
			p2.outinfo();
		}
		System.out.println(p1.schoolname);
	}
}
class Student{
	static String schoolname="�ȷ�";
	String name;
	String sex;
	int age;
//	public Student() {
//		
//	}
	public Student(String name,String sex,int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	public void outinfo() {
		System.out.println("����:"+this.name+"\n����:"+this.age+"\n�Ա�:"+this.sex);	
	}	
}
class Graduat extends Student{
	String speciallity;
	String teacher;
//	public Graduat() {
//		
//	}
	public Graduat(String name, String sex, int age,String speciallity,String teacher) {
		super(name, sex, age);
	}
	public void outinfo() {
		super.outinfo();
		System.out.println("\nרҵ:"+speciallity+"\nָ����ʦ:"+teacher);	
	}
}
