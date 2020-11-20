package listaSimple;

/*
 * LISTAS(Estructura de Datos)
 * Consiste en una secuencia de nodos, en los que se guardan campos de datos
 * arbitrarios y una o más referencia, enlaces o punteros al nodo anterior o posterior
 * Es dinamica, no es necesario conocer la cantidad de elementos que va a contener
 * Los NODOS o elementos de una lista contienen el dato a almacenar y un enlace
 * al siguiente elemento
 * 
 * Es un tipo de dato autoreferenciado por que contiene un apuntador 
 * a otro dato del mismo tipo
 * 
 * TIPOS DE LISTAS
 * Enlazadas
 * Doblemente Enlazadas
 * Enlazadas Circulares
 * Enlazadas Doblemente Circulares
 * Listas Ortogonales
 * 
 * Elementos de un NODO
 * 
 * CAMPO CON INFORMACION
 * Guarda un elemento del tipo de la lista y mas apuntadores que guardan
 * las posiciones de otros nodos ya sean, anteriores, siguientes, arriba, abajo
 * 
 * CAMPO CON APUNTADOR
 * Consiste en un objeto de la misma clase que el objeto al que hace referencia
 * Consiste en un campo con un apuntador al siguiente nodo de la lista
 * 
 * HEAD
 * Guarda la posicion del primer nodo de la lista
 * 
 
 * 
 * LISTAS ENLAZADAS
 * 

 * 
 * */

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
//		lista.imprimir();
//		System.out.println("---------------------");
//		lista.insertar(4, 2);
//		lista.imprimir();
//		System.out.println("---------------------");
//		lista.insertar(5, 1);
//		lista.imprimir();
//		System.out.println("---------------------");
//		lista.eliminar(0);
//		lista.imprimir();
//		System.out.println("---------------------");
//		lista.eliminar(2);
//		lista.imprimir();
//		System.out.println("---------------------");
//		lista.eliminar(2);
//		lista.imprimir();
//		System.out.println("---------------------");
//		System.out.println(lista.leerDato(0));
//		System.out.println("---------------------");
//		System.out.println(lista.leerDato(1));
//		System.out.println("---------------------");

	}

}
