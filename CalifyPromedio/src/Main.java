import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int calificaciones[] = new int[10];

        System.out.println("Ingrese las calificaciones: ");
        for (int i = 0; i < calificaciones.length; i++) {
            calificaciones[i] = in.nextInt();
        }

        double p = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            p += calificaciones[i];
        }

        double promedio = p / calificaciones.length;
        System.out.println("El promedio es: " + promedio);

        int mayor = 0;
        int menor = 0;

        for (int i = 0; i < calificaciones.length; i++) {
            if (calificaciones[i] > promedio) {
                mayor++;
            } else if (calificaciones[i] < promedio) {
                menor++;
            }
        }

        System.out.println(mayor + " alumnos tienen califcacion por encima al promedio general");
        System.out.println(menor + " alumnos tienen calificacion por debajo el promedio general");


    }
}