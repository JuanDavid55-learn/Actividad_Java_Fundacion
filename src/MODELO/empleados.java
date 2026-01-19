package MODELO;

public class empleados extends personas {

    private double salario;
    private String cargo;
    private String horario;

    public empleados(String nombre, double salario, String apellido, String horario, String documento, int edad, String direccion, String cargo) {
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

    @Override
    public void presentarse() {
        System.out.println("");
        System.out.println("Hola, soy " + getNombre()+ " " + getApellido() + ", y soy empleado");
        System.out.println("-------------------------------------------------");
        System.out.println("Documento: " + getDocumento());
        System.out.println("Edad: " + getEdad());
        System.out.println("Direccion: " + getDireccion());
        System.out.println("Cargo: " + cargo);
        System.out.println("Horario: " + horario);
        System.out.println("Salario: " + salario);
        System.out.println("------------------------------------");
    }
}
