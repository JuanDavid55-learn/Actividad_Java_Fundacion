package MODELO;

public class colaboradores extends personas{
    private int horasMes;
    private double bonificacion;

    public colaboradores(String nombre, String apellido, String documento, int edad, String direccion, int horasMes) {
        super(nombre, apellido, documento, edad, direccion);
        this.horasMes = horasMes;
        this.bonificacion = horasMes * 55000;
    }

    public int getHorasMes() {
        return horasMes;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setHorasMes(int horasMes) {
        this.horasMes = horasMes;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }
    
    @Override
    public void presentarse() {
        System.out.println("");
        System.out.println("Hola, soy " + getNombre()+ " " + getApellido() + ", y soy un colaborador");
        System.out.println("-------------------------------------------------");
        System.out.println("Documento: " + getDocumento());
        System.out.println("Edad: " + getEdad());
        System.out.println("Direccion: " + getDireccion());
        System.out.println("Horas/mes: " + horasMes);
        System.out.println("bonificacion: " + bonificacion);
        System.out.println("------------------------------------");
    }
}
