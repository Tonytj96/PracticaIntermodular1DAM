
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Estrella {
    // Configuración de la conexión a la base de datos MySQL
    String url = "jdbc:mysql://localhost:3306/practica_intermodular";
    String usuario = "root";
    String contraseña = "Med@c";
// Sentencias SQL  consulta por planeta
    String sqlsol = "SELECT*FROM Estrella WHERE NOMBRE='Sol'";
    public String[] conectarConsultaEstrella() {
        //Crear array
        String arraySol[] = new String[7];
        try {
            //Conectar con la base
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //lanzar query
            ResultSet resultados = statement.executeQuery(sqlsol);
            //respuesta de la base
            while (resultados.next()) {
                arraySol[0] = resultados.getString("id");
                arraySol[1] = resultados.getString("nombre");
                arraySol[2] = resultados.getString("radio_km");
                arraySol[3] = resultados.getString("temperatura_superficial");
                arraySol[4] = resultados.getString("tipo");
                arraySol[5] = resultados.getString("distacia_tierra");
                arraySol[6] = resultados.getString("composicion");
                

//cerrar conexion
                statement.close();
                conexion.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
//return array
        return arraySol;

    }
}
