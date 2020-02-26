package com.cts.training.Homework;
import java.util.Scanner;
public class DaphneArray {
	public static void main(String[] args) {  
		int count=0;
		int endcount=0;
		int odd=0;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the array numbers");
        int num=Sc.nextInt();
        int []arr = new int[num] ;
        System.out.println("Enter the array numbers");
        for(int i=0;i<num;i++)
        {
        	arr[i]=Sc.nextInt();
        }
        
//        for(int j=0;j<=num;j++)
//        {
//        	System.out.println("Array is="+arr[j]);
//        }
        int len=arr.length;
        System.out.println("length is:"+len);
        for (int j=0; j<len; j++)
        {
        	if(arr[j]%2==0)
        	{
        		count++;
        		
        	}
        }
        	System.out.println("Even number is:"+count);
        	for (int i=0; i<len; i++)
            {
            	if(arr[i]%2!=0)
            	{
            		odd++;
            		
            	}
            	
        }
        	System.out.println("Even number is:"+odd);
        	
        	
        	 for(int j=len-1 ;j>0;j--)
             {
             	if( arr[j]%2==0)
             	{
            
             		endcount++;
      
             	}
             	else
             	{
             		break;
             		
             	}
             }
        	 if(count==endcount && odd>=1)
             {
             	System.out.println("Daphne Array");
             }
             else
             {
             	System.out.println("Not a Daphne Array");
             }
             		
            
     
	}
}

        //initialized the counter to 0
//        int counter = 0;  
//        
//        for (int i=0; i<=str.length()-1; i++) {  
//            if(str.charAt(i) == 'B') { 
//            	//increasing the counter value at each occurrence of 'B'
//                counter++;  
//            }  
//        }  
//        System.out.println("Char 'B' occurred "+counter+" times in the string");  
//   }  
//}
//
//}
