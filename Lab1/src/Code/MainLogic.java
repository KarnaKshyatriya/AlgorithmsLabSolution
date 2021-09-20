package Code;

public class MainLogic {

	private int arraySum;
	private boolean check;
	public boolean funMainLogic(int[] a,int val)
	{
		check=true;
		arraySum=0;
		int i=0;
		do
		{
			arraySum+=a[i];
			i++;
			if(val>arraySum)
			{

			}
			else
			{
				System.out.println("Target achieved after "+i+" transactions");	
				check=false;
				break;	
			}

		}while(i<a.length);
		return check;
	}


}
