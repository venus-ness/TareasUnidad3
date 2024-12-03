import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner va = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Ingrese de cuanto quiere la matriz cuadrada: ");
        int n = va.nextInt();

        int[][] m = new int[n][n];
        int dP = 0;
        int dS = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = r.nextInt(100);
                System.out.print(m[i][j] + " ");

                if (i == j) {
                    dP += m[i][j];
                }

                if (j == m[i].length - i - 1) {
                    dS += m[i][j];
                }

            }
            System.out.println();
        }

        System.out.println("La suma de la Diagonal Principal es: " + dP);
        System.out.println("La suma de la Diagonal Secundaria es: " + dS);

    }
}