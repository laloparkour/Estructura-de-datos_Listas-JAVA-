package listaSimple;

public class Nodo {
	private int dato;
	private Nodo siguiente; //Apuntador
	
	public Nodo(int dato) {
		this.dato = dato;
	}
	
	public int getDato() {
		return dato;
	}
	
	public void setDato(int dato) {
		this.dato = dato;
	}
	
	public Nodo getSiguiente() {
		return siguiente;
	}
	
	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
}
