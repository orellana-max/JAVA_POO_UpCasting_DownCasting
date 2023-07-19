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

//        a.acelerar();
//        a.toString();
//        a.prenderAire();
        Vehiculo v = a;
        //es iqgual que:   Vehiculo v = (Vehiculo) a; // de forma explicita
        
        // v.prenderAire(); // esto da error

        // Auto a2 = v; //da error de incompatibilidad
        Auto a2 = (Auto) v;
        a2.prenderAire();
        
        //veamos como podemos castear un auto a moto
//        Moto m2 = (Moto) v; // v es un auto, copila
//        m2.hacerWheliee(); // tambien copila
        // esto copila pero provoca una ClassCastException en tiempo de ejecución
        

//        v.acelerar();
//        v.toString();
//        al hacer un upcasting, se ocultan los campos de la subclase
//        v.prenderAire(); // esto da error
        c.agregarVehiculo(a);
        c.agregarVehiculo(new Moto(20, "Bajaj", "Rouser 135", "555 MDA"));

    }

}
