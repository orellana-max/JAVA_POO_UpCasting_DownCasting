package upcasting;

import vehiculos.Auto;
import vehiculos.Moto;
import vehiculos.Vehiculo;

/**
 * @author @author Maximiliano Orellana
 */
public class Principal {

    public static void main(String[] args) {
        Concesionaria c = new Concesionaria();
        Auto a = new Auto(true, "Ford", "mustang", "ABC 123");
        
        a.acelerar();
        a.toString();
        a.prenderAire();
        
        Vehiculo v = a;
        
        v.acelerar();
        v.toString();
        // al hacer un upcasting, se ocultan los campos de la subclase
       // v.prenderAire(); // esto da error
       // Auto a2 = v; //da error de incompatibilidad
        
        
        c.agregarVehiculo(a);
        c.agregarVehiculo(new Moto(20, "Bajaj", "Rouser 135", "555 MDA"));
        
        
    }
    
}
