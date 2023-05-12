
public class Podemon {
	protected int vida_max;
	protected int vida_actual;
	protected String nombre;
	protected Habilidad hab;
	
	public Podemon(int vida_max, int vida_actual, String nombre, Habilidad hab) {
		super();
		this.vida_max = vida_max;
		this.vida_actual = vida_actual;
		this.nombre = nombre;
		this.hab = hab;
	}

	public int getVida_max() {
		return vida_max;
	}

	public void setVida_max(int vida_max) {
		this.vida_max = vida_max;
	}

	public int getVida_actual() {
		return vida_actual;
	}

	public void setVida_actual(int vida_actual) {
		this.vida_actual = vida_actual;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Habilidad getHab() {
		return hab;
	}

	public void setHab(Habilidad hab) {
		this.hab = hab;
	}
	
	
	
	
}