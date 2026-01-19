package CONTROLADOR;

import MODELO.beneficiario;
import MODELO.colaboradores;
import MODELO.empleados;
import MODELO.personas;
import java.util.Scanner;

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

    public void menu() {
        boolean boleanito = true;
        while (boleanito == true) {
            System.out.println("""
                           -------------------------------
                           MENU PRINCIPAL
                           -------------------------------
                           1.registrar
                           2.ver personas registradas
                           3.salir
                           -------------------------------
                           """);
            int opc = validacion(1, 3, "Eliga una opcion. ");
            switch (opc) {
                case 1:
                    registrar();
                    break;
                case 2:
                    verPersonas();
                    break;
                case 3:
                    boleanito = false;
            }
        }
    }

    @Override
    public void registrar() {
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
        int opc_tipoPersona = validacion(1, 3, "¿que tipo de persona es?. (1.Empleado)(2.Colaborador)(3.Beneficiario)");
        switch (opc_tipoPersona) {
            case 1:
                System.out.println("Porfavor Ingresa el salario");
                double salario = new Scanner(System.in).nextDouble();
                System.out.println("Porfavor Ingresa el cargo");
                String cargo = new Scanner(System.in).nextLine();
                String horario = "";
                int opc_tipoHorario = validacion(1, 2, "¿cual es el horario del empleado? (1. 8-5 pm)(2. 2-11 pm)");
                if (opc_tipoHorario == 1) {
                    horario = "8-5 pm";
                } else if (opc_tipoHorario == 2) {
                    horario = "2-11 pm";
                }
                empleados e = new empleados(nombre, salario, apellido, horario, documento, edad, direccion, cargo);
                registros.add(e);
                System.out.println("El empleado se ha registrado satisfactoriamente.");
                break;
            case 2:
                int horasMes = validacion(1, 25, "¿cuantas horas ha cumplido de forma voluntaria este mes? (no puede registrar mas de 25 horas)");
                colaboradores c = new colaboradores(nombre, apellido, documento, edad, direccion, horasMes);
                registros.add(c);
                System.out.println("El colaborador se ha registrado satisfactoriamente.");
                break;
            case 3:
                int cantidadAyudasMes = validacion(1, 25, "¿cuantas ayudas a cumplido este mes? (no puede registrar mas de 5 horas)");
                beneficiario b = new beneficiario(nombre, apellido, documento, edad, direccion, cantidadAyudasMes);
                registros.add(b);
                System.out.println("El beneficiario se ha registrado satisfactoriamente.");
                break;
        }
    }

    @Override
    public void verPersonas() {
        for (personas p : registros) {
            p.presentarse();
        }
    }
}
