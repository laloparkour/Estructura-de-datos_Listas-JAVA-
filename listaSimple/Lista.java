package listaSimple;

public class Lista {
	private Nodo head = null;

	public void insertar(int dato, int pos) {
		Nodo p = new Nodo(dato); //
		
		if (head == null) { //Cuando la lista este vacia, osea que apunte a NULL
			head = p; //Asigna a head el nodo auxiliar que contiene la informacion recibida por parametro
		} else {
			if (pos == 0) { //Cuando ya tenemos un nodo
				p.setSiguiente(head); //Le asigna al siguiente apuntador el apuntador head que apunta a null
				head = p; //al apuntador head le asigna la informacion el nodo auxiliar
			} else { //Cuando tenemos dos o mas nodos
				Nodo q = head; //Asigna a un noxo auxiliar lo que hay en el apuntador head
				for (int i = 1; i < pos; i++) { //Recorre la lista hasta la posicion que fijamos
					q = q.getSiguiente(); //Asigna lo que hay en el apuntador siguienrte
				}
				p.setSiguiente(q.getSiguiente());
				q.setSiguiente(p);
			}
		}
	}

	public void eliminar(int pos) {
		if (head == null)
			System.out.println("LISTA VACIA");
		else {
			if (pos == 0) {
				head = head.getSiguiente();
			} else {
				Nodo q = head;
				for (int i = 1; i < pos; i++) {
					q = q.getSiguiente();
				}

				q.setSiguiente(q.getSiguiente().getSiguiente());
			}
		}
	}

	public int leerDato(int pos) {
		if (head == null) {
			System.out.println("LISTA VACIA");
			return -999;
		} else {
			Nodo q = head;
			for (int i = 0; i < pos; i++) {
				q = q.getSiguiente();
			}

			return q.getDato();

		}
	}

	public void imprimir() {
		if (head == null)
			System.out.println("LISTA VACIA");
		else {
			Nodo p = head;
			while (p != null) {
				System.out.println(p.getDato());
				p = p.getSiguiente();
			}
		}
	}
}
