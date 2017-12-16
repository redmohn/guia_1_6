package cl.polett.biblioteca.controlador;

import cl.polett.biblioteca.modelo.Documento;
import cl.polett.biblioteca.modelo.Libro;
import cl.polett.biblioteca.modelo.Revista;
import cl.polett.biblioteca.servicio.BD;
import cl.polett.biblioteca.servicio.impl.MySQL;

/**
 *
 * @author polett
 */
public class ControladorBiblioteca {

    public ControladorBiblioteca() {
    }
    
    public boolean agregarLibro(boolean prestamo, String codigo, String titulo, String autor, String editorial, Integer anioPublicacion, String tipoDocumento){
        Libro libro = new Libro();
        
          
        BD bd = new MySQL();
        boolean ok = bd.agregarLibro(libro);
        return ok;
    }
    
    public boolean agregarRevista(Integer volumen, Integer numero, String mesSalida, String codigo, String titulo, String autor, String editorial, Integer anioPublicacion, String tipoDocumento){
        Revista revista = new Revista();
        
        
        BD bd = new MySQL();
        boolean ok = bd.agregarRevista(revista);
        return ok;
    }
    
    
    
}
