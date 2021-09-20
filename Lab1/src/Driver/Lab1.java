package Driver;

import java.util.Scanner;

import Code.ArrayCreator;
import Code.MainLogic;

public class Lab1 {

	private ArrayCreator ac;
	private MainLogic ml;
	private static int[] arr;
	private int index,check,numbers;
	private boolean answer;

	Lab1()
	{
		System.out.println("Enter the size of transaction array");
		Scanner sc=new Scanner(System.in);
		index = sc.nextInt();
		//arr=new int[index+1];
		ac=new ArrayCreator();
		arr=ac.funArrayCreator(index);
		//arr[index]=0;

		ml=new MainLogic();
		System.out.println("Enter the total no of targets that needs to be achieved");

		numbers = sc.nextInt();
		for(int i=0;i<numbers;i++)
		{
			check=sc.nextInt();
			answer=ml.funMainLogic(arr,check);
			if(answer)
			{
				System.out.println("Given target is not achieved");
			}

		}

sc.close();

	}
	public static void main(String args[])
	{
		new Lab1();
	}


}
