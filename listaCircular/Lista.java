package listaCircular;

public class Lista {
	private Nodo head = null;

	public void insertar(int dato, int pos) {
		Nodo p = new Nodo(dato);

		if (head == null) {
			head = p;
			head.setSiguiente(head);
		} else {
			if (pos == 0) {
				Nodo q = head;
				while (q.getSiguiente() != head) {
					q = q.getSiguiente();
				}
				p.setSiguiente(head);
				q.setSiguiente(p);
				head = p;
			} else {
				Nodo q = head;
				for (int i = 1; i < pos; i++) {
					q = q.getSiguiente();
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
				Nodo q = head;
				while (q.getSiguiente() != head) {
					q = q.getSiguiente();
				}
				head = head.getSiguiente();
				q.setSiguiente(head);
				
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
			System.out.println(p.getDato());
			p=p.getSiguiente();
			while (p != head) {
				System.out.println(p.getDato());
				p = p.getSiguiente();
			}
		}
	}
}
