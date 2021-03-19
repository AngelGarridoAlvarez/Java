
public class ColaEstatica<T> {

	private T[] contenedor; 	
	int longitud;
	int frente;
	int fin;
	
	public ColaEstatica() {
		contenedor = (T[]) new Object[4];
		longitud = 0;
		frente = 0;
		fin = 0;
	}
	
	public ColaEstatica(ColaEstatica<T> cola) {
		contenedor = (T[]) new Object[cola.contenedor.length];
		longitud = cola.longitud;
		frente = cola.frente;
		fin = cola.fin;
		
		for(int i=0;i<cola.contenedor.length;i++)
			contenedor[i]=cola.contenedor[i];
		
	}
	
	public int longitud() {
		
		return longitud;
	}
	
	public boolean esVacia() {
		
		return longitud == 0;
		
	}
	
	public T frente() {
		
		return contenedor[frente];
		
		
	}
	
	public void insertar(T elem) {
		if(longitud==contenedor.length) {
			
			T[] contAux = (T[]) new Object[contenedor.length * 2];
			
			if (frente < fin)
				for (int i = frente; i < fin; i++)
					contAux[i-frente] = contenedor[i];
			else if (frente >= fin){
			    for (int i = frente; i < contenedor.length; i++)
			    	contAux[i-frente] = contenedor[i];
			    
			    int elemInsertados = contenedor.length - frente;
			    
			    for (int i = 0; i < fin; i++)
			    	contAux[i+elemInsertados] = contenedor[i]; 
			
			    frente = 0;
			    fin = longitud;
			    contenedor = contAux;
			}    
			    
			contenedor[fin] = elem;
			fin = (fin+1)%contenedor.length;
			longitud++;
		}
	}
	
	public void extraer() {
		if (longitud == 1) {
			longitud--;
			frente = 0;
			fin = 0;
		} else {
			frente = (frente+1) % contenedor.length;
			longitud--;
		}
	}
	
	public void vaciar() {
		longitud = 0;
		frente = 0;
		fin = 0;	
	}
}
