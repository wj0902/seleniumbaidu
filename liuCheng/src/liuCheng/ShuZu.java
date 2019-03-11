package liuCheng;
public class ShuZu {
	public static void main(String[] args) {
		int[] a=new int[] {1,5};  //类型里面不能写东西
		int[] b;
		b=new int[3];   //类型[] 数组名=new 类型[长度]
		b[0]=1;
		b[1]=2;
		b[2]=3;
		String[] x=new String[] {"a","b","c","d"};
		int[] c= {1,2,3};
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
		}
	}
}
