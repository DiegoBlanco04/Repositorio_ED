import java.util.ArrayList;
import java.util.Scanner;

public class main {
	public static ArrayList<Podemon> listaPodemon = new ArrayList<Podemon>();
	public static void main(String[] args) {
		
		listaPodemon.add(new Sireno(100, 100, 5, "Gitano de Barrio", new Habilidad("Navajazo Violento", 10, 5)));
		listaPodemon.add(new Sireno(100, 100, 5, "Gitano de Puerto", new Habilidad("Duchar", 15, 5)));
		
		int op=-1;
		Scanner sc = new Scanner(System.in);

		System.out.println("Selecciona una opción");
		menu();
		op = sc.nextInt();

		while (op != 0) {
			if (op == 1) {
				FrameCrear.main(args);
			}
			if (op == 2) {
				Metodos.listar(listaPodemon);
			}
			if (op == 3) {
				partida();
			}

			menu();
			op = sc.nextInt();
		}	
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
		sinAtacar.remove(id); // REMOVE
		System.out.println("Selecciona un Podemon");
		Metodos.listar(sinAtacar);
		id = sc.nextInt();
		Podemon atacado = vivos.get(id);

		System.out.println(atacante.nombre + " está atacando a " + atacado.nombre);
		System.out.println("Selecciona el tipo de ataque:");
		System.out.println("(1) Ataque normal");
		System.out.println("(2) Habilidad");
		System.out.println("(3) Vuelo/Canto");
		int op = sc.nextInt();
		if (op == 1) {
			int hp = atacado.getVida_actual() - atacante.getDanyo();
			if (hp > 0) {
				atacado.setVida_actual(hp);
				// Resultado de Batalla:
				
				String cad = atacado.nombre + " " + atacado.vida_actual;
				String cad1 = atacante.nombre + " " + atacante.vida_actual;
				
				System.out.println(cad);
				System.out.println(cad1);
			} else if (hp <= 0) {
				//atacado.setVida_actual(0);
				//vivos.remove(id);
				//sinAtacar.remove(id);
				//muertos.add(atacado);
			}
		}
	}
}