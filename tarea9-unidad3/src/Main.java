import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena de longitud par: ");
        String s = sc.nextLine().toLowerCase();

        if (s.length() % 2 != 0) {
            System.out.println("La longitud de la cadena debe ser par.");
            return;
        }


        int mitad = s.length() / 2;
        String a = s.substring(0, mitad);
        String b = s.substring(mitad);

        int contadorVocalesA = 0;
        int contadorVocalesB = 0;
        int indiceA = 0;
        int indiceB = 0;
        String vocales = "aeiouAEIOU";

        // Contamos las vocales en la primera mitad
        while (indiceA < a.length()) {
            if (vocales.indexOf(a.charAt(indiceA)) != -1) {
                contadorVocalesA++;
            }
            indiceA++;
        }

        // Contamos las vocales en la segunda mitad
        while (indiceB < b.length()) {
            if (vocales.indexOf(b.charAt(indiceB)) != -1) {
                contadorVocalesB++;
            }
            indiceB++;
        }

        if (contadorVocalesA == contadorVocalesB) {
            System.out.println("Verdadero. Subcatenas contienen la misma cantidad de vocales");
        } else {
            System.out.println("Falso. Subcadenas no contienen la misma cantidad de vocales");
        }






    }
}
