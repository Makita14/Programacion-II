import java.util.Scanner;

public class tercero {

	public static void main(String[] args) {
		
		Scanner reander=new Scanner(System.in);
		int in,fi,men,may;
		
			System.out.println("Ingrese los valores");
			System.out.print("Ingrese el primer valor : ");
			in = reander.nextInt();
			System.out.print("Ingrese el segundo valor: ");
			fi = reander.nextInt();
			
			if (in > fi) {
	            may = in;
	            men = fi;
	        } else {
	            may = fi;
	            men = in;
	        }
			
			System.out.println("\nN�meros desde " + men + " hasta " + may + " : ");
			for (int i = men; i <= may; i++) {
	            System.out.println(i);
	        }
	}

}