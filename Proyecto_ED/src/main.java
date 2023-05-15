import java.util.ArrayList;
import java.util.Scanner;

public class main {
	public static ArrayList<Podemon> listaPodemon = new ArrayList<Podemon>();
	public static void main(String[] args) {
		int ini=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Selecciona una opción");
		menu();
<<<<<<< Updated upstream
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
				partida();
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
=======
		while(ini!=6) {
			
			ini=sc.nextInt();
			if(ini==1) {
				System.out.println("1-Crear Podemon");
				menu();


			}
			if(ini==2) {
				System.out.println("2-Listar Podemones");
				menu();

			}
			if(ini==3) {
				System.out.println("3-Atacar");
				menu();

			}
			if(ini==4) {
				System.out.println("4-Volver a empezar");
				menu();

			}
			if(ini==5) {
				System.out.println("5-Guardar en fichero");
				menu();

			}
			System.out.println("-----------------------");
		}
>>>>>>> Stashed changes
	}

	public static void menu() {

		String[] op = {"1 - Crear Podemon","2 - Listar Podemones", "3 - Comenzar una Partida", "4 - Volver a empezar", "5 - Guardar en Fichero", "6 - Salir"};
		for (int i = 0; i < op.length; i++) {
			System.out.println(op[i]);
		}
	}
	
	public static void partida() {
		int turno = 1;
		ArrayList<Podemon> vivos = listaPodemon;
		ArrayList<Podemon> muertos = new ArrayList<Podemon>();
		ArrayList<Podemon> sinAtacar = listaPodemon;
		
		while (sinAtacar.size() > 1) {
			realizarAtaque(vivos, muertos, sinAtacar);
			
		}
		
	}
	
	public static void realizarAtaque(ArrayList<Podemon> vivos, ArrayList<Podemon> muertos, ArrayList<Podemon> sinAtacar) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Selecciona un Podemon");
		Metodos.listar(vivos);
		int id = sc.nextInt();
		Podemon atacante = vivos.get(id);
		sinAtacar.remove(id);
		System.out.println("Selecciona un Podemon");
		Metodos.listar(sinAtacar);
		id = sc.nextInt();
		Podemon atacado = vivos.get(id);
		
		System.out.println(atacante + " está atacando a " + atacado);
		System.out.println("Selecciona el tipo de ataque:");
		System.out.println("(1) Ataque normal");
		System.out.println("(2) Habilidad");
		System.out.println("(3) Vuelo/Canto");
		int op = sc.nextInt();
		switch (op) {
		case 1:
				int hp = atacado.getVida_actual() - atacante.getDanyo();
				if (hp > 0) {
					atacado.setVida_actual(hp);
				} else {
					atacado.setVida_actual(0);
					vivos.remove(id);
					sinAtacar.remove(id);
					muertos.add(atacado);
				}
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		default:
			break;
		}
	}

}