package Galeria;

public class Escultura {
	
	private float alto;
	private float ancho;
	private float profundidad;
	
	public Escultura(float alto, float ancho, float profundidad) {
		
		this.alto = alto;
		this.ancho = ancho;
		this.profundidad = profundidad;
	}
	
	
	public float getAlto() {
		return alto;
	}
	public void setAlto(float alto) {
		this.alto = alto;
	}
	public float getAncho() {
		return ancho;
	}
	public void setAncho(float ancho) {
		this.ancho = ancho;
	}
	public float getProfundidad() {
		return profundidad;
	}
	public void setProfundidad(float profundidad) {
		this.profundidad = profundidad;
	}

}
