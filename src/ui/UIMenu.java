package ui;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.Doctor;
import modelo.Persona;

public class UIMenu {
    private static int menu = 0;
    private static final ArrayList<Doctor> DOCTORES = new ArrayList<>();
    private static final ArrayList<Persona> PERSONAS = new ArrayList<>();

    public static void menuGeneral() {
        do {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Elija una opción");
            System.out.println("1. Crear o a listar doctores y Personas ");
            System.out.println("2. Opcion aun no habilitada de pacientes");
            System.out.println("3 Salir");
            int showMenu = entrada.nextInt();
            switch (showMenu) {
                case 1 -> {
                    menuDoctor();
                }
                case 2 -> System.out.println("Aun no habilitado esta opcion proximamente");
                case 3 -> menu = 1;
                default -> System.out.println("Opcion incorrecta vuelva a intentar");
            }
        } while (menu != 1);
    }
    private static void menuDoctor() {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("1. Crear doctor");
            System.out.println("2. Crear  persona");
            System.out.println("3. Lista de doctores");
            System.out.println("4. Lista de personas");
            System.out.println("5. Salir");
            int opciones = input.nextInt();
            switch (opciones) {
                case 1 -> {
                    Scanner entrada = new Scanner(System.in);
                    System.out.println("Ingresa los nombres");
                    String nombres = entrada.nextLine();
                    System.out.println("Ingresa los apellidos");
                    String apellidos = entrada.nextLine();
                    System.out.println("La fecha de nacimiento");
                    System.out.println("Ingresa el año");
                    int year = entrada.nextInt();
                    System.out.println("Ingresa el mes");
                    int month = entrada.nextInt();
                    System.out.println("Ingresa el dia");
                    int day = entrada.nextInt();
                    LocalDate fechaNacimiento = LocalDate.of(year, month - 1, day);
                    System.out.println("Ingresa tipo de especialidad");
                    String tipoEspecialidad = entrada.next();
                    DOCTORES.add(new Doctor(nombres, apellidos, fechaNacimiento, tipoEspecialidad));
                }
                case 2 -> {
                    Scanner entrada = new Scanner(System.in);
                    System.out.println("Ingresa los nombres");
                    String nombres = entrada.nextLine();
                    System.out.println("Ingresa los apellidos");
                    String apellidos = entrada.nextLine();
                    System.out.println("La fecha de nacimiento");
                    System.out.println("Ingresa el año");
                    int year = entrada.nextInt();
                    System.out.println("Ingresa el mes");
                    int month = entrada.nextInt();
                    System.out.println("Ingresa el dia");
                    int day = entrada.nextInt();
                    LocalDate fechaNacimiento = LocalDate.of(year, month, day);
                    PERSONAS.add(new Persona(nombres, apellidos, fechaNacimiento));

                }
                case 3 -> {
                    int cantidadDatosDoctores = DOCTORES.size();
                    if (cantidadDatosDoctores > 0) {
                        System.out.println("-".repeat(200));
                        System.out.printf("|%-20s|%-5s %-48s|%-25s|%-12s|%-20s|%-10s|\n", "Id", "Nombres", "y Apellidos", "Fecha de nacimiento", "Edad", "Especialidad", "Salario");
                        System.out.println("-".repeat(200));

                        for (Doctor doc : DOCTORES) {
                            System.out.printf("|%-20s|%-5s %-45s|%-25s|%-12s|%-20s|%-10s|\n", doc.getId(), doc.getNombres(), doc.getApellidos(), doc.getFechaNacimiento(), doc.getEdad(), doc.getEspecialidad(), doc.getGananciaPromedio());
                            System.out.println("-".repeat(200));
                        }
                    }
                }
                case 4 -> {
                    int cantidadDatosPersonas = PERSONAS.size();
                    if (cantidadDatosPersonas > 0) {
                        System.out.println("-".repeat(200));
                        System.out.printf("|%-20s|%-5s %-48s|%-25s|%-20s|\n", "Id", "Nombres", "y Apellidos", "Fecha de nacimiento", "Edad");
                        System.out.println("-".repeat(200));

                        for (Persona per : PERSONAS) {
                            System.out.printf("|%-20s|%-5s %-45s|%-25s|%-20d|\n", per.getId(), per.getNombres(), per.getApellidos(), per.getFechaNacimiento(), per.getEdad());
                        }

                        System.out.println("-".repeat(200));
                    }
                }
                case 5 -> {
                    System.out.println("Gracias por usar nuestro servicio");
                    menuGeneral();
                }
                default ->
                        System.out.println("Ha elegido una opción no existente por favor elija una opción que se muestre en el menu");
            }
        } while (menu != 1);
    }

    private static void menuEspecialidad() {
        int menu =0;
        do {
            System.out.println();
            System.out.println();
        }while (menu!=0);

    }
}
