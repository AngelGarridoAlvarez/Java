
public class Autor {
	private int id;
	private String nombre;
	private String apellidos;
	private String nacionalidad;
	private String f_nacimiento;
	
	public Autor(int id, String nombre, String apellidos, String nacionalidad, String f_nacimiento) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nacionalidad = nacionalidad;
		this.f_nacimiento = f_nacimiento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getF_nacimiento() {
		return f_nacimiento;
	}

	public void setF_nacimiento(String f_nacimiento) {
		this.f_nacimiento = f_nacimiento;
	}
	
	public String info_Autor() {
		return this.id+" " + this.nombre + " " + this.apellidos + " " + this.nacionalidad + " " + this.f_nacimiento;
	}
		
}
