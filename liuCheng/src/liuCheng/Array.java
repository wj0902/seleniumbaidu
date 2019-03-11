package liuCheng;
import java.util.Scanner;
public class Array {
	static int getMax(int[] arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int[] a=new int[5];
		for(int i=0;i<a.length;i++) {
			Scanner s=new Scanner(System.in);
			System.out.print("ÇëÊäÈëµÚ"+(i+1)+"Êý:");
			a[i]=s.nextInt();
		}
		System.out.println(getMax(a));
		
		}
	}

