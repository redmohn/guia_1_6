package cl.polett.divisas.modelo;

/**
 *
 * @author polett
 */
public class Libro extends Documento{
    
    private String codigoLibro;
    private boolean enPrestamo;
    private boolean paraPrestamo;

    public Libro() {
    }

    public Libro(String codigoLibro, boolean enPrestamo, boolean paraPrestamo) {
        this.codigoLibro = codigoLibro;
        this.enPrestamo = enPrestamo;
        this.paraPrestamo = paraPrestamo;
    }

    public Libro(String codigoLibro, boolean enPrestamo, boolean paraPrestamo, String codigo, String titulo, String autor, String editorial, Integer anioPublicacion, String tipoDocumento) {
        super(codigo, titulo, autor, editorial, anioPublicacion, tipoDocumento);
        this.codigoLibro = codigoLibro;
        this.enPrestamo = enPrestamo;
        this.paraPrestamo = paraPrestamo;
    }

    public String getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(String codigoLibro) {
        this.codigoLibro = codigoLibro;
    }  

    public boolean isEnPrestamo() {
        return enPrestamo;
    }

    public void setEnPrestamo(boolean enPrestamo) {
        this.enPrestamo = enPrestamo;
    }

    public boolean isParaPrestamo() {
        return paraPrestamo;
    }

    public void setParaPrestamo(boolean paraPrestamo) {
        this.paraPrestamo = paraPrestamo;
    }
    
    
    
}
