package cn.test;

import java.util.*;

public class MaoPao {
	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		int b[]=new int[5];
		for(int m=0;m<b.length;m++) {	
		System.out.print("请输入第"+(m+1)+"个数:");
		b[m]=n.nextInt();
		}
		/*Mao w=new Mao();
		w.m(b,5);*/
		Xuan r=new Xuan();
		r.x(b,5);
	}
}
class Mao{
	public void m(int[] arr,int n) {
		int i=0,j=0,temp=0;
		for(i=0;i<n;i++) {
			for(j=0;j<n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(i=0;i<n;i++) {
			System.out.print(arr[i]);
		}
	}
}
class Xuan{
	public void x(int[] arr,int n) {
		int i=0,j=0,temp=0;
		for(i=0;i<n-1;i++) {
			for(j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}