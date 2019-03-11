package pro;

public class Method {
public static void main(String[] args) {
	Method aaa=new Method();
	aaa.shuChu();
	aaa.add(10,20);   //传递给形参
	int c=aaa.zongHe(30, 50, 80);
	System.out.println(c);
	
	System.out.println(aaa.app(10,50));
}
void shuChu(){
	System.out.println("永远健康快乐!");
	System.out.println("永远长寿幸福!");
}
void add(int a,int b){
	int sum=a+b;
	System.out.println(sum);
}

int zongHe(int a,int b,int c) {
	int sum=a+b+c;
	return sum;  //return两个作用：1.结束方法运行 2.返回值
}

int app(int a,int b) {
	 int sum=a+b;
	 return sum;
}

}
