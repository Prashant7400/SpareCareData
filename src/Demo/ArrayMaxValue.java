package Demo;

public class ArrayMaxValue {

	public static void main(String[] args) {

		int arr[] = {71,4,7,2,16,7,256,67,1125,4545};
		
		int i;
		
		int max = arr[0];
		
		for(i =0;i<=arr.length-1;i++) {
			
			if(arr[i]> max) 
				max = arr[i];
				
		}
		System.out.println(max);		
	}

}
