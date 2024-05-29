/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaintermodular;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Usuario
 */
public class Satelite {
    // Configuración de la conexión a la base de datos MySQL

    String url = "jdbc:mysql://localhost:3306/practica_intermodular";
    String usuario = "root";
    String contraseña = "Med@c";
// Sentencias SQL  consulta por planeta
    String sqlluna = "SELECT \n"
            + "    Satelite.nombre AS nombre_satelite,\n"
            + "    Satelite.radio_km,\n"
            + "    Satelite.distancia_planeta,\n"
            + "    Satelite.periodo_orbital,\n"
            + "    Satelite.temperatura_media,\n"
            + "    Satelite.tipo,\n"
            + "    Satelite.fecha_creacion AS fecha_creacion,\n"
            + "    Planeta.nombre AS nombre_planeta,\n"
            + "    Planeta.fecha_creacion AS fecha_creacion_planeta\n"
            + "FROM \n"
            + "    Satelite\n"
            + "INNER JOIN \n"
            + "    Planeta ON Satelite.planeta_id = Planeta.id\n"
            + "WHERE \n"
            + "    Planeta.nombre = 'Tierra';";
    String sqlFobos = "SELECT \n"
            + "    Satelite.nombre AS nombre_satelite,\n"
            + "    Satelite.radio_km,\n"
            + "    Satelite.distancia_planeta,\n"
            + "    Satelite.periodo_orbital,\n"
            + "    Satelite.temperatura_media,\n"
            + "    Satelite.tipo,\n"
            + "    Satelite.fecha_creacion AS fecha_creacion,\n"
            + "    Planeta.nombre AS nombre_planeta,\n"
            + "    Planeta.fecha_creacion AS fecha_creacion_planeta\n"
            + "FROM \n"
            + "    Satelite\n"
            + "INNER JOIN \n"
            + "    Planeta ON Satelite.planeta_id = Planeta.id\n"
            + "WHERE \n"
            + "    Planeta.nombre = 'Jupiter';";
    String sqlDeimos = "SELECT \n"
            + "    Satelite.nombre AS nombre_satelite,\n"
            + "    Satelite.radio_km,\n"
            + "    Satelite.distancia_planeta,\n"
            + "    Satelite.periodo_orbital,\n"
            + "    Satelite.temperatura_media,\n"
            + "    Satelite.tipo,\n"
            + "    Satelite.fecha_creacion AS fecha_creacion,\n"
            + "    Planeta.nombre AS nombre_planeta,\n"
            + "    Planeta.fecha_creacion AS fecha_creacion_planeta\n"
            + "FROM \n"
            + "    Satelite\n"
            + "INNER JOIN \n"
            + "    Planeta ON Satelite.planeta_id = Planeta.id\n"
            + "WHERE \n"
            + "    Planeta.nombre = 'Jupiter';";
    String sqlÍo = "SELECT \n"
            + "    Satelite.nombre AS nombre_satelite,\n"
            + "    Satelite.radio_km,\n"
            + "    Satelite.distancia_planeta,\n"
            + "    Satelite.periodo_orbital,\n"
            + "    Satelite.temperatura_media,\n"
            + "    Satelite.tipo,\n"
            + "    Satelite.fecha_creacion AS fecha_creacion,\n"
            + "    Planeta.nombre AS nombre_planeta,\n"
            + "    Planeta.fecha_creacion AS fecha_creacion_planeta\n"
            + "FROM \n"
            + "    Satelite\n"
            + "INNER JOIN \n"
            + "    Planeta ON Satelite.planeta_id = Planeta.id\n"
            + "WHERE \n"
            + "    Planeta.nombre = 'Saturno';";
    String sqlEuropa = "SELECT \n"
            + "    Satelite.nombre AS nombre_satelite,\n"
            + "    Satelite.radio_km,\n"
            + "    Satelite.distancia_planeta,\n"
            + "    Satelite.periodo_orbital,\n"
            + "    Satelite.temperatura_media,\n"
            + "    Satelite.tipo,\n"
            + "    Satelite.fecha_creacion AS fecha_creacion,\n"
            + "    Planeta.nombre AS nombre_planeta,\n"
            + "    Planeta.fecha_creacion AS fecha_creacion_planeta\n"
            + "FROM \n"
            + "    Satelite\n"
            + "INNER JOIN \n"
            + "    Planeta ON Satelite.planeta_id = Planeta.id\n"
            + "WHERE \n"
            + "    Planeta.nombre = 'Saturno';";
        String sqlGanimedes = "SELECT \n"
            + "    Satelite.nombre AS nombre_satelite,\n"
            + "    Satelite.radio_km,\n"
            + "    Satelite.distancia_planeta,\n"
            + "    Satelite.periodo_orbital,\n"
            + "    Satelite.temperatura_media,\n"
            + "    Satelite.tipo,\n"
            + "    Satelite.fecha_creacion AS fecha_creacion,\n"
            + "    Planeta.nombre AS nombre_planeta,\n"
            + "    Planeta.fecha_creacion AS fecha_creacion_planeta\n"
            + "FROM \n"
            + "    Satelite\n"
            + "INNER JOIN \n"
            + "    Planeta ON Satelite.planeta_id = Planeta.id\n"
            + "WHERE \n"
            + "    Planeta.nombre = 'Saturno';";
          String sqlCalisto = "SELECT \n"
            + "    Satelite.nombre AS nombre_satelite,\n"
            + "    Satelite.radio_km,\n"
            + "    Satelite.distancia_planeta,\n"
            + "    Satelite.periodo_orbital,\n"
            + "    Satelite.temperatura_media,\n"
            + "    Satelite.tipo,\n"
            + "    Satelite.fecha_creacion AS fecha_creacion,\n"
            + "    Planeta.nombre AS nombre_planeta,\n"
            + "    Planeta.fecha_creacion AS fecha_creacion_planeta\n"
            + "FROM \n"
            + "    Satelite\n"
            + "INNER JOIN \n"
            + "    Planeta ON Satelite.planeta_id = Planeta.id\n"
            + "WHERE \n"
            + "    Planeta.nombre = 'Saturno';";
            String sqlTitán = "SELECT \n"
            + "    Satelite.nombre AS nombre_satelite,\n"
            + "    Satelite.radio_km,\n"
            + "    Satelite.distancia_planeta,\n"
            + "    Satelite.periodo_orbital,\n"
            + "    Satelite.temperatura_media,\n"
            + "    Satelite.tipo,\n"
            + "    Satelite.fecha_creacion AS fecha_creacion,\n"
            + "    Planeta.nombre AS nombre_planeta,\n"
            + "    Planeta.fecha_creacion AS fecha_creacion_planeta\n"
            + "FROM \n"
            + "    Satelite\n"
            + "INNER JOIN \n"
            + "    Planeta ON Satelite.planeta_id = Planeta.id\n"
            + "WHERE \n"
            + "    Planeta.nombre = 'Urano';";
                 String sqlEncélado = "SELECT \n"
            + "    Satelite.nombre AS nombre_satelite,\n"
            + "    Satelite.radio_km,\n"
            + "    Satelite.distancia_planeta,\n"
            + "    Satelite.periodo_orbital,\n"
            + "    Satelite.temperatura_media,\n"
            + "    Satelite.tipo,\n"
            + "    Satelite.fecha_creacion AS fecha_creacion,\n"
            + "    Planeta.nombre AS nombre_planeta,\n"
            + "    Planeta.fecha_creacion AS fecha_creacion_planeta\n"
            + "FROM \n"
            + "    Satelite\n"
            + "INNER JOIN \n"
            + "    Planeta ON Satelite.planeta_id = Planeta.id\n"
            + "WHERE \n"
            + "    Planeta.nombre = 'Urano';";
                     String sqlTitania = "SELECT \n"
            + "    Satelite.nombre AS nombre_satelite,\n"
            + "    Satelite.radio_km,\n"
            + "    Satelite.distancia_planeta,\n"
            + "    Satelite.periodo_orbital,\n"
            + "    Satelite.temperatura_media,\n"
            + "    Satelite.tipo,\n"
            + "    Satelite.fecha_creacion AS fecha_creacion,\n"
            + "    Planeta.nombre AS nombre_planeta,\n"
            + "    Planeta.fecha_creacion AS fecha_creacion_planeta\n"
            + "FROM \n"
            + "    Satelite\n"
            + "INNER JOIN \n"
            + "    Planeta ON Satelite.planeta_id = Planeta.id\n"
            + "WHERE \n"
            + "    Planeta.nombre = 'Neptuno';";
                       String sqlOberón = "SELECT \n"
            + "    Satelite.nombre AS nombre_satelite,\n"
            + "    Satelite.radio_km,\n"
            + "    Satelite.distancia_planeta,\n"
            + "    Satelite.periodo_orbital,\n"
            + "    Satelite.temperatura_media,\n"
            + "    Satelite.tipo,\n"
            + "    Satelite.fecha_creacion AS fecha_creacion,\n"
            + "    Planeta.nombre AS nombre_planeta,\n"
            + "    Planeta.fecha_creacion AS fecha_creacion_planeta\n"
            + "FROM \n"
            + "    Satelite\n"
            + "INNER JOIN \n"
            + "    Planeta ON Satelite.planeta_id = Planeta.id\n"
            + "WHERE \n"
            + "    Planeta.nombre = 'Neptuno';";



    public String[] conectarConsultaLuna() {
        //Crear array
        String arrayLuna[] = new String[8];
        try {
            //Conectar con la base
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //lanzar query
            ResultSet resultados = statement.executeQuery(sqlluna);
            //respuesta de la base
            while (resultados.next()) {
                arrayLuna[0] = resultados.getString("id");
                arrayLuna[1] = resultados.getString("nombre");
                arrayLuna[2] = resultados.getString("radio_km");
                arrayLuna[3] = resultados.getString("distancia_planeta");
                arrayLuna[4] = resultados.getString("periodo_orbital");
                arrayLuna[5] = resultados.getString("temperatura_media");
                arrayLuna[6] = resultados.getString("tipo");
                arrayLuna[7] = resultados.getString("paneta_id");
                arrayLuna[8] = resultados.getString("fecha_creacion");

//cerrar conexion
                statement.close();
                conexion.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
//return array
        return arrayLuna;

    }

    public String[] conectarConsultaFobos() {
        //Crear array
        String arrayFobos[] = new String[8];
        try {
            //Conectar con la base
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //lanzar query
            ResultSet resultados = statement.executeQuery(sqlFobos);
            //respuesta de la base
            while (resultados.next()) {
                arrayFobos[0] = resultados.getString("id");
                arrayFobos[1] = resultados.getString("nombre");
                arrayFobos[2] = resultados.getString("radio_km");
                arrayFobos[3] = resultados.getString("distancia_planeta");
                arrayFobos[4] = resultados.getString("periodo_orbital");
                arrayFobos[5] = resultados.getString("temperatura_media");
                arrayFobos[6] = resultados.getString("tipo");
                arrayFobos[7] = resultados.getString("paneta_id");
                arrayFobos[8] = resultados.getString("fecha_creacion");

//cerrar conexion
                statement.close();
                conexion.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
//return array
        return arrayFobos;

    }

    public String[] conectarConsultaDeimos() {
        //Crear array
        String arrayDeimos[] = new String[8];
        try {
            //Conectar con la base
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //lanzar query
            ResultSet resultados = statement.executeQuery(sqlDeimos);
            //respuesta de la base
            while (resultados.next()) {
                arrayDeimos[0] = resultados.getString("id");
                arrayDeimos[1] = resultados.getString("nombre");
                arrayDeimos[2] = resultados.getString("radio_km");
                arrayDeimos[3] = resultados.getString("distancia_planeta");
                arrayDeimos[4] = resultados.getString("periodo_orbital");
                arrayDeimos[5] = resultados.getString("temperatura_media");
                arrayDeimos[6] = resultados.getString("tipo");
                arrayDeimos[7] = resultados.getString("paneta_id");
                arrayDeimos[8] = resultados.getString("fecha_creacion");

//cerrar conexion
                statement.close();
                conexion.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
//return array
        return arrayDeimos;

    }

    public String[] conectarConsultaÍo() {
        //Crear array
        String arrayÍo[] = new String[8];
        try {
            //Conectar con la base
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //lanzar query
            ResultSet resultados = statement.executeQuery(sqlÍo);
            //respuesta de la base
            while (resultados.next()) {
                arrayÍo[0] = resultados.getString("id");
                arrayÍo[1] = resultados.getString("nombre");
                arrayÍo[2] = resultados.getString("radio_km");
                arrayÍo[3] = resultados.getString("distancia_planeta");
                arrayÍo[4] = resultados.getString("periodo_orbital");
                arrayÍo[5] = resultados.getString("temperatura_media");
                arrayÍo[6] = resultados.getString("tipo");
                arrayÍo[7] = resultados.getString("paneta_id");
                arrayÍo[8] = resultados.getString("fecha_creacion");

//cerrar conexion
                statement.close();
                conexion.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
//return array
        return arrayÍo;

    }

    public String[] conectarConsultaEuropa() {
        //Crear array
        String arrayEuropa[] = new String[8];
        try {
            //Conectar con la base
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //lanzar query
            ResultSet resultados = statement.executeQuery(sqlEuropa);
            //respuesta de la base
            while (resultados.next()) {
                arrayEuropa[0] = resultados.getString("id");
                arrayEuropa[1] = resultados.getString("nombre");
                arrayEuropa[2] = resultados.getString("radio_km");
                arrayEuropa[3] = resultados.getString("distancia_planeta");
                arrayEuropa[4] = resultados.getString("periodo_orbital");
                arrayEuropa[5] = resultados.getString("temperatura_media");
                arrayEuropa[6] = resultados.getString("tipo");
                arrayEuropa[7] = resultados.getString("paneta_id");
                arrayEuropa[8] = resultados.getString("fecha_creacion");

//cerrar conexion
                statement.close();
                conexion.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
//return array
        return arrayEuropa;

    }

    public String[] conectarConsultaGanimedes() {
        //Crear array
        String arrayGanimedes[] = new String[8];
        try {
            //Conectar con la base
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //lanzar query
            ResultSet resultados = statement.executeQuery(sqlGanimedes);
            //respuesta de la base
            while (resultados.next()) {
                arrayGanimedes[0] = resultados.getString("id");
                arrayGanimedes[1] = resultados.getString("nombre");
                arrayGanimedes[2] = resultados.getString("radio_km");
                arrayGanimedes[3] = resultados.getString("distancia_planeta");
                arrayGanimedes[4] = resultados.getString("periodo_orbital");
                arrayGanimedes[5] = resultados.getString("temperatura_media");
                arrayGanimedes[6] = resultados.getString("tipo");
                arrayGanimedes[7] = resultados.getString("paneta_id");
                arrayGanimedes[8] = resultados.getString("fecha_creacion");

//cerrar conexion
                statement.close();
                conexion.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
//return array
        return arrayGanimedes;

    }

    public String[] conectarConsultaCalisto() {
        //Crear array
        String arrayCalisto[] = new String[8];
        try {
            //Conectar con la base
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //lanzar query
            ResultSet resultados = statement.executeQuery(sqlCalisto);
            //respuesta de la base
            while (resultados.next()) {
                arrayCalisto[0] = resultados.getString("id");
                arrayCalisto[1] = resultados.getString("nombre");
                arrayCalisto[2] = resultados.getString("radio_km");
                arrayCalisto[3] = resultados.getString("distancia_planeta");
                arrayCalisto[4] = resultados.getString("periodo_orbital");
                arrayCalisto[5] = resultados.getString("temperatura_media");
                arrayCalisto[6] = resultados.getString("tipo");
                arrayCalisto[7] = resultados.getString("paneta_id");
                arrayCalisto[8] = resultados.getString("fecha_creacion");

//cerrar conexion
                statement.close();
                conexion.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
//return array
        return arrayCalisto;

    }

    public String[] conectarConsultaTitán() {
        //Crear array
        String arrayTitán[] = new String[8];
        try {
            //Conectar con la base
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //lanzar query
            ResultSet resultados = statement.executeQuery(sqlTitán);
            //respuesta de la base
            while (resultados.next()) {
                arrayTitán[0] = resultados.getString("id");
                arrayTitán[1] = resultados.getString("nombre");
                arrayTitán[2] = resultados.getString("radio_km");
                arrayTitán[3] = resultados.getString("distancia_planeta");
                arrayTitán[4] = resultados.getString("periodo_orbital");
                arrayTitán[5] = resultados.getString("temperatura_media");
                arrayTitán[6] = resultados.getString("tipo");
                arrayTitán[7] = resultados.getString("paneta_id");
                arrayTitán[8] = resultados.getString("fecha_creacion");

//cerrar conexion
                statement.close();
                conexion.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
//return array
        return arrayTitán;

    }
     public String[] conectarConsultaEncélado() {
        //Crear array
        String arrayEncélado[] = new String[8];
        try {
            //Conectar con la base
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //lanzar query
            ResultSet resultados = statement.executeQuery(sqlEncélado);
            //respuesta de la base
            while (resultados.next()) {
                arrayEncélado[0] = resultados.getString("id");
                arrayEncélado[1] = resultados.getString("nombre");
                arrayEncélado[2] = resultados.getString("radio_km");
                arrayEncélado[3] = resultados.getString("distancia_planeta");
                arrayEncélado[4] = resultados.getString("periodo_orbital");
                arrayEncélado[5] = resultados.getString("temperatura_media");
                arrayEncélado[6] = resultados.getString("tipo");
                arrayEncélado[7] = resultados.getString("paneta_id");
                arrayEncélado[8] = resultados.getString("fecha_creacion");

//cerrar conexion
                statement.close();
                conexion.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
//return array
        return arrayEncélado;

    }
      public String[] conectarConsultaTitania() {
        //Crear array
        String arrayTitania[] = new String[8];
        try {
            //Conectar con la base
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //lanzar query
            ResultSet resultados = statement.executeQuery(sqlTitania);
            //respuesta de la base
            while (resultados.next()) {
                arrayTitania[0] = resultados.getString("id");
                arrayTitania[1] = resultados.getString("nombre");
                arrayTitania[2] = resultados.getString("radio_km");
                arrayTitania[3] = resultados.getString("distancia_planeta");
                arrayTitania[4] = resultados.getString("periodo_orbital");
                arrayTitania[5] = resultados.getString("temperatura_media");
                arrayTitania[6] = resultados.getString("tipo");
                arrayTitania[7] = resultados.getString("paneta_id");
                arrayTitania[8] = resultados.getString("fecha_creacion");

//cerrar conexion
                statement.close();
                conexion.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
//return array
        return arrayTitania;

    }
       public String[] conectarConsultaOberón() {
        //Crear array
        String arrayOberón[] = new String[8];
        try {
            //Conectar con la base
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //lanzar query
            ResultSet resultados = statement.executeQuery(sqlOberón);
            //respuesta de la base
            while (resultados.next()) {
                arrayOberón[0] = resultados.getString("id");
                arrayOberón[1] = resultados.getString("nombre");
                arrayOberón[2] = resultados.getString("radio_km");
                arrayOberón[3] = resultados.getString("distancia_planeta");
                arrayOberón[4] = resultados.getString("periodo_orbital");
                arrayOberón[5] = resultados.getString("temperatura_media");
                arrayOberón[6] = resultados.getString("tipo");
                arrayOberón[7] = resultados.getString("paneta_id");
                arrayOberón[8] = resultados.getString("fecha_creacion");

//cerrar conexion
                statement.close();
                conexion.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
//return array
        return arrayOberón;

    }
}
