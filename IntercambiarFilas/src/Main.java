import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner va = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Ingrese un numero de filas: ");
        int filas = va.nextInt();
        System.out.println("Ingrese un numero de columnas: ");
        int columnas = va.nextInt();

        int[][] m = new int[filas][columnas];

        System.out.println("---Matriz Principal---");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = r.nextInt(100);
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("¿Que filas desea intercambiar?: ");
        System.out.println("Primera fila: ");
        int fUno = va.nextInt();
        System.out.println("Segunda fila: ");
        int fDos = va.nextInt();

        int[] t = new int[fUno];
        m[fUno] = m[fDos];
        m[fDos] = t;

        System.out.println("---Matriz Intercambiada---");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

    }
}