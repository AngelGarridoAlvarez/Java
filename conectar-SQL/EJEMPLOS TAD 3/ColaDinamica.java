
public class ColaDinamica<T> {

	public class Nodo {
		T info;
		Nodo sig;
		
		public Nodo(T elemento, Nodo siguiente) {
			info = elemento;
			sig = siguiente;
		}
	}
	
	private Nodo frente;
	
	public ColaDinamica() {
		frente = null;
	}
	
	public int longitud() {
		
		int res= 0;
		Nodo aux = frente;
		
		while (aux!=null) {
			aux = aux.sig;
			res++;
		}
		return res;
		
	}
	
	public boolean esVacia() {
		
		return frente==null;		
		
	} 
	
	public void extraer() {
		
		frente = frente.sig;
		
	}
	
	public void insertar(T elem) {
		if (frente == null) {
			frente = new Nodo(elem, null);
		} else {
			Nodo aux = new Nodo(elem, null);
			Nodo ptr = frente;
			
			while(ptr.sig != null) {
				ptr = ptr.sig;
			}
			
			ptr.sig = aux;
		}
		
	}
		
}
