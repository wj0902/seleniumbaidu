package liuCheng;
public class ShuZu {
	public static void main(String[] args) {
		int[] a=new int[] {1,5};  //�������治��д����
		int[] b;
		b=new int[3];   //����[] ������=new ����[����]
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
