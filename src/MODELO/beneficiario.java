package MODELO;

public class beneficiario extends personas{
    private int cantidadAyudasMes;

    public beneficiario(int cantidadAyudasMes, String nombre, String apellido, String documento, int edad, String direccion) {
        super(nombre, apellido, documento, edad, direccion);
        this.cantidadAyudasMes = cantidadAyudasMes;
    }

    public int getCantidadAyudasMes() {
        return cantidadAyudasMes;
    }

    public void setCantidadAyudasMes(int cantidadAyudasMes) {
        this.cantidadAyudasMes = cantidadAyudasMes;
    }
    
}
