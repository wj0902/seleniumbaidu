package cn.test;

public class Peron{
	int age;
	public Peron(int a) {
		age=a;
		System.out.println(age);
	}
	public Peron(){
		System.out.println("������");
	}
}
class Animal{
	int he;
	double ig;
	public Animal() {
		System.out.println("����һֻħ��è");
	}
	public Animal(int a) {
		he=a;
		System.out.println("hhh"+he);
	}
	public Animal(double b) {
		ig=b;
		System.out.println("qqq"+ig);
	}
}
class Number{
	private int n1;
	private int n2;
	public Number(int a,int b) {
		n1=a;
		n2=b;
		System.out.println(n1+"��"+n2);
	}
	 public void a1() {
		 System.out.println("�ӷ�"+(n1+n2));
	 }
	public void a2() {
		 System.out.println("����"+(n1-n2));
	 }
	 public void a3() {
		 System.out.println("�˷�"+(n1*n2));
	 }
	 public void a4() {
		 this.a5(3);
		 System.out.println("����"+(n1/n2));
	 }
	 public void a5(int a) {
		 System.out.println("����"+(n1/n2));
	 }
}

class Sp{
	int stud;
	String name;
	int score;
	public Sp(int stud) {
		this.stud=stud;
		this.scoe();
		this.nme();
		System.out.println(this.stud);
	}
	public void nme() {
		System.out.println("lxz");
	}
	public void scoe() {
		System.out.println(66);
	}
}

class Wlyh{
	int id;
	int password;
	String email;
	public Wlyh(int id,int password,String email) {
		this.id=id;
		this.password=password;
		this.email=email;
		System.out.println("��ţ�"+this.id+
				"\n���룺"+this.password+"\n��ַ��"+this.email);
	}
}













