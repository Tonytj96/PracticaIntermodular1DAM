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
import java.util.HashMap;
import java.sql.Array;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class Bases {

// Configuración de la conexión a la base de datos MySQL
    String url = "jdbc:mysql://localhost:3306/practica_intermodular";
    String usuario = "root";
    String contraseña = "";
// Sentencias SQL  consulta por planeta

    String sqlmarte = "SELECT*FROM PLANETA WHERE NOMBRE='Marte'";
    String sqlvenus = "SELECT*FROM PLANETA WHERE NOMBRE='Venus'";
    String sqltierra = "SELECT*FROM PLANETA WHERE NOMBRE='Tierra'";
    String sqlmercurio = "SELECT*FROM PLANETA WHERE NOMBRE='Mercurio'";
    String sqljupiter = "SELECT*FROM PLANETA WHERE NOMBRE='Júpiter'";
    String sqlsaturno = "SELECT*FROM PLANETA WHERE NOMBRE='Saturno'";
    String sqlurano = "SELECT*FROM PLANETA WHERE NOMBRE='Urano'";
    String sqlneptuno = "SELECT*FROM PLANETA WHERE NOMBRE='Neptuno'";
    
//Metodos para consultar

     public String[] conectarConsultaMercurio() {
        //Crear array
        String arrayMercurio[] = new String[7];
        try {
            //Conectar con la base
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //lanzar query
            ResultSet resultados = statement.executeQuery(sqlmercurio);
            //respuesta de la base
            while (resultados.next()) {
                arrayMercurio[0] = resultados.getString("id");
                arrayMercurio[1] = resultados.getString("nombre");
                arrayMercurio[2] = resultados.getString("radio_km");
                arrayMercurio[3] = resultados.getString("periodo_orbital");
                arrayMercurio[4] = resultados.getString("temperatura_media");
                arrayMercurio[5] = resultados.getString("tipo");
                arrayMercurio[6] = resultados.getString("numero_satelites");
                arrayMercurio[7] = resultados.getString("estrella_id");
                arrayMercurio[5] = resultados.getString("fecha_creacion");

//cerrar conexion
                statement.close();
                conexion.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
//return array
        return arrayMercurio;

    }
         public String[] conectarConsultaVenus() {
        //Crear array
        String arrayVenus[] = new String[7];
        try {
            //Conectar con la base
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //lanzar query
            ResultSet resultados = statement.executeQuery(sqlvenus);
            //respuesta de la base
            while (resultados.next()) {
                arrayVenus[0] = resultados.getString("id");
                arrayVenus[1] = resultados.getString("nombre");
                arrayVenus[2] = resultados.getString("radio_km");
                arrayVenus[3] = resultados.getString("periodo_orbital");
                arrayVenus[4] = resultados.getString("temperatura_media");
                arrayVenus[5] = resultados.getString("tipo");
                arrayVenus[6] = resultados.getString("numero_satelites");
                arrayVenus[7] = resultados.getString("estrella_id");
                arrayVenus[5] = resultados.getString("fecha_creacion");

//cerrar conexion
                statement.close();
                conexion.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
//return array
        return arrayVenus;

    }
    public String[] conectarConsultaTierra() {
        //Crear array
        String arrayTierra[] = new String[7];
        try {
            //Conectar con la base
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //lanzar query
            ResultSet resultados = statement.executeQuery(sqltierra);
            //respuesta de la base
            while (resultados.next()) {
                arrayTierra[0] = resultados.getString("id");
                arrayTierra[1] = resultados.getString("nombre");
                arrayTierra[2] = resultados.getString("radio_km");
                arrayTierra[3] = resultados.getString("periodo_orbital");
                arrayTierra[4] = resultados.getString("temperatura_media");
                arrayTierra[5] = resultados.getString("tipo");
                arrayTierra[6] = resultados.getString("numero_satelites");
                arrayTierra[7] = resultados.getString("estrella_id");
                arrayTierra[5] = resultados.getString("fecha_creacion");

//cerrar conexion
                statement.close();
                conexion.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
//return array
        return arrayTierra;

    }

    public String[] conectarConsultaMarte() {
        //Crear array
        String arrayMarte[] = new String[7];
        try {
            //Conectar con la base
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //lanzar query
            ResultSet resultados = statement.executeQuery(sqlmarte);
            //respuesta de la base
            while (resultados.next()) {
                arrayMarte[0] = resultados.getString("id");
                arrayMarte[1] = resultados.getString("nombre");
                arrayMarte[2] = resultados.getString("radio_km");
                arrayMarte[3] = resultados.getString("periodo_orbital");
                arrayMarte[4] = resultados.getString("temperatura_media");
                arrayMarte[5] = resultados.getString("tipo");
                arrayMarte[6] = resultados.getString("numero_satelites");
                arrayMarte[7] = resultados.getString("estrella_id");
                arrayMarte[5] = resultados.getString("fecha_creacion");

//cerrar conexion
                statement.close();
                conexion.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
//return array
        return arrayMarte;

    }


    public String[] conectarConsultaJupiter() {
        //Crear array
        String arrayJupiter[] = new String[7];
        try {
            //Conectar con la base
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //lanzar query
            ResultSet resultados = statement.executeQuery(sqljupiter);
            //respuesta de la base
            while (resultados.next()) {
                arrayJupiter[0] = resultados.getString("id");
                arrayJupiter[1] = resultados.getString("nombre");
                arrayJupiter[2] = resultados.getString("radio_km");
                arrayJupiter[3] = resultados.getString("periodo_orbital");
                arrayJupiter[4] = resultados.getString("temperatura_media");
                arrayJupiter[5] = resultados.getString("tipo");
                arrayJupiter[6] = resultados.getString("numero_satelites");
                arrayJupiter[7] = resultados.getString("estrella_id");
                arrayJupiter[5] = resultados.getString("fecha_creacion");

//cerrar conexion
                statement.close();
                conexion.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
//return array
        return arrayJupiter;

    }

    public String[] conectarConsultaSaturno() {
        //Crear array
        String arraySaturno[] = new String[7];
        try {
            //Conectar con la base
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //lanzar query
            ResultSet resultados = statement.executeQuery(sqlsaturno);
            //respuesta de la base
            while (resultados.next()) {
                arraySaturno[0] = resultados.getString("id");
                arraySaturno[1] = resultados.getString("nombre");
                arraySaturno[2] = resultados.getString("radio_km");
                arraySaturno[3] = resultados.getString("periodo_orbital");
                arraySaturno[4] = resultados.getString("temperatura_media");
                arraySaturno[5] = resultados.getString("tipo");
                arraySaturno[6] = resultados.getString("numero_satelites");
                arraySaturno[7] = resultados.getString("estrella_id");
                arraySaturno[5] = resultados.getString("fecha_creacion");

//cerrar conexion
                statement.close();
                conexion.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
//return array
        return arraySaturno;

    }
    public String[] conectarConsultaUrano() {
        //Crear array
        String arrayUrano[] = new String[7];
        try {
            //Conectar con la base
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //lanzar query
            ResultSet resultados = statement.executeQuery(sqlurano);
            //respuesta de la base
            while (resultados.next()) {
                arrayUrano[0] = resultados.getString("id");
                arrayUrano[1] = resultados.getString("nombre");
                arrayUrano[2] = resultados.getString("radio_km");
                arrayUrano[3] = resultados.getString("periodo_orbital");
                arrayUrano[4] = resultados.getString("temperatura_media");
                arrayUrano[5] = resultados.getString("tipo");
                arrayUrano[6] = resultados.getString("numero_satelites");
                arrayUrano[7] = resultados.getString("estrella_id");
                arrayUrano[5] = resultados.getString("fecha_creacion");

//cerrar conexion
                statement.close();
                conexion.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
//return array
        return arrayUrano;

    }
    public String[] conectarConsultaNeptuno() {
        //Crear array
        String arrayNeptuno[] = new String[7];
        try {
            //Conectar con la base
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //lanzar query
            ResultSet resultados = statement.executeQuery(sqlneptuno);
            //respuesta de la base
            while (resultados.next()) {
                arrayNeptuno[0] = resultados.getString("id");
                arrayNeptuno[1] = resultados.getString("nombre");
                arrayNeptuno[2] = resultados.getString("radio_km");
                arrayNeptuno[3] = resultados.getString("periodo_orbital");
                arrayNeptuno[4] = resultados.getString("temperatura_media");
                arrayNeptuno[5] = resultados.getString("tipo");
                arrayNeptuno[6] = resultados.getString("numero_satelites");
                arrayNeptuno[7] = resultados.getString("estrella_id");
                arrayNeptuno[5] = resultados.getString("fecha_creacion");

//cerrar conexion
                statement.close();
                conexion.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
//return array
        return arrayNeptuno;

    }
    public String[] conectarConsulta(String sqlQuery) {
    String[] datosPlaneta = new String[8];
    try {
        Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
        Statement statement = conexion.createStatement();
        ResultSet resultados = statement.executeQuery(sqlQuery);
        if (resultados.next()) {
            datosPlaneta[0] = resultados.getString("id");
            datosPlaneta[1] = resultados.getString("nombre");
            datosPlaneta[2] = resultados.getString("radio_km");
            datosPlaneta[3] = resultados.getString("periodo_orbital");
            datosPlaneta[4] = resultados.getString("temperatura_media");
            datosPlaneta[5] = resultados.getString("tipo");
            datosPlaneta[6] = resultados.getString("numero_satelites");
            datosPlaneta[7] = resultados.getString("estrella_id");
        }
        statement.close();
        conexion.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return datosPlaneta;
}
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
}

