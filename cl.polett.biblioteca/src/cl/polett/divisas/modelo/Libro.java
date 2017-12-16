package cl.polett.divisas.modelo;

/**
 *
 * @author polett
 */
public class Libro extends Documento{
    
    private boolean prestamo;

    public Libro() {
    }

    public Libro(boolean prestamo) {
        this.prestamo = prestamo;
    }

    public Libro(boolean prestamo, String codigo, String titulo, String autor, String editorial, Integer anioPublicacion, String tipoDocumento) {
        super(codigo, titulo, autor, editorial, anioPublicacion, tipoDocumento);
        this.prestamo = prestamo;
    }

    public boolean isPrestamo() {
        return prestamo;
    }

    public void setprestamo(boolean enPrestamo) {
        this.prestamo = enPrestamo;
    }
}
