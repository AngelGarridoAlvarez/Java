
public class PilaEstatica<T> {

	private T[] contenedor;
	private int longitud;
	
	@SuppressWarnings("unchecked")
	public PilaEstatica(){
		
		contenedor = (T[]) new Object[4];
		longitud = 0;
	}
	
	@SuppressWarnings("unchecked")
	public PilaEstatica(PilaEstatica<T> pila) {
		
		contenedor = (T[]) new Object[pila.contenedor.length];
		for (int i=0; i<pila.contenedor.length;i++)
			contenedor[i] = pila.contenedor[i];
		
		longitud = pila.longitud;
	}
	
	public boolean esVacia(){
		return longitud == 0;
	}
		
	public void insertar(T elem){
		if (longitud == contenedor.length) {
			@SuppressWarnings("unchecked")
			T[] aux = (T[]) new Object[contenedor.length * 2];
			
			for(int i=0; i < contenedor.length; i++) {
				aux[i]=contenedor[i];
			}
			
			contenedor = aux; 
		}
		
		contenedor[longitud] = elem;
		longitud++;
	}
	
	public T extraer() {
		longitud--;
		return contenedor[longitud];
	} 
	
	public T cima() {
		
		return contenedor[longitud-1];
		
	}
	
	
	public int longitud() {
		
		return longitud;
		
	}
	
	public void vaciar() {
		
		longitud = 0;
		
	}
}
