package Code;

import java.util.Scanner;

public class ArrayCreator {

	private int[] arr;

	public int[] funArrayCreator(int limit) {
		// TODO Auto-generated method stub

		int[] arr = new int[limit];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of Array ::");
		for(int i=0;i<limit;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;

	}

}
