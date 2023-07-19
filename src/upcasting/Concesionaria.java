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
            Auto a = (Auto) v;
            a.prenderAire();
        } else {
            ((Moto) v).hacerWheliee();            
        }
    }
    
}
