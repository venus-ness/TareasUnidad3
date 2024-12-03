import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        Scanner va = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Ingrese un numero de filas: ");
        int filas = va.nextInt();
        System.out.println("Ingrese un numero de columnas: ");
        int columnas = va.nextInt();

        int[][] m = new int[filas][columnas];

        int sF = 0;
        int sC = 0;

        System.out.println("Matriz principal.");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = r.nextInt(100);
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                sF += m[i][j];
            }
            System.out.println("La suma de la fila " + i + " es " + sF);
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[j].length; j++) {
                sC += m[i][j];
            }
            System.out.println("La suma de la columna " + i + " es " + sC);
        }


    }
}