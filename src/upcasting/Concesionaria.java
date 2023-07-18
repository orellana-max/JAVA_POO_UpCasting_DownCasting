package upcasting;
import java.util.ArrayList;
import vehiculos.Vehiculo;
import vehiculos.Auto;
import vehiculos.Moto;

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
        //System.out.println(v.getModelo() + " Es un Auto?: " + (v instanceof Auto));
        this.vehiculos.add(v);
        if (v instanceof Auto) {
            System.out.println("Se agrego un Auto");
        } else if(v instanceof Moto) {
            System.out.println("Se agrego una Moto");
        } else {
            System.out.println("Se agrego un Vehiculo");
        }
    }
    
}
