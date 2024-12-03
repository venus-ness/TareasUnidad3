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

        int[][] a = new int[filas][columnas];

        int f = 0;
        int c = 0;
        int nM = 0;

        System.out.println("---Matriz Principal---");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = r.nextInt(100);
                System.out.print(a[i][j] + " ");

                if (a[i][j] > nM) {
                    nM = a[i][j];
                    f = i + 1;
                    c = j + 1;
                }
            }
            System.out.println();
        }

        System.out.println("El mayor numero del arreglo es: " + nM + " y esta en la fila " + f + " columna " + c);
        


    }
}