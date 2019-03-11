package liuCheng;

public class TestIf {
public static void main(String[] args) {
	double d=Math.random();//返回【0，1）之间的数 
	System.out.println(d);
	//计算【0，5】之间的数
	int a=(int)(6*Math.random());
	System.out.println(a);//如果if不加括号，输出大于等于3的，会执行第二条输出语句，小于3则两条都会执行
	if(a<3)
	System.out.println("小");
	System.out.println("笑啊");
	
	
	int j=(int)(6*Math.random()+1);
	int k=(int)(6*Math.random()+1);
	int m=(int)(6*Math.random()+1);
	int sum=+j+k+m;
	if(sum>15) {
		System.out.println("运气不错，奖励50倍!");
	}
	if(10<=sum&&sum<=15) {
		System.out.println("运气一般了!奖励2倍");
	}
	if(sum<10) {
		System.out.println("运气比较差，损失2倍!");
	}
	System.out.print("你的得分是:"+sum);
	
	
	double r=4*Math.random();//产生0-3的随机数
	double area=Math.PI*Math.pow(r, 2);//Math.PI这个是3.14，Math.pow(r, 2)这个是半径r的平方
	
	
}
}
