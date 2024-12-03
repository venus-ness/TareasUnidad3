import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese una cadena de texto: ");
        String txt = in.nextLine();

        char[] a = txt.toCharArray();
        String o = "";
        String r = "";

        for (int i = 0; i < a.length; i++) {
            o = String.valueOf(a[i]);
        }

        for (int i = txt.length() - 1; i >= 0; i--) {
            r = String.valueOf(a[i]);
        }

        if (o.equals(r)) {
            System.out.println("La cadena ingresada es palindroma");
        } else {
            System.out.println("La cadena ingresada no es palindroma");
        }

    }
}