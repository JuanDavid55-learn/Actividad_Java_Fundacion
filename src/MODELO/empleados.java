package MODELO;

public class empleados extends personas{
    private double salario;
    private String cargo;
    private String horario;

    public empleados(double salario, String cargo, String horario, String nombre, String apellido, String documento, int edad, String direccion) {
        super(nombre, apellido, documento, edad, direccion);
        this.salario = salario;
        this.cargo = cargo;
        this.horario = horario;
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }

    public String getHorario() {
        return horario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
 
}
