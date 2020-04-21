import java.util.Scanner;

public class segundo {

	public static void main(String[] args) {
		segundo sec=new segundo();
		sec.datos();
		sec.proceso();
	}
		Scanner reander=new Scanner(System.in);
		int inicio,fin;
			public void datos(){
			System.out.println("Ingrese los valores");
			System.out.print("Ingrese el primer valor : ");
			inicio = reander.nextInt();
			System.out.print("Ingrese el segundo valor: ");
			fin = reander.nextInt();
		}
		public void proceso(){
			for(int x=inicio;x<=fin;x++){
				System.out.println(x);				
			}
		}
	}