package app.ejemplo;

public class Animal {
	
	private String raza;
	private boolean vacunado;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	public Animal(String raza, boolean vacunado) {
		this.raza = raza;
		this.vacunado = vacunado;
	}
	
	public String getRaza() {
		return raza;
	}
	
	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	public boolean isVacunado() {
		return vacunado;
	}
	
	public void setVacunado(boolean vacunado) {
		this.vacunado = vacunado;
	}
	
	

}
