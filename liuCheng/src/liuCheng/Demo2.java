package liuCheng;

public class Demo2 {
	public static void boubleSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
		for(int j=i+1;j<arr.length;j++) {//for(int j=0;j<arr.length-i-1;j++)
				if(arr[i]>arr[j]) {
					int temp=0;
					temp=arr[i];
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
		int[] a={1,5,56,89,99,3,0};
		boubleSort(a);
	}
}
