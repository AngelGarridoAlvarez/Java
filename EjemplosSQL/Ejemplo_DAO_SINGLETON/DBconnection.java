package dao;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.Properties;

//Esta clase se va a dedicar unica y exclusivamente ha generar la conexion con la BASE DE DATOS

public class DBconnection {
	//Lo hacemos final porque es a direccion de nuestra BASE DE DATOS y no va a cambiar.
	
	private static final  String JDBC_URL = "jdbc:mysql://localhost:3306/libreriasmadrid"; //Ojo, libreriasMadrid aun no esta creada. Pero esta seria la direccion
	
	//Creamos un objeto de la clase conexion instanciado a null porque cuando lo creamos aun no tiene nada. Lo necesitamos vacio
	
	private static Connection instance = null;

	private DBconnection() {
	}
	
	
	//getConnection la hemos hecho estatica para usarla desde otros lados y aprovecharla.
	
	public static Connection getConnection() throws SQLException {
		
		if (instance == null) { //Si no estas haciendo nada
			Properties props = new Properties(); //Esto es un objeto de Java, es un mapa que el JDBC es capaz de usar 
			props.put("user","root"); //Este objeto mediante las claves user y password
			props.put("password","");
			instance = DriverManager.getConnection(JDBC_URL, props); //Este objeto  va a cargar mediante el driverManaager  mandandole como parametro la direccion del servidor (que esta creada arriba) y
			//el props que es el usuario y la contraseña
			
		}
		
		return instance;
	}
	
	
	
	
	
	
	
	
	
}
