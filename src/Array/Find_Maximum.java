package Array;

public class Find_Maximum 
{
	// WAJP TO FIND MAXIMUM ELEMENT OF THE ARRAY?
	public static void main(String[] args) 
	{
		int [] arr= {4,2,5,1,3};
		System.out.println("ARRAY ELEMENTS : ");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("MAXIMUM VALUE IS : "+max);
	}
}
