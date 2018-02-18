/****************************************************************************
 *
 * Created by: Heejo Suh
 * Created on: Feb 2018
 * Created for: learning
 * 
 * Program that returns a version of the original string as follows: 
 * each digit 0-9 that appears in the original string is replaced by that many 
 * occurrences of the character to the right of the digit. 
 * 
 * So the string "a3tx2z" yields "attttxzzz", and "12x" yields "2xxx". 
 * 
 * A digit not followed by a character (i.e. at the end of the string) 
 * is replaced by nothing.
 *     
 *
 ****************************************************************************/



//have to import the following:
import java.util.Scanner;

//****************************************************************************
public class StringBlowup {

	//-----------------------------------------
		//for return methods
			     //return type is Int
	    public static Integer toNumber(String str){
		//Gets the input from the user
	    	//Checks if Integer
	    	
	    	Integer numerical;
	    	try {
	    		//check if character is a number
	    		numerical = Integer.parseInt(str);//Convert string to integer
	    		
				//if it's a number then return the value
	    		return numerical;
	    		
	    	} catch (NumberFormatException stringInput) {
	    		//if not number then return null
	    		return null;
	    	}
	    	
	    }//closing for toNumber
	   
	
	  
	    
	    //-----------------------------------------    
	    public static void main(String[] args) {
	    	//String Blowup
	    	
	    	//set up a scanner to get the response from the user
	    	Scanner scanner = new Scanner(System.in);
	    	
	    	//set variables to a default	
	    	String input = null, outputString = "";
	    	
	       	//----------------------------------------------------------------
	        //while appropriate response has not been collected
	       //use while-true functions to break out of
	    	while (true) {
	    		//keep asking for input
	    		System.out.println("Input a string: ");
			
	    		//Get input as a string value-----
	    		input = scanner.nextLine();
	    		
	    		//have to check if actual input has been put since 
	    		//can't compare nil to string or number.
	    	    if (input.length() != 0){
	    	    	//send each letter to string blowup
	    	    	
	    	    	// for integer x from a ~ less than b, and increasing the value by 1 each time
	    	    	//***java counts strings from 0 !!!*******
	    	    	for ( int character=0; character<input.length(); character++ ) {
	    	    		//Character.toString(char)
	    	    		//need to convert char to string
	    	             String currentChar = String.valueOf(input.charAt(character));
	    	             //if character is a number
	    	             if (toNumber(currentChar) != null) {
	    	            	 //Check if it's the last value
	    	            	 if (character == input.length()-1) {
	    	            		 //if number is at the last place, skip it since no characters are on the right of it
	    	            	 }else {
	    	            		 //if number is not at the last place
	    	            		 String charAfter = String.valueOf(input.charAt(character+1));
	    	            		 //add that many of the following characters to string
    	            			 for ( int number=0; number<toNumber(currentChar); number++ ) { 
    	            				 outputString = outputString + charAfter;
    	            			 }
	    	            	 }
	    	             }else {
	    	            	 //if not a number
	    	            	 outputString = outputString + currentChar;
	    	             }
	    	    	}

	    	             System.out.println("The blown-up string is :" + outputString);
	    	             break;
	    	    }else{
	    	    	//if entered in nothing
	    	    	System.out.println("ERROR: no string found. Try again");
	    	    }
	    	}//closing for while
	    	
		    		
	    			
	    
	    }//closing for main
	}//closing for public class StringBlowup