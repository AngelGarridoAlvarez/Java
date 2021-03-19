import java.sql.*;

public class Main {
	public static void main(String[] args) {
		try {
			// Cargar el driver
		1. 	Class.forName("com.mysql.jdbc.Driver");
			// Establecemos la conexion con la BD
		2. 	Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/ejemplo", "ejemplo", "ejemplo");

			// Preparamos la consulta
		3. 	Statement sentencia = conexion.createStatement();
		4.	String sql = "SELECT * FROM departamentos";
		5.	ResultSet resul = sentencia.executeQuery(sql);

			// Recorremos el resultado para visualizar cada fila
			// Se hace un bucle mientras haya registros y se van visualizando
			while (resul.next()) {
				System.out.printf("%d, %s, %s %n", resul.getInt("id"), resul.getString("titulo"), resul.getString(3));
			}

			resul.close(); // Cerrar ResultSet
			sentencia.close(); // Cerrar Statement
			conexion.close(); // Cerrar conexión

		} catch (ClassNotFoundException cn) {
			cn.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}// fin de main
}// fin de la clase
