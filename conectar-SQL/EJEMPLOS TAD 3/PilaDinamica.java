
public class PilaDinamica<T> {

	public class Nodo {
		T info;
		Nodo sig;
		
		public Nodo(T elemento, Nodo siguiente) {
			info = elemento;
			sig = siguiente;
		}
	}
	
	private Nodo cima;
	private int longitud(;
	public PilaDinamica() {
		cima = null;
		longitud++;
	}
	
	public boolean esVacia() {
		
		return cima==null;
		
	}
	
	public int longitud() {
		int res = 0;
		Nodo ptr = cima;
		
		while (ptr != null) {
			ptr = ptr.sig;
			res++;
		}
		
		
		return res;	
	}
	
	public T cima() {
		
		return cima.info;
		
	}
	public void insertar(T elem) {
		Nodo ptr = new Nodo(elem, cima);
		
		cima = ptr;
	}
	
	public void extraer() {
		
		cima = cima.sig;
		 	
	}
	
	public void vaciar() {
		
		cima = null;
		
	}
	
}
