import java.util.Scanner;

public class cuarto {

	public static void main(String[] args) {
		
		 Scanner reander =  new  Scanner ( System . in);
	        System.out.print ( " Ingrese un numero " );
	        int num1 = reander.nextInt ();
	        System.out. print( " Ingrese otro numero " );
	        int num2 = reander.nextInt ();
	        	        
	        if (num1 > num2) {
	           for(int i=num2;i<=num1;i++){
	        	   if (i % 5 != 0 ) {
		                System.out.println(i);
	           }
	        } 
	        }else{
	        	for( int i=num1;i<=num2;i++){
	        		if (i % 5 != 0 ) {
		                System.out.println(i);
	            }   
	        }
	    }
	}
}