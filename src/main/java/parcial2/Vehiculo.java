package parcial2;

public class Vehiculo {

    private String marca;
    private String modelo;
    private int año;
    private TipoCombustible tipoCombustible;
    
    public Vehiculo(String marca, String modelo, int año, TipoCombustible tipoCombustible) {
    this.marca = marca;
    this.modelo = modelo;
    this.año = año;
    this.tipoCombustible = tipoCombustible;
    }
    public void imprimirInformacion(){
        System.out.println("");
    }
}