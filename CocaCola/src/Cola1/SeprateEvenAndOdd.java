package Cola1;

import java.util.Arrays;

public class SeprateEvenAndOdd {

	public static void main(String[] args) {
		int arr[]= {6,9,10,33,2,43,4,55,8};
		int len=arr.length;
		 int a[]=new int[len];
		 int d=0;
            for(int i=0;i<len;i++) {
            	if(arr[i]%2==0) {
            		   a[d] =arr[i];  
            		   d++;
            	}
            	
            }
           for(int i=0;i<len;i++) {
        	   if(arr[i]%2!=0) {
        		       a[d] =arr[i];
        		       d++;
        		   
        	   }
           }
            
            System.out.println(Arrays.toString(a));
	
	}
}

				  
			  
		
			 
			  
			
			
		  
				    
			
		

				
			
		
		
		
		
		
	


