package upcasting;
import java.util.ArrayList;
import vehiculos.Vehiculo;

/**
 * @author @author Maximiliano Orellana
 * Mi perfil en GitHub: https://github.com/orellana-max
 */
public class Concesionaria {
    ArrayList<Vehiculo> vehiculos;

    public Concesionaria() {
        this.vehiculos = new ArrayList<>();
    }
    
    public void agregarVehiculo(Vehiculo v){
        this.vehiculos.add(v);
    }
    
}
