package mundotravel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CConexion {
    private Connection cx = null;
    private String bd = "MundoTravel";
    private String url = "jdbc:mysql://localhost:3306/" + bd;
    private String usuario = "root";
    private String contraseña = "1597534862";
    private String driver = "com.mysql.cj.jdbc.Driver";

    public Connection establecerConnection() {
        try {
            // Cargar el controlador JDBC
            Class.forName(driver);

            // Establecer la conexión a la base de datos
            cx = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("SE CONECTÓ A LA BASE DE DATOS: " + bd);
            JOptionPane.showMessageDialog(null, "Se conectó correctamente a la Base de Datos");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("NO SE PUDO CONECTAR A LA BASE DE DATOS: " + bd);
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos: " + e.toString());
        }
        return cx;
    }
}
