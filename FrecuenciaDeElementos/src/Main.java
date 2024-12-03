import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del arreglo que desea: ");
        int n = sc.nextInt();
        int elementos[] = new int[n];

        System.out.println("Ingrese " + n + " de elementos enteros para llenar el arreglo: ");
        for (int i = 0; i < n; i++) {
            elementos[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int frecuencia = 0;
            for (int j = 0; j < n; j++) { // En este bucle contamos cuantas veces aparece el elemento en el arreglo
                if (elementos[i] == elementos[j]) {
                    frecuencia++;
                }
            }

            boolean duplicado = false; // Con esto verificaremos que no se haya contado antes
            for (int v = 0; v < i; v++) {
                if (elementos[v] == elementos[i]) { // Si ya se ha contado, no se contara de nuevo
                    duplicado = true;
                    break;
                }
            }
            if (!duplicado) {
                System.out.println("El numero " + elementos[i] + " aparece " + frecuencia + " cantidad de veces.");
            }
        }
    }
}