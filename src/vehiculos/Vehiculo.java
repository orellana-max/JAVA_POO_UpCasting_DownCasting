package vehiculos;

/**
 *
 * @author Maximiliano Orellana
 * mi perfil en GitHub: https://github.com/orellana-max
 */
public class Vehiculo {
    
    private String marca;
    private String modelo;
    private String patente;

    public Vehiculo(String marca, String modelo, String patente) {
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
    }
    
    public String getMarca(){
        return marca;
    }

    public void setMarca(String nuevaMarca) {
        if (nuevaMarca != null) {
            this.marca = nuevaMarca;
        }
    }
    
    public void acelerar(){
        System.out.println("Acelerando . . . ");
    }
    public void frenar(){
        System.out.println("Frenando . . . ");
    }
    
    protected void chequearMotor(){
        System.out.println("Chequeando motor . . . ");
    }
    
    public void encender(){
        System.out.println("Encendiendo . . . ");
    }
}
