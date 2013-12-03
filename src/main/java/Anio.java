public class Anio {

	private int anio;

	public Anio() {
	}

	public Anio(int anio) {
		this.anio = anio;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public boolean esBisiesto() {
		boolean res = false;
		if (this.anio % 4 == 0
				&& (this.anio % 100 != 0 || this.anio % 400 == 0)) {
			res = true;
		} else {
			res = false;
		}
		return res;
	}
}
