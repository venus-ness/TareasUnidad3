import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese su puntaje crediticio: ");
        double puntaje = sc.nextDouble();


        System.out.println("Ingrese sus ingresos mensuales: ");
        double ingresos = sc.nextDouble();


        System.out.println("Ingrese la cantidad que requiere para el credito hipotecario: ");
        double credito = sc.nextDouble();

        System.out.println("Ingrese la duracion del prestamo en años: ");
        double prestamo = sc.nextDouble();

        System.out.println("Ingrese su porcentaje de ahorro personal: ");
        double porcentajeAhorro = sc.nextDouble();
        sc.nextLine();

        if (nombre.matches(".\\d.")) {
            System.out.println("Error. Formato de nombre b=no valido, no tiene que contener numeros.");
        } else {
            if (puntaje < 600) {
                System.out.println("Solicitud rechazada, puntaje muy bajo.");
            } else if (puntaje > 600 && puntaje < 740) {

                double n = prestamo * 12;
                double r = (.06 / 100) / n;
                double cuotaM = credito * ((r * Math.pow(1 + r, n)) / ((Math.pow(1 + r, n) - 1)));
                String cuota = String.format("%.2f", cuotaM);

                double montoTotal = cuotaM * n;

                if (ingresos < (3 * cuotaM)) {
                    System.out.println("Solicitud rechazada, ingresos muy bajo.");
                } else {
                    System.out.println(nombre.toUpperCase() + "," + " Su cuota mensual es de: " + cuota + "," + " Su taza de interes es del 6%." + "," + " Su monto total a pagar es: " + montoTotal);
                }
            } else if (puntaje > 740) {

                double n = prestamo * 12;
                double r = (.04 / 100) / 12;
                double cuotaM = credito * ((r * Math.pow(1 + r, n)) / ((Math.pow(1 + r, n) - 1)));
                String cuota = String.format("%.2f", cuotaM);

                if (ingresos > (2.5 * cuotaM)) {
                    System.out.println("Su cuota mensual es de: " + cuota + "," + " Su taza de interes es del 4%.");
                } else {
                    System.out.println("Solicitud rechazada, ingresos muy bajos.");
                }


            }
        }


    }
}