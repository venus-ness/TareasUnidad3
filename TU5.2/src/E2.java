import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class E2 {
    public static void main(String[] args) {

        Scanner va = new Scanner(System.in);

        // 2. Media de un arreglo

        System.out.println("Ingrese el tamaño que desea del arreglo: ");
        int t = va.nextInt();

        int a[] = new int [t];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Ingrese el valor del arreglo: ");
            a[i] = va.nextInt();
        }

        int m = calcM(a);
        System.out.println("La media del arreglo es: " + m);

    }

    public static int calcM (int arr[]) {
        int s = 0;
        int arreglo = arr.length;

        for (int i = 0; i < arreglo; i++) {
            s += arr[i];
        }

        int media = s / arreglo;
        return media;
    }

}