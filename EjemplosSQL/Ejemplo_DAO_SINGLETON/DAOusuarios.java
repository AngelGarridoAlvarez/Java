package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Connection;

import modelo.Usuario;

public class DAOusuarios { //Esta clase esta en plural porque no es solo para crear un Usuario, tambien por ej para sacar todos los usuarios registrados y mas cosas.
	
	private Connection con = null; //Sin inicializar por eso lo igualamos a null
	
	public static DAOusuarios instance = null;
	
	public DAOusuarios() throws SQLException { //Creamos el constructor
		
		con = DBconnection.getConnection(); //Al inicializar el constructor ejecutamos el metodo .getConnection que se conecta a la base de datos y nos retorna esa direccion ( return instance)
	}
	
	
	public static DAOusuarios getInstance() throws SQLException { //Metedo que genera un objeto de la propia clase en la que se encuentra, sencillo.
		if(instance == null) {
			instance = new DAOusuarios();
		}
		
		return instance;
	}
	
	
	public void dao_insertar(Usuario usuarioPrueba) throws SQLException { //Este metodo es lo que realiza la INSERCION en la base de datos
		
		PreparedStatement ps = con.prepareStatement("INSERT INTO usuario (nom_usuario,ape_usuario,ema_usuario,con_usuario,per_usuario,gen_usuario) VALUES (?,?,?,?,?,?)"); //Aqui de momento solo necesitmaos la posicion
		//para hacer abajo los insert de la informacion de cada hueco
		
		ps.setString(1, usuarioPrueba.getNombre());
		ps.setString(2, usuarioPrueba.getApellido());
		ps.setString(3, usuarioPrueba.getEmail());
		ps.setString(4, usuarioPrueba.getContrasenia());
		ps.setInt(5, usuarioPrueba.getPerfil());
		ps.setInt(6, usuarioPrueba.getGenero());
		
		ps.executeUpdate();
		ps.close();
		
		
	}
	
	public void dao_update(Usuario usuarioPrueba) {
		
	}

	public void dao_delete(Usuario usuarioPrueba) {
	
}

	public ArrayList<Usuario> dao_listarUsuarios() throws SQLException {
		
		PreparedStatement ps = con.prepareStatement("SELECT * FROM usuario"); //Para listar todos los usuarios sale sin ningun tipo de filtro.
		
		ResultSet rs = ps.executeQuery(); //El Resulset es la lista ya creada
		
		ArrayList<Usuario> result = new ArrayList<Usuario>(); //Como el ResulSet puede ser complicado, lo pasamos a un ArrayList que es con lo que sabemos trabajar.
		
			while(rs.next()) {
				
				result.add(new Usuario(rs.getInt("ide_usuario"),rs.getString("nom_usuario"), rs.getString("ape_usuario"), rs.getString("ema_usuario"), rs.getString("con_usuario"), 
						rs.getInt("per_usuario"), rs.getInt("gen_usuario"))); //Aqui en la tabla hay una FK de ide Prestamos pero aqui rompe si la metemos porque no existe en el constructor
			}
		
				return result; //Retorna el Arraylist final de todos los Usuarios
	
}

}
