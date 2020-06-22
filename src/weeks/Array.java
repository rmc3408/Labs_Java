

public class Array {

	public static void main(String[] args) {
		
		// 3 forms to declaring array.
		int a[];			  // only array declared, no size defined.
		int[] b = new int[4]; //pre-defined size;
		
		
		int c[] = new int[2]; //simplified
		c[0] = 5;
		c[1] = 10;
		
		
		//if not sized defined, you CAN declare array elements.
		int[] d = new int[]{1,2,3,4,5,6,7,8,9,10}; 
		int e[] = {10,20,30};		
		
		
		for (int i : e) {
			System.out.println(i);
		}
		Array m = new Array();
		
		System.out.printf("the largest number is %d", maxo(d));
	
	}
	public static int maxo(int[] insideArray) 
	{
		int max = 0;
		int min = insideArray[0];
		
		for(int i=0; i<insideArray.length;i++)
		{
			if (insideArray[i] > max) 
			{
				max = insideArray[i];
			}
			if (insideArray[i] < min) 
			{
				max = insideArray[i];
			}
		}
	
		System.out.printf("min is %d%n", min);
		return max;
		
	}

}