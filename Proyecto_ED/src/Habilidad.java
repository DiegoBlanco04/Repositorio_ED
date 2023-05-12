
public class Habilidad {
	private String nombre;
	private int danyo;
	private int cont;
	
	public Habilidad(String nombre, int danyo, int cont) {
		super();
		this.nombre = nombre;
		this.danyo = danyo;
		this.cont = cont;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDanyo() {
		return danyo;
	}

	public void setDanyo(int danyo) {
		this.danyo = danyo;
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}
	
	
}