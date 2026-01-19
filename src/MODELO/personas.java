package MODELO;

public class personas {
    private String nombre;
    private String apellido;
    private String documento;
    private int edad;
    private String direccion;

    public personas(String nombre, String apellido, String documento, int edad, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.edad = edad;
        this.direccion = direccion;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }
    
    public void presentarse(){
        System.out.println("Hola, soy " + getNombre() + " " + getApellido() + ", un gusto conocerte");
    }
}
