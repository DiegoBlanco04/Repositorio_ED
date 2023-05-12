
public class Fenix extends Podemon{
	private boolean enVuelo;

	public Fenix(int vida_max, int vida_actual, String nombre, Habilidad hab, boolean enVuelo) {
		super(vida_max, vida_actual, nombre, hab);
		this.enVuelo = enVuelo;
	}

	public boolean isEnVuelo() {
		return enVuelo;
	}

	public void setEnVuelo(boolean enVuelo) {
		this.enVuelo = enVuelo;
	}
	
}
