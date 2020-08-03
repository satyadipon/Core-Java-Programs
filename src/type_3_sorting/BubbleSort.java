package type_3_sorting;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,4,6,5,3};
		arr = doBubbleSort(arr);
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");

	}
	
	static int[] doBubbleSort(int[] arr)
	{
		for(int i=1;i<arr.length;i++)
			{
			for(int j=0;j<arr.length-1;j++)
				if(arr[i]<arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		return arr;
	}

}
