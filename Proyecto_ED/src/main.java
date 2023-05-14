import java.util.ArrayList;
import java.util.Scanner;

public class main {
	public static ArrayList<Podemon> listaPodemon = new ArrayList<Podemon>();
	public static void main(String[] args) {
		int ini=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Selecciona una opción");
		menu();
		ini = sc.nextInt();
		
		do {
			switch (ini) {
			case 1: {
				FrameCrear.main(args);
			}
			case 2: {
				Metodos.listar(listaPodemon);
			}
			case 3: {

			}
			case 4: {

			}
			case 5: {

			}
			case 6: {

			}
			default:
				menu();
				ini = sc.nextInt();			}
		} while (ini != 0);
	}

	public static void menu() {

		String[] op = {"1 - Crear Podemon","2 - Listar Podemones", "3 - Atacar", "4 - Volver a empezar", "5 - Guardar en Fichero", "6 - Salir"};
		for (int i = 0; i < op.length; i++) {
			System.out.println(op[i]);
		}
	}

}