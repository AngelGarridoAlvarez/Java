package Interfaces;

import java.util.Date;  

public interface Neumatico {
	
	
	public Date getCaducidad();
	public int getDureza();
	public String getColor();
	public String getDibujo();
	
	
	public void setCaducidad(Date caducidad);
	public void setDureza(int dureza);
	public void setColor(String Color);
	public void setDibujo(String Dibujo);
	
	public abstract void mostrarInfo();	

}
