package cl.polett.biblioteca.servicio;

import cl.polett.biblioteca.modelo.Documento;

/**
 *
 * @author polett
 */
public interface BD {
    
    public boolean agregarLibro(Documento documento);
    
    public boolean agregarRevista(Documento documento);
    
    public boolean eliminar(Documento documento);
    
    public boolean listar(Documento documento);  
    
}
