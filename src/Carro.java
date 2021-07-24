public class Carro {
    String placa;
    double galones;
    int modelo;

    /**
     * 
     */
    public Carro() {
    }

    /**
     * 
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
