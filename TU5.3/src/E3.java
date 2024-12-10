import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class E3 {
    public static void main(String[] args) {

        Scanner ju = new Scanner(System.in);

        // 3. Positivos

        int a[] = {-8,-6,-3,2,8,10,-7};

        imprimirPositivos(a);

    }

    public static void imprimirPositivos(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                System.out.println("Numeros Positivos: " + a[i]);
            }
        }
    }
}