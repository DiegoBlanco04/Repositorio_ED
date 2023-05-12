import java.util.ArrayList;
import java.util.Scanner;

public class main {
	ArrayList<Podemon> listaPodemon = new ArrayList<Podemon>();
	public static void main(String[] args) {
		int ini=0;
		Scanner sc = new Scanner(System.in);
		menu();
		while(ini!=6) {
			
			ini=sc.nextInt();
			if(ini==1) {
				System.out.println("1-Crear Podemon");

			}
			if(ini==2) {
				System.out.println("2-Listar Podemones");

			}
			if(ini==3) {
				System.out.println("3-Atacar");

			}
			if(ini==4) {
				System.out.println("4-Volver a empezar");

			}
			if(ini==5) {
				System.out.println("5-Guardar en fichero");

			}
			System.out.println("-----------------------");
			menu();
		}
	}
	public static void menu() {
		System.out.println("1-Crear Podemon");
		System.out.println("2-Listar Podemones");
		System.out.println("3-Atacar");
		System.out.println("4-Volver a empezar");
		System.out.println("5-Guardar en fichero");
		System.out.println("6-Salir");
	}

}