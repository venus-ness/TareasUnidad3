import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class E1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // 1. CONVERTIR CELCIUS A FAHRENHEIT

        System.out.println("Ingrese grados celsius a convertir: ");
        int c = in.nextInt();

        double conv = aFahrenheit(c);
        System.out.println(c + " a Fahrenheit es: " + conv);
    }

    private static double aFahrenheit(int c) {
    double f = (c * 9/5) + 32;
    return f;
    }
}