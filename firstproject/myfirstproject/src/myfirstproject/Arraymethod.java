package myfirstproject;

public class Arraymethod {

	public static void main(String[] args) {
		
		int []ar= {10,20,30,40};
		int Addition=sumArray(ar);
		
		//int Add=add(20,30);
		
		System.out.println("Addition: "+Addition);
	}
	public static int sumArray(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		return sum;
		}
}


