package listaDoble;

public class Lista {
	private Nodo head = null; //El apuntador head nos indica en donde empieza

	public void insertar(int dato, int pos) {
		Nodo p = new Nodo(dato); //Creamos un nuevo nodo con el dato que le pasamos al constructor

		//Valida si la lista esta vacia y si se cumple inserta a el nodo a el primer elemento de la lista
		if (head == null) { //Cuando este vacia la lista
			head = p; //Asignamos el NODO nuevo a el inicio y tanto el anterior como el siguiente del nuevo HEAD apuntan a NULL
		} else {
			//Cuando vamos a insertar al inicio nos vamos al head actual al que es al primero
			//En el caso que queramso insertar en la posicion 0 y ya exista NODO, se insertara antes de head y head se mueve
			if (pos == 0) { //Cuando vamos a insertar al inicio
				//Nos vamos al head actual al que es el primero y movemos su apuntador anterior al nuevo nodo al que quedara atras
				head.setAnterior(p);
				p.setSiguiente(head);
				head = p;
			} else { //Cuando vamos a insertar en otra parte
				Nodo q = head;
				for (int i = 1; i < pos; i++) {
					q = q.getSiguiente();
				}
				p.setAnterior(q);
				p.setSiguiente(q.getSiguiente());
				q.setSiguiente(p);
				
				if(p.getSiguiente()!=null)
					p.getSiguiente().setAnterior(p);
				
			}
		}
	}

	public void eliminar(int pos) {
		if (head == null)
			System.out.println("LISTA VACIA");
		else {
			if (pos == 0) {
				head = head.getSiguiente();
				head.setAnterior(null);
			} else {
				Nodo q = head;
				for (int i = 1; i < pos; i++) {
					q = q.getSiguiente();
				}

				q.setSiguiente(q.getSiguiente().getSiguiente());
				
				if(q.getSiguiente()!=null)
					q.getSiguiente().setAnterior(q);
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
