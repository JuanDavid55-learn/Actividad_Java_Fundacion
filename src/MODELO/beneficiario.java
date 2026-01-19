package MODELO;

public class beneficiario extends personas{
    private int cantidadAyudasMes;

    public beneficiario(String nombre, String apellido, String documento, int edad, String direccion, int cantidadAyudasMes) {
        super(nombre, apellido, documento, edad, direccion);
        this.cantidadAyudasMes = cantidadAyudasMes;
    }

    public int getCantidadAyudasMes() {
        return cantidadAyudasMes;
    }

    public void setCantidadAyudasMes(int cantidadAyudasMes) {
        this.cantidadAyudasMes = cantidadAyudasMes;
    }
    
    @Override
    public void presentarse() {
        System.out.println("");
        System.out.println("Hola, soy " + getNombre()+ " " + getApellido() + ", y soy un beneficiario");
        System.out.println("-------------------------------------------------");
        System.out.println("Documento: " + getDocumento());
        System.out.println("Edad: " + getEdad());
        System.out.println("Direccion: " + getDireccion());
        System.out.println("ayudas/mes: " + cantidadAyudasMes);
        System.out.println("------------------------------------");
    }
}
