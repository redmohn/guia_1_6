package cl.polett.biblioteca.servicio.impl;

import cl.polett.biblioteca.modelo.Documento;
import cl.polett.biblioteca.modelo.Libro;
import cl.polett.biblioteca.modelo.Revista;
import cl.polett.biblioteca.servicio.BD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author polett
 */
public class MySQL implements BD {
    
        private Connection conectar() {
        Connection conexion = null;
        try {
            String url = "jdbc:mysql://127.0.0.1:3306/guia_1_6";
            String user = "root";
            String pass = "polett";
            conexion = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            conexion = null;
            System.err.println(String.format("Ha ocurrido error: %s", e.toString()));
        }
        return conexion;
    }
        
    private void desconectar(Connection conexion) {
        try {
            if (conexion != null) {
                conexion.close();
            }
        } catch (Exception e) {
            System.err.println(String.format("Ha ocurrido error: %s", e.toString()));
        }
    }

    public boolean agregarLibro(Libro libro) {
        boolean ok = false;
        try {
            if(libro != null){
                Connection conexion = conectar();
                if (conexion != null){
                    PreparedStatement preparedStatement = conexion.prepareStatement("INSERT INTO Libro ()");
                }
            }
        } catch (Exception e) {
            ok = false;
            System.err.println(String.format("Ha ocurrido error: %s", e.toString()));
        }
        return ok;
    }
    
    public boolean agregarRevista(Revista revista){
        boolean ok = false;
        try {
            if(revista != null){
                Connection conexion = conectar();
                if (conexion != null){
                    PreparedStatement preparedStatement = conexion.prepareStatement("INSERT INTO Revista ()");
                }
            }
        } catch (Exception e) {
            ok = false;
            System.err.println(String.format("Ha ocurrido error: %s", e.toString()));
        }
        return ok;
    }

    @Override
    public boolean eliminar(Documento documento) {
        boolean ok = false;
        try {
            if (documento != null) {
                Connection conexion = conectar();
                if (conexion != null) {

                    // Los preparedStatement sirven para ejecutar código sanitizado en la base de datos
                    PreparedStatement prepareStatement = conexion.prepareStatement("DELETE FROM Documento  WHERE codigo=?");
                    prepareStatement.setString(1, documento.getCodigo());
                    // execute se usa para valores que no tienen datos que retornar (DDL)
                    prepareStatement.execute();
                    ok = true;

                    desconectar(conexion);
                }
            }
        } catch (Exception e) {
            ok = false;
            System.err.println(String.format("Ha ocurrido error: %s", e.toString()));
        }
        return ok;
    }

    @Override
    public boolean listar(Documento documento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean agregarLibro(Documento documento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean agregarRevista(Documento documento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
