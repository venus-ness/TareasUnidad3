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
        int n = va.nextInt();
        System.out.println("Ingrese un numero de columnas: ");
        int m = va.nextInt();

        int[][] a = new int[n][m];

        System.out.println("---Matriz Principal---");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = r.nextInt(100);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("---Matriz Transpuesta---");
        for (int i = 0; i < a[0].length; i++) { // Para columnas
            for (int j = 0; j < a.length; j++) { // Para filas
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }


    }
}