
/**
 * Clase que permite instanciar un carro
 * @author Oscar Buriticá
 * @author Juan C Henao M
 * @version 4.0
 */
public class Carro {
    String placa;
    double galones;
    int modelo;

    /**
     * Constructor
     */
    public Carro() {
    }

    /**
     * Constructor que permite modelar un carro.
     * @param placa
     * @param galones
     * @param modelo
     */
    public Carro(String placa, double galones, int modelo) {
        this.placa = placa;
        this.galones = galones;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public double getGalones() {
        return galones;
    }

    public int getModelo() {
        return modelo;
    }

    
}
