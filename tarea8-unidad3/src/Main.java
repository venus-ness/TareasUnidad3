import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        /*
        1. NUMEROS DEL 1 AL 10
         */


        int nu = 1;

        while (nu <= 10) {
            System.out.println(nu);
            nu++;
        }


        /*
        2. SUMA DE LOS PRIMEROS 10 NUMEROS NATURALES
         */


        int suma = 0; // Variable para almacenar la suma
        int numero = 1; // Variable de control que empieza en 1

        while (numero <= 10) {
            suma += numero; // suma el valor actual de numero a suma
            numero++; // Incrementa la variable de control
        }

        System.out.println("La suma de los primeros 10 numeros naturales es: " + suma);


        /*
        3. CONTAR DIGITOS DE UN NUMERO
         */


        System.out.println("Ingrese un numero entero");
        int numeroEntero = sc.nextInt();

        int contador = 0;

        while (numeroEntero != 0) {
            numeroEntero = numeroEntero / 10;
            contador++;
        }

        System.out.println("El numero tiene " + contador + " digitos.");



        /*
        4. IMPRIMIR NUMEROS PARES ENTRE 1 Y 20
         */


        int numeroUno = 1;

        int numeroDos = 20;

        int contadorUno = numeroUno;

        while (contadorUno <= numeroDos) {
            if (contadorUno % 2 == 0) {
                System.out.println(contadorUno);
            }
            contadorUno++;
        }



        /*
        5. SUMAR DIGITOS DE UN NUMERO
         */


        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();

        int sumaAlmacen = 0;

        while (num != 0) {
            int digito = num % 10; // Obtenemos el ultimo digito del numero ingresado
            sumaAlmacen += digito; // Sumamos el digito a la suma total
            num = num / 10; // Elimina el ultimo digito
        }

        System.out.println("La suma de los digitos es: " + sumaAlmacen);

        /*
        6. MULTIPLOS DE UN NUMERO HASTA CIERTO LIMITE
         */


        System.out.println("Ingrese el numero base");
        int nBase = sc.nextInt();

        System.out.println("Ingrese el numero limite: ");
        int limite = sc.nextInt();

        int multiplo = nBase; // Empezamos con el primer multiplo que es el propio numero base n

        while (multiplo <= limite) {
            System.out.println(multiplo);
            multiplo += nBase; // Avanza al siguiente multiplo
        }



        /*
        7. IMPRIMIR LOS NUMEROS EN ORDEN INVERSO
         */


        System.out.println("Ingrese un numero: ");
        int n = sc.nextInt();

        while (n >= 1) {
            System.out.println(n);
            n--;
        }


        /*
        8. SUMAR SOLO LOS NUMEROS IMPRARES DE UN NUMERO DADO
         */

        System.out.println("Ingrese un numero: ");
        int number = sc.nextInt();

        int sumaImpares = 0;

        while (number != 0) {
            int digitoImpar = number % 10; //Esto obtendra el ultimo digito
            if (digitoImpar % 2 != 0) { // Esto verificara el el digito es impar
                sumaImpares += digitoImpar;
            }

            number = number / 10; // Esto eliminara el ultimo digito
        }

        System.out.println("La suma de los digitos es: " + sumaImpares + "\n");


        /*
        9. CONTAR LAS VOCALES DE UNA CADENA
         */

        System.out.println("Ingrese una palabra: ");
        String palabra = sc.nextLine().toLowerCase(); // Convertimos a minusculas para simplificar

        int contadorVocales = 0;

        Pattern patron = Pattern.compile("[aeiou]"); // Creamos un patron que busca cualqueir vocal
        Matcher matcher = patron.matcher(palabra);

        while (matcher.find()) { // Con esto encontramos las coincidencias del patron
            contadorVocales++;
        }

        System.out.println("La cadena contiene " + contadorVocales + " vocales");



        /*
        10. DETERMINAR SI UN NUMERO ES PERFECTO
         */

        System.out.println("Ingrese un numero entero: ");
        int numb = sc.nextInt();

        int sumaDivisores = 0;
        int divisor = 1;

        while (divisor <= numb / 2) { // Solo necesitamos comprobar hasta la mitad del numero
            if (numb % divisor == 0) {
                sumaDivisores += divisor;
            }
            divisor++;
        }

        if (sumaDivisores == numb) {
            System.out.println("El numero " + numb + " es un numero prefecto.");
        } else {
            System.out.println("El numero " + numb + " no es un numero prefecto.");
        }



    }
}