import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        /*
        1. SISTEMA DE ADMINISTRACION DE CURSOS
         */


        Scanner sc = new Scanner(System.in);

        /*
        System.out.println("SISTEMA DE ADMINISTRACION DE CURSOS " + "\n");

        System.out.println("Ingrese su nombre completo: ");
        String nombreCompleto = sc.nextLine();

        System.out.println("Ingrese su ID: ");
        String identificacion = sc.nextLine();

        System.out.println("Ingrese su promedio general: ");
        double promedio = sc.nextDouble();

        System.out.println("Ingrese la cantidad de materias que desea cursar: ");
        int materias = sc.nextInt();

        if (promedio > 7) {
            System.out.println("Error. Promedio insuficiente, no se puede completar la inscripcion");
            System.exit(0);
        } else if (promedio >= 7 && promedio < 8.5) {
            if (materias > 3){
                System.out.println("Puedes continuar tu inscripcion");
            } else {
                System.out.println("Error. Limite de materias alcanzada");
            }
        } else {
            if (nombreCompleto.length() > 25) {
                System.out.println("Error. Demasiados caracteres en nombre de usuario. Intente de nuevo.");
            } else if (identificacion.length() < 8) {
                System.out.println("Error. Formato de ID incorrecto. Intente de nuevo.");
            } else {
                if (materias == 5) {
                    System.out.println("Puedes inscribirte");
                } else if (materias > 5) {
                    System.out.println("¿Cuantas materias ha aprobado el semestre anterior?");
                    int materiasAprobada = sc.nextInt();

                    if (materiasAprobada > 3) {
                        System.out.println("Tiene un limnite de 6 materias por semestre");
                    } else {
                        System.out.println("Tiene un limite a 5 materias este semestre");
                    }
                }
            }
        } */

        /*
        2. SISTEMA DE COMPRA DE BOLETOS PARA EVENTOS
         */

        /*
        System.out.println("SISTEMA DE COMPRA DE BOLETOS PARA EVENTOS " + "\n");

        System.out.println("Ingrese el tipo de membresia con el que cuenta (Premium, Estandar o Basica): ");
        String membresia = sc.nextLine();

        if (membresia.equalsIgnoreCase("Premium")) {
            System.out.println("Ingrese su edad: ");
            int edad = sc.nextInt();
            sc.nextLine(); // Para consumir el salto de linea restante

            if (edad < 18) {
                System.out.println("Acceso denegado. Edad no valida para realizar compras internacionales");
            } else if (edad >= 18 && edad < 25) {
                System.out.println("¿Desea hacer una compra nacional o internacional?");
                String compra = sc.nextLine();

                if (compra.equalsIgnoreCase("internacional")) {
                    System.out.println("Elegible para un descuento del 20%");
                } else {
                    System.out.println("Elejible para un descuento del 10%");
                }
            } else if (edad >= 25) {
                System.out.println("¿Desea hacer una compra nacional o internacional?");
                String compra = sc.nextLine();

                if (compra.equalsIgnoreCase("internacional")) {
                    System.out.println("Elegible para un descuento del 25%");
                } else {
                    System.out.println("Elejible para un descuento del 15%");
                }
            }
        } else if (membresia.equalsIgnoreCase("Estandar")) {
            System.out.println("Ingrese su edad: ");
            int edad = sc.nextInt();
            sc.nextLine();

            if (edad < 18) {
                System.out.println("Acceso denegado. Edad no valida para realizar compras internacional");
            } else if (edad >= 18) {
                System.out.println("¿Desea hacer una compra nacional o internacional?");
                String compra = sc.nextLine();

                if (compra.equalsIgnoreCase("nacionales")) {
                    System.out.println("Elegible para un descuento del 5%");
                } else {
                    System.out.println("Lo sentimos no cuenta con ningun descuento.");
                }
            }
        } else {
            System.out.println("Membresia no valida para realizar compras.");
        }


         */


        /*
        3. SISTEMA DE EVALUACION DE BENEFICIOS DE SEGURO MEDICO
         */

        System.out.println("SISTEMA DE EVALUACION DE SEGURO MEDICO " + "\n");

        System.out.println("Ingrese su nombre");
        String nombre = sc.nextLine();

        System.out.println("Ingrese su edad");
        int edad = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea pendiente

        System.out.println("Ingrese su Pais de residencia");
        String pais = sc.nextLine();

        System.out.println("Estado civil");
        String estadoCivil = sc.nextLine();

        System.out.println("Ingrese su ingreso anual");
        double ingresoAnual = sc.nextDouble();
        sc.nextLine(); // Consumir el salto de línea pendiente

        System.out.println("¿Tiene hijos?(si o no)");
        String hijos = sc.nextLine();

        // Validaciones iniciales
        if (nombre.matches(".\\d.")) {
            System.out.println("Error: El nombre de usuario no puede contener números.");
            return;
        }

        if (edad < 25) {
            System.out.println("Error: La edad debe ser mayor que 25.");
            return;
        }

        double precioBase = 500;
        double descuento = 0;

        // Lógica para México
        if (pais.equalsIgnoreCase("mexico")) {
            if (estadoCivil.equalsIgnoreCase("casado")) {
                if (ingresoAnual < 300000) {
                    descuento = hijos.equalsIgnoreCase("si") ? 0.10 : 0.05;
                }
            } else {
                if (ingresoAnual < 400000) {
                    descuento = 0.08;
                }
            }
        }

        // Lógica para USA
        else if (pais.equalsIgnoreCase("usa")) {
            if (estadoCivil.equalsIgnoreCase("soltero")) {
                if (ingresoAnual < 200000) {
                    descuento = 0.07;
                    if (hijos.equalsIgnoreCase("si")) {
                        descuento += 0.03;
                    }
                } else if (ingresoAnual < 500000) {
                    // Nuevo caso para solteros con ingreso entre 200000 y 500000
                    descuento = 0.07;
                    if (hijos.equalsIgnoreCase("si")) {
                        descuento += 0.03;
                    }
                }
            } else if (estadoCivil.equalsIgnoreCase("casado")) {
                if (ingresoAnual < 500000) {
                    descuento = 0.12;
                    if (hijos.equalsIgnoreCase("si")) {
                        descuento += 0.03;
                    }
                }
            }
        }
        // Lógica para otros países
        else {
            if (estadoCivil.equalsIgnoreCase("casado")) {
                descuento = 0.05;
                if (ingresoAnual < 200000) {
                    descuento += 0.02;
                }
            } else {
                descuento = 0.03;
                if (ingresoAnual < 200000) {
                    descuento += 0.02;
                }
            }
        }

        double precioFinal = precioBase * (1 - descuento);

        if (descuento > 0) {
            System.out.printf("Estimado %s, puede reclamar un descuento del %.0f%% en su seguro%n",
                    nombre, descuento * 100);
            System.out.printf("Precio final: $%.2f%n", precioFinal);
        } else {
            System.out.println("Usted no califica para recibir beneficios");
        }

        sc.close();

    }
}