package Practice;

public class Array_Equality {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
        
        int arr1[] = {1,2,3,4,5};
        
        boolean equalorNot = true;
        
        if(arr.length == arr1.length) {
        	for(int i =0; i<=arr.length-1;i++) {
        		
        		if(arr[i] != arr1[i]) {
        			
        			equalorNot = false;
        		
        		}
        	}
        }
        
        else {
			equalorNot = false;

        	
        }
          
        if(equalorNot) {
        	System.out.println("Two array are equal");
        }
        else {
        	System.out.println("Two array are not equal");
        }
       
	}

}
