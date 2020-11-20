package listaCircularDoble;

public class Main {

	public static void main(String[] args) {
		Lista lista = new Lista();
		
		lista.imprimir();
	
		System.out.println("-----------------");
		lista.insertar(5, 0);
		lista.imprimir();
		System.out.println("-----------------");
		lista.insertar(8, 0);
		lista.imprimir();
		System.out.println("-----------------");
		
	}

}
