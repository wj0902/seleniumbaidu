package liuCheng;

public class For {
public static void main(String[] args) {
	/*		int i=1;
	int sum=0;
	for(i=1;i<=3;i++) {
		System.out.println(i);
		sum=i+sum;
	}
	System.out.println(sum); */
	
	/*	while(true) {    //可以用true，但不能用false，不能用数字1或者0
		System.out.println("祝家人永远健康长寿!");
	}   */
	
	/*	for(; ;) {   //不能用false或者true表示
		System.out.println("永远健康，爱你们到永远!");
	}     */
	
	/*	for(int a=1;a<6;a++) {
		for(int j=1;j<6;j++) {
			System.out.print(a+"\t");
		}
		System.out.println();//这个也是换行,如果写print就不行
	}	*/
	//九九乘法表
	/*	for(int i=1;i<=9;i++) {
		for(int j=1;j<=i;j++) {   //j小于i是为了每次少一个，由9变8变7。。。
			System.out.print(j);
			System.out.print("*"+i);
			System.out.print("="+i*j+" ");
		}
		System.out.print("\n");    
	}       */
	//用while循环分别计算100以内的奇数及偶数的和，并输出
	/*	int n=2;
	int sum=0;
	while(n<=100)
	{
		sum=sum+n;
		n=n+2;
	}
	System.out.print(sum);      */
	//用while循环或其他循环输出1-1000之间能被5整除的数，且每行输出5个。

	int i=1;
	int count=0;
	for(i=1;i<=100;i++) {
		if(i%5==0) {
			System.out.print(i+"	");
		count++;
		if(count%5==0) {
			System.out.println();
		}
		}
	}	
	
}
}
