import java.util.ArrayList;

/**
 * Clase que permite instanciar los datos de un carro.
 * @author Oscar Buriticá
 * @author Juan C Henao M
 * @version 2.0
 */
public class DatosCarros {
    
    private ArrayList<Carro>carros; 

    
    public DatosCarros() {
        carros = new ArrayList<>();
    }

    /**
     * permite guardar un carro en la lista de carros.
     * @param carro carro que se registra
     */
    public void registrarCarro(Carro carro){
        carros.add(carro);

    }

    /**
     * 
     * @return
     */
    public ArrayList<Carro> consultarCarros(){

        return null;
    }
}
