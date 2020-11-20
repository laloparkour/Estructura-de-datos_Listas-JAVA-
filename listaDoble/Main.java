package listaDoble;

public class Main {

	public static void main(String[] args) {
		Lista lista = new Lista();

		lista.imprimir();

		System.out.println("---------------------");
		lista.insertar(1, 0);
		lista.imprimir();
		System.out.println("---------------------");
		lista.insertar(2, 1);
		lista.imprimir();
		System.out.println("---------------------");
		lista.insertar(3, 0);
		lista.imprimir();
		System.out.println("---------------------");
		lista.insertar(4, 2);
		lista.imprimir();
		System.out.println("---------------------");
		lista.insertar(5, 1);
		lista.imprimir();
		System.out.println("---------------------");
		lista.eliminar(0);
		lista.imprimir();
		System.out.println("---------------------");
		lista.eliminar(2);
		lista.imprimir();
		System.out.println("---------------------");
		lista.eliminar(2);
		lista.imprimir();
		System.out.println("---------------------");
		System.out.println(lista.leerDato(0));
		System.out.println("---------------------");
		System.out.println(lista.leerDato(1));
		System.out.println("---------------------");

	}

}
