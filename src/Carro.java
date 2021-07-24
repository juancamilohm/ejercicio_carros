
/**
 * Clase que permite instanciar un carro
 * @author Oscar Buriticá
 * @author Juan C Henao M
 * @version 5.0
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

    /**
     * Metodo para obtener la placa del carro
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Metodo para obtener la cantidad de galones del carro
     */
    public double getGalones() {
        return galones;
    }

    /**
     * Metodo para obtener el modelo del carro
     */
    public int getModelo() {
        return modelo;
    }

    
}
