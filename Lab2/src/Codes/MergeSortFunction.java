package Codes;

public class MergeSortFunction {

	public void mergeSortFun(int a[], int start, int end)  
	{  
		int mid;  
		if(start<end)  
		{  
			mid = (start+end)/2;  
			mergeSortFun(a,start,mid);  
			mergeSortFun(a,mid+1,end);  
			merge(a,start,mid,end);  
		}  
	}  
	public void merge(int a[], int start, int mid, int end)  
	{  
		int i=start,j=mid+1,k,index = start;  
		int[] temp=new int[a.length]; 

		while(i<=mid && j<=end)  
		{  
			if(a[i]>a[j])  
			{  
				temp[index] = a[i];  
				i = i+1;  
			}  
			else   
			{  
				temp[index] = a[j];  
				j = j+1;   
			}  
			index++;  
		}  
		if(i>mid)  
		{  
			while(j<=end)  
			{  
				temp[index] = a[j];  
				index++;  
				j++;  
			}  
		}  
		else   
		{  
			while(i<=mid)  
			{  
				temp[index] = a[i];  
				index++;  
				i++;  
			}  
		}  
		k = start;  
		while(k<index)  
		{  
			a[k]=temp[k];  
			k++;  
		}  
	}  

}
