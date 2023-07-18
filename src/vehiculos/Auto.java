package vehiculos;

/**
 *
 * @author Maximiliano Orellana
 * mi perfil en GitHub: https://github.com/orellana-max
 */
public class Auto extends Vehiculo{
    
    private boolean tieneAire;

    public Auto(boolean tieneAire, String marca, String modelo, String patente) {
        super(marca, modelo, patente);
        this.tieneAire = tieneAire;
    }
    
    public void prenderAire(){
        // codigo para ver si se tiene visibilidad del atributo marca heredado
        //System.out.println(marca);
        if (tieneAire) {
            System.out.println("Prendiendo el aire . . .");
        }
        
    }
}
