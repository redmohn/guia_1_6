package cl.polett.divisas.modelo;

/**
 *
 * @author polett
 */
public class Libro extends Documento{
    
    private boolean enPrestamo;
    private boolean paraPrestamo;

    public Libro() {
    }

    public Libro(boolean enPrestamo, boolean paraPrestamo) {
        this.enPrestamo = enPrestamo;
        this.paraPrestamo = paraPrestamo;
    }

    public Libro(boolean enPrestamo, boolean paraPrestamo, String codigo, String titulo, String autor, String editorial, Integer anioPublicacion, String tipoDocumento) {
        super(codigo, titulo, autor, editorial, anioPublicacion, tipoDocumento);
        this.enPrestamo = enPrestamo;
        this.paraPrestamo = paraPrestamo;
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
