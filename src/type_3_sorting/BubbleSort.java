package type_3_sorting;

public class BubbleSort {

	public static void main(String[] args) {

		int arr[] = {2,4,6,5,3};
		arr = doBubbleSort(arr);

	}

	static int[] doBubbleSort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{if(arr[j]>arr[j+1])
			{
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
			}
			System.out.print("Iteration "+(i+1)+": ");
			printArray(arr);
		}

		return arr;
	}

	public static void printArray(int arr[])
	{
		for (int i = 0; i <arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
