package mundotravel;

import Vistas.Login;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MundoTravel {

    public static void main(String[] args) {
        //CConexion conexion = new CConexion();
        //Connection connection = conexion.establecerConnection();
        // Crear una instancia de la clase Login
        Login loginForm = new Login();

        // Mostrar el formulario de inicio de sesión
        loginForm.setVisible(true);
    }
}
