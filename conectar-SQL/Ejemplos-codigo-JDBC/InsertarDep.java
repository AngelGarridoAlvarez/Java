import java.sql.*;

public class InsertarDep {
	public static void main(String[] args) {
//construir orden INSERT	        
	       String sql = String.format("INSERT INTO departamentos ('nombre',...) 
										VALUES ('Star Trek', '', ''....)");
											
	Statement sentencia = conexion.createStatement();
			int filas=0;
filas = sentencia.executeUpdate(sql.toString());
			  
			sentencia.close(); // Cerrar Statement
			conexion.close(); // Cerrar conexión


	}// fin de main
}// fin de la clase
