import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Scanner in = new Scanner(System.in);
        int a[] = new int[15];

        System.out.println("Ingrese 15 numeros enteros: ");
        for (int i = 0; i < 15; i++) {
            a[i] = in.nextInt();
        }

        int mayor = 0;
        int menor = 0;
        int pMayor = 0;
        int pMenor = 0;
        for (int i = 0; i < 15; i++) {
            if (mayor < a[i]) {
                mayor = a[i];
                pMayor = i;
            } if (menor > a[i]) {
                menor = a[i];
                pMenor = i;
            }
        }

        System.out.println("El numero mayor es: " + mayor + " en la posicion: " + (pMayor+1));
        System.out.println("El numero menor es: " + menor + " en la posicion: " + (pMenor+1));



    }
}