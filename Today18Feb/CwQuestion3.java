package com.cognizant.traning;
//import org.apache.commons.lang3.text.WordUtils;


public class CwQuestion3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Global Warming";
		String last3;
		
		
		 StringBuffer newStr=new StringBuffer(name);
		
		//1.  To display the last four characters.
		
		
		
		if (name== null || name.length() < 4) {
		    last3 = name;
		}
		else
		{
		    last3 = name.substring(name.length() - 4);
		}
		System.out.println("Last three character is="+last3);
		
//	2.	 To display the substring starting from index 4 and ending at index 8.
		System.out.println("charcter at index " +name.substring(4,10));

		
		
//	c) To check whether string has alphanumeric characters or not.
		
		boolean result = name.matches("^.*[^a-zA-Z0-9 ].*$");
		System.out.println("Alpha charcter is or "+result); 
		
// f) To display the starting index for the substring "Wa".
		
		String resultt= name.substring(6,9)  ;
		System.out.println("charcter is"+""+resultt);
		
		// g) To change the case of the given string.
		
		String resu=name.toUpperCase();
		System.out.println("change character is"+" "+resu);
		
		 for(int i = 0; i < name.length(); i++) {  
			
	            //Checks for lower case character  
	            if(Character.isLowerCase(name.charAt(i)))
	            { 
	            	//toUpperCase() function  
	  newStr.setCharAt(i, Character.toUpperCase(name.charAt(i)));  
	            }  
	            //Checks for upper case character  
	            else if(Character.isUpperCase(name.charAt(i))) {  
	                //Convert it into upper case using toLowerCase() function  
	                newStr.setCharAt(i, Character.toLowerCase(name.charAt(i)));  
	            }  
	        }  
	        System.out.println("String after case conversion : " + newStr);  
	     
	
	
	// i) To replace all the occurrences of letter "a" in the string with "*"
	 System.out.println("String after replacing all 't' with 'a': " + name.replace('a', '*'));

	 
	 
	//String r= WordUtils.capitalize(name);
	
	
	
	
	//To trim the last four characters from the string.
	 int length=name.length();
	System.out.println(name.substring(0, length - 4));
	// To trim the first four characters from the string
	System.out.println(name.substring(4,length));
	
	
	
	// h) To check if the string is in title case.
	boolean result1=false;
	//String msg=" Global Warming";
	String [] words=name.split("\\s+");
for(int i=0;i<words.length;i++)
{
	char ch=words[i].charAt(0);
	if(ch>=65 && ch<=90)
	{
		result1=true;
	}
	else
	{
		result1= false;
		break;
	}
	System.out.println(result1);
}

		}
}

		
	

