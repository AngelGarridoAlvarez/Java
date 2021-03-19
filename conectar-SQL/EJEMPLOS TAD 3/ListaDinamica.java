public class ListaDinamica<T> {

private class Nodo {
	T info;
	Nodo sig;

	Nodo(T info, Nodo sig){
		this.info = info;
		this.sig = sig;
	}
}
	
private Nodo inicio;

public ListaDinamica(){
	this.inicio = null;
}

public ListaDinamica(ListaDinamica<T> lista){
	

}


public int longitud(){
	int pos = 0;
	Nodo aux = this.inicio;
	
	while(aux != null){
		pos++;
		aux = aux.sig;
	}
	
	return pos;
}

public boolean esVacia(){
	
	boolean vacia = true; 
	if(this.inicio!=null){
		vacia = false;
	}
	return vacia;
}


public T consultar(int pos){
	Nodo aux = this.inicio;
		
	for(int i=1;i<pos;i++){
		aux = aux.sig;
	}
	
	return aux.info;
}

public int buscar(T elem){
	
	Nodo aux = this.inicio;
	int pos = 1;
	
	while(aux != null && !aux.info.equals(elem)){
	
		aux = aux.sig;
		pos++;
	}
	if(aux==null){
		pos=0;
		
	}
	
	return pos;
	
}

public void insertar(int pos, T elem){
	
	if (pos == 1) {
		this.inicio = new Nodo(elem, this.inicio);
	} else {
			
			Nodo aux = this.inicio;
		
		for(int i=1;i<pos-1;i++){
			
			aux = aux.sig;			
		}
		
		aux.sig = new Nodo(elem, aux.sig);
		
	}
	
	//this.inicio ---> a -> () -> b -> c -> d -> e
	
	
}

public void borrar(int pos){

	if (pos == 1) {
		this.inicio = this.inicio.sig;
	} else {
	
		Nodo aux = this.inicio;
	
		for(int i=1;i<pos-1;i++){
			
			aux = aux.sig;
		}
		
		aux = aux.sig.sig;
	}
	
}

public void modificar(int pos, T elem){
	
	Nodo aux = this.inicio;
	
	for(int i=1;i<pos;i++){
		
		aux = aux.sig;
	}
	
	aux.info = elem;
	
}

public void vaciar(){
	
	this.inicio = null;
}

// Implementaci—n de la pila mediante la lista.
public void push(T elem){
	this.insertar(1, elem);
}

public T pop(){
	T resultado = this.consultar(1);
	
	this.borrar(1);
	
	return resultado;
}

//Implementaci—n de la cola mediante la lista.
public void meter(T elem){
	this.insertar(1, elem);
}

public T sacar(){
	T resultado = this.consultar(this.longitud());
	
	this.borrar(this.longitud());
	
	return resultado;
}

}// Fin
