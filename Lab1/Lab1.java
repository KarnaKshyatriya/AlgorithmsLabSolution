package Codes;

public class NotesCount {

	private int remainder;

	public void count(int a[],int value)
	{
		System.out.println("Your payment approach in order to give min no of notes will be");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<=value)
			{
				remainder=value/a[i];
				value=value%a[i];
				System.out.println(a[i]+" :: "+remainder);
			}

		}

	}

}
