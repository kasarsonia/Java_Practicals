package bubbleSort;

public class Bubble {
	
	public void bubble(int []arr)
	{
		int n = arr.length;
		int temp = 0;
		int i , j;
		System.out.println("Before sorting");
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("\nAfter sorting");
		
		for(i=n-1;i>=0;i--)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
	

}
