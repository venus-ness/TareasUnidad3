import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        int o[] = new int[10];
        Random r = new Random();

        for (int i = 0; i < o.length; i++) {
            o[i] = r.nextInt(50) * 2; // Generara numeros random entre 0 y 98 (o sea, solo pares)
        }

        for (int f = 0; f < o.length; f++) {
            System.out.println(o[f] + " ");
        }

        // Aqui estoy creando una copia del arreglo para poder invertirlo
        int inverso[] = new int[o.length];
        for (int i = 0; i < o.length; i++) {
            inverso[i] = o[i];
        }

        for (int i = 0; i < o.length / 2; i++) {
            int temp = inverso[i];
            inverso[i] = inverso[o.length - i - 1];
            inverso[o.length - i - 1] = temp;
        }

        System.out.println("Arreglo invertido: ");
        for (int i = 0; i < inverso.length; i++) {
            System.out.print(inverso[i] + " ");
        }

    }
}