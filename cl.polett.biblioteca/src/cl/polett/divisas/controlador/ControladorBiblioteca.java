package cl.polett.divisas.controlador;

import cl.polett.divisas.modelo.Documento;
import cl.polett.divisas.modelo.Libro;
import cl.polett.divisas.modelo.Revista;
import cl.polett.divisas.servicio.BD;
import cl.polett.divisas.servicio.impl.MySQL;

/**
 *
 * @author polett
 */
public class ControladorBiblioteca {

    public ControladorBiblioteca() {
    }
    
    public boolean agregarLibro(String codigoLibro, boolean enPrestamo, boolean paraPrestamo, String codigo, String titulo, String autor, String editorial, Integer anioPublicacion, String tipoDocumento){
        Libro libro = new Libro();
        
          
        BD bd = new MySQL();
        boolean ok = bd.agregar(libro);
        return ok;
    }
    
    public boolean agregarRevista(String codigoRevista, Integer volumen, Integer numero, String mesSalida, String codigo, String titulo, String autor, String editorial, Integer anioPublicacion, String tipoDocumento){
        Revista revista = new Revista();
        
        
        BD bd = new MySQL();
        boolean ok = bd.agregar(revista);
        return ok;
    }
    
    
    
}
