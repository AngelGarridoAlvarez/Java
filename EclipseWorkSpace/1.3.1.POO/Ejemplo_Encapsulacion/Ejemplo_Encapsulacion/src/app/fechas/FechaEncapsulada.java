package app.fechas;

public class FechaEncapsulada {

	private int dia;
	private int mes;
	private int anyo;	

	public FechaEncapsulada() {
	}

	public FechaEncapsulada(int dia, int mes, int anyo) {
		setDia(dia);
		setMes(mes);
		setAnyo(anyo);
	}

	public void mostrarFecha() {
		System.out.println(dia + "/" + mes + "/" + anyo);
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		// Comprobar que el dia es correcto
		if (dia > 0 && dia < 31) {
			this.dia = dia;
		} else {
			System.out.println("dia no valido");
		}
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

}
