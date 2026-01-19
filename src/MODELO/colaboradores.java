package MODELO;

public class colaboradores extends personas{
    private int horasMes;
    private double bonificacion;

    public colaboradores(int horasMes, double bonificacion, String nombre, String apellido, String documento, int edad, String direccion) {
        super(nombre, apellido, documento, edad, direccion);
        this.horasMes = horasMes;
        this.bonificacion = bonificacion;
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
    
}
