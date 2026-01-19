package CONTROLADOR;

import MODELO.empleados;
import java.util.Scanner;
import java.util.ArrayList;

public class funciones extends funcionAbstracta {

    public static int validacion(int valorminimo, int valormaximo, String mensaje) {
        boolean validar = false;
        int opc = 0;
        do {
            try {
                System.out.println(mensaje);
                opc = new Scanner(System.in).nextInt();
                while (opc < valorminimo || opc > valormaximo) {
                    System.out.println("no valido, intente de nuevo.");
                    opc = new Scanner(System.in).nextInt();
                }
                validar = true;
            } catch (Exception e) {
                System.out.println("error, elija una opcion valida");
            }
        } while (validar == false);
        return opc;
    }

    ArrayList<Integer> registroPersonas = new ArrayList<>();

    public void menu() {
        boolean boleanito = true;
        while (boleanito == true) {
            System.out.println("""
                           -------------------------------
                           MENU PRINCIPAL
                           -------------------------------
                           1.registrar
                           2.ver usuarios registrados
                           3.salir
                           """);
        }
        int opc = validacion(1, 3, "Eliga una opcion. ");
        switch (opc) {
            case 1:
                System.out.println("Porfavor Ingresa el nombre");
                String nombre = new Scanner(System.in).nextLine();
                System.out.println("Porfavor Ingresa el apellido");
                String apellido = new Scanner(System.in).nextLine();
                System.out.println("Porfavor Ingresa el numero de documento");
                String documento = new Scanner(System.in).nextLine();
                System.out.println("Porfavor Ingresa la edad");
                int edad = new Scanner(System.in).nextInt();
                System.out.println("Porfavor Ingresa la direccion");
                String direccion = new Scanner(System.in).nextLine();
                System.out.println("""
                           -------------------------------
                           TIPO USUARIOS
                           -------------------------------
                           1.Empleados
                           2.Colaboradoress
                           3.Beneficiarios
                           """);
                int opc_1 = validacion(1, 3, "¿que tipo de usuario es?");
                switch (opc_1) {
                    case 1:
                        System.out.println("Porfavor Ingresa el salario");
                        double salario = new Scanner(System.in).nextDouble();
                        System.out.println("Porfavor Ingresa el cargo");
                        String cargo = new Scanner(System.in).nextLine();
                        System.out.println("¿cual es el horario del empleado? (1. 8-5 pm)(2. 2-11 pm)");
                        int opc_tipoHorario = new Scanner(System.in).nextInt();
                }
        }
    }
    @Override
    public void registrar() {
    }
}
