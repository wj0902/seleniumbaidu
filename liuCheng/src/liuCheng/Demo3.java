package liuCheng;
import java.util.Scanner;
public class Demo3 {
	public static void sort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}	
	public static void main(String[] args) {
		//int[] a={1,5,56,89,99,3,0};
		int[] a=new int[5];
		for(int i=0;i<a.length;i++) {
			Scanner s=new Scanner(System.in);
			System.out.print("请输入第"+(i+1)+"个数:");
			a[i]=s.nextInt();
		}
		sort(a);
	}
}
