import java.util.Scanner;

public class vector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		int[]numeros=new int [5];
		
		System.out.println("Ingrese los numeros del vector");
		for (int i=0;i<5;i++) {
			System.out.print("Digite un numero: ");
			numeros[i]=entrada.nextInt();
		}
		System.out.println("Los numeros guardados en el vector son..");
		for (int i:numeros) {
			System.out.println(i);
		}
	
	}

}
