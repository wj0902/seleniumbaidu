package pro;

public class Goto {
public  static void main(String[] args) {
		/*	aaa:for(int i=10;i<=20;i++) {
		
		for(int j=2;j<i/2;j++) {
			if(i%j==0) {
				continue aaa;//aaa是标签，可以任意写，遇到了aaa，直接返回到最上面的aaa,没有执行if，就会往下走	
				}		
		}
		System.out.print(i+"	");
		
	}                   */
	int t;
	for(int i=10;i<=29;i++) {     //求质数的简单方法
		t=1;
		for(int j=2;j<=i/j;j++) {
			if(i%j==0) {
				t=0;
			}
		}
			if(t==1){
				System.out.println(i);
			}
	}
	
	
	int c=5;
	int d=8;
	{
		int k=2;
		//int c=2;//重复定义错误
	}//变量k的作用域到此结束
	
	
}
}
