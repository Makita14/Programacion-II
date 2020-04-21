import java.util.Scanner;

public class ultimo {
	public static void main(String[] args) {
		
        Scanner reander = new  Scanner ( System.in);
        System.out.println ( " Ingrese una cadena de texto a verificar: " );
        String cadena = reander.nextLine();
     
        int contador=0;
        for (int i = 0 ; i < cadena.length(); i++) {
        	if(
        			(cadena.charAt(i)=='a')||
        			(cadena.charAt(i)=='e')||
        			(cadena.charAt(i)=='i')||
        			(cadena.charAt(i)=='o')||
        			(cadena.charAt(i)=='u')
        	){
        		contador++;        		
        	}
        }
        System.out.print("Esta frase tiene " + contador + " vocales");
	}
}
