import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        /*
        1. Sistema que efalue si un expatriado puede obtener un empleo. Se considera la nacionalidad, el tipo de visa,
        y si tiene experiencia en el puesto.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Ejercicio 1: Proceso de obtencion de empleo " + "\n");

        System.out.println("¿Es ciudadano o residente?: ");
        String nacionalidad = sc.nextLine();

        if (nacionalidad.equalsIgnoreCase("Ciudadano") || nacionalidad.equalsIgnoreCase("residente")) {
            System.out.println("Elegible para cualquier puesto");
        } else {
            System.out.println("Si su visa es elegible para trabajar, escriba 'Valida' :");
            String visa = sc.nextLine();
            if (visa.equalsIgnoreCase("Valida")) {

                System.out.println("¿Cuantos años de experiencia laboral tiene?");
                int experiencia = sc.nextInt();
                if (experiencia > 5) {
                    System.out.println("Elegible para un empleo calificado");
                } else if (experiencia < 5) {
                    System.out.println("Elegible para un empleo no calificado");
                }
            } else {
                System.out.println("Error. Visa Invalida. Candidato no calificado");
            }
        }

        /*
        2. Sistema que valida la identidad de un usuario durante una compra en linea basado en su pais
        de residencia, el codigo postal y si ha hecho compras previstas.
         */

        System.out.println("Ejercicio 2: verificacion de usuario en linea " + "\n");

        System.out.println("Ingrese pais de residencia: ");
        String residencia = sc.nextLine();

        if (residencia.equalsIgnoreCase("USA")) {
            System.out.println("Ingresa tu codigo postal: ");
            String postal = sc.nextLine();

            if (postal.charAt(0) == '9') {
                System.out.println("¿Ha realizado compras previas?: ");
                String compras = sc.nextLine();

                if (compras.equals("Si")) {
                    System.out.println("Ha hecho compras previas, puede pagar con Paypal");
                } else {
                    System.out.println("Se necesita realizar una verificacion con su direccion");
                }

            } else {
                System.out.println("Se requiere una tarjeta de credito para realizzar la compra");
            }

        } else if (residencia.equalsIgnoreCase("Europa")) {
            System.out.println("Ingresa tu codigo postal: ");
            String postal = sc.nextLine();

            if (postal.length() == 5) {
                System.out.println("¿Ha realizado compras previas?: ");
                String compras = sc.nextLine();

                if (compras.equals("Si")) {
                    System.out.println("Puede realizar su pago por transferencia bancaria");
                } else {
                    System.out.println("Se le pide realizar una verificacion bancaria");
                }
            } else {
                System.out.println("Codigo postal invalido. Su compra no puede ser realizada");
            }
        } else {
            System.out.println("Pais invalido. Favor de realizar una verificacion manual de su identidad.");
        }

        /*
        3. Realizar un sistema que verifique la disponibilidad de habitaciones en un hotel
        y elija el tipo de habitacion basado en la preferencia del cliente, la cantidad de personas,
        y la duracion de la estadia.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Ejercicio 3: Disponibilidad de habitaciones de hotel " + "\n");

        System.out.println("¿Para cuantas personas es la reservacion?: ");
        String reservacion = input.nextLine();

        if (reservacion.equalsIgnoreCase("1 persona")) {
            System.out.println("¿Prefiere una habitacion suite o una estandar?: ");
            String habitacion = input.nextLine();

            boolean disponible = true;
            boolean nodisponible = false;

            if (habitacion.equalsIgnoreCase("suite")) {
                System.out.println("¿De cuantas noches es su estadia?: ");
                int estadia = input.nextInt();

                if (disponible && estadia > 5) {
                    System.out.println("Elegible para un descuento del 10 %");
                } else if (nodisponible && estadia < 3) {
                    System.out.println("Elegible para una habitacion estandar");
                }
            } else if (habitacion.equalsIgnoreCase("estandar")) {
                System.out.println("Reservacion para habitacion estandar en progreso");
            }
        } else if (reservacion.equalsIgnoreCase("2 persona")) {
            System.out.println("¿Prefiere una habitacion suite o una estandar?: ");
            String habitacion = input.nextLine();

            boolean disponible = true;
            boolean nodisponible = false;

            if (habitacion.equalsIgnoreCase("suite") && disponible) {
                System.out.println("¿De cuantas noches es su estadia?: ");
                int estadia = input.nextInt();

                if (estadia > 5) {
                    System.out.println("Habitacion con desayuno incluido durante su estadia");
                } else if (estadia <= 5) {
                    System.out.println("Reservacion para una suite en progreso");
                }
            } else if (habitacion.equalsIgnoreCase("estandar") || nodisponible) {
                System.out.println("Se le asignara una habitacion doble estandar");
            }
        }


    }
}