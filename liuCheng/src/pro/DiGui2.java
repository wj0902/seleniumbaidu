package pro;

public class DiGui2 {
	public static void main(String[] args) {			
		long d1=System.currentTimeMillis();  
        System.out.printf("递归%d阶乘的结果:%s%n", 10, jieCheng(10));//为什么换成println形式会错误？没有耗时
        long d2 = System.currentTimeMillis();
        System.out.println("递归费时:"+(d2-d1));  //耗时：32ms
		
		System.out.println("普通循环结果是:"+jc(10));
		
	}
	
	
	static long jieCheng(int n){
		if(n==1) {
			return 1;
		}else {
			return n*jieCheng(n-1);
		}
	}
	static long result=1;
	static long sum=0;
	 static long jc(int m) {
		 long d3=System.currentTimeMillis();//是long类型，不能写int，这个东西意思是返回当前时刻，毫秒数
		if(m==1) {
			return 1;
		}
		while(m>1) {
			result=m*(m-1)*result;
			m=m-2;
		}	
		long d4=System.currentTimeMillis();//是long类型，不能写int，执行第6行后的当前时刻
		System.out.println("普通循环耗时:"+(d4-d3));
		return result;	
		
	}
}
//System.out.printf("%d%s%n",6,jieCheng(6))一个是打印6，一个打印jieCheng(6)，一个是换行，也可以\n