package cl.polett.divisas.modelo;

/**
 *
 * @author polett
 */
public class Revista extends Documento{
    
    private Integer volumen;
    private Integer numero;
    private String mesSalida;

    public Revista() {
    }

    public Revista(Integer volumen, Integer numero, String mesSalida) {
        this.volumen = volumen;
        this.numero = numero;
        this.mesSalida = mesSalida;
    }

    public Revista(Integer volumen, Integer numero, String mesSalida, String codigo, String titulo, String autor, String editorial, Integer anioPublicacion, String tipoDocumento) {
        super(codigo, titulo, autor, editorial, anioPublicacion, tipoDocumento);
        this.volumen = volumen;
        this.numero = numero;
        this.mesSalida = mesSalida;
    }  

    public Integer getVolumen() {
        return volumen;
    }

    public void setVolumen(Integer volumen) {
        this.volumen = volumen;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getMesSalida() {
        return mesSalida;
    }

    public void setMesSalida(String mesSalida) {
        this.mesSalida = mesSalida;
    }
        
}
