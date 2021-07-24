import java.util.ArrayList;

/**
 * Clase que permite realizar pruebas del sistema.
 * @version 1.0
 */
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //Pruebas
        //Se crean objetos tipo Carro
        Carro carro = new Carro("JHG876",13.5, 2016);
        Carro carro2 = new Carro("ARQ980",14.5, 2018);

        //Se crea el objeto tipo DatosCarro
        DatosCarros datos = new DatosCarros();
        datos.registrarCarro(carro);
        datos.registrarCarro(carro2);

        ArrayList<Carro>prueba = new ArrayList<>();
        prueba = datos.consultarCarros();

        for(int i = 0; i<prueba.size();i++){
            System.out.println(prueba.get(i).placa);
        }
    }
}
