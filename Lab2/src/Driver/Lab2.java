package Driver;

import java.util.Scanner;


import Codes.MergeSortFunction;
import Codes.NotesCount;

public class Lab2 {

	private int a[];
	private int limit;
	private int note_denomination;
	private NotesCount nc;
	private MergeSortFunction mf;
	Lab2()
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the size of currency denominations ");
		limit=sc.nextInt();
		a=new int[limit];
		System.out.println("Enter the currency denominations value");
		for(int i=0;i<limit;i++)
		{
			a[i]=sc.nextInt();
		}
		int len=a.length;

		//MergeSortFunction sorts the array created by MergeSortClass in reverse order
		mf=new MergeSortFunction();
		mf.mergeSortFun(a,0,len-1);  

		//Creating object for the class which returns the output
		//here NotesCount class contains the logic for output answer
		nc=new NotesCount();
		System.out.println("Enter the amount you want to pay");
		note_denomination=sc.nextInt();
		System.out.println(note_denomination);
		nc.count(a,note_denomination );

		sc.close();
	}

	public static void main(String args[])
	{
		new Lab2();
	}  

}

