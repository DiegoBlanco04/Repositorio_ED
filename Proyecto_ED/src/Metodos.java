import java.util.ArrayList;

public class Metodos {

	public static boolean existe(ArrayList<Podemon> al, Podemon pod) {
		for (int i = 0; i < al.size(); i++) {
			if (al.get(i).getNombre().equals(pod.getNombre())) {
				return true;
			}
		}
		return false;
	}
	
	public static void listar(ArrayList<Podemon> al) {
		System.out.println("PODEMONS EXISTENTES:");
		for (int i = 0; i < al.size(); i++) {
			System.out.println("(" + i + ")  -- " + al.get(i).getNombre());
		}
	}
	
}