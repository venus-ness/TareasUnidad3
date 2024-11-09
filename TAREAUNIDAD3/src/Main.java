import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        /*
        1. CALCULAR EL PROMEDIO DE UNA SERIE DE NUMEROS
         */


        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>(); // Con esto creamos una lista de varios numeros

        System.out.println("¿De cuantas materias desea calcular promedio?: ");
        int cant = sc.nextInt(); // Primero necestiamos especificar el tamaño de la lista que iteraremos.

        System.out.println("Ingrese las calificaciones para sacar el promedio: ");
        for (int i = 0; i < cant; i++) {
            numeros.add(sc.nextInt()); // Aqui estamos agregando todos los numeros ingresados a la lista -numeros-
        }

        int suma = 0;
        for (int numero : numeros) { // Esto es un for-each "por cada numero (numero) en el arrayList numeros
            suma += numero; // Sumamos el valor de la derecha al valor de la izquierda y el resultado se almacena en la variable de la izquierda
        }

        double promedio = suma / numeros.size(); // dividimos entre el tamaño de la lista que especificamos anteriormente.
        System.out.println("El promedio es: " + promedio);

        if (promedio > 7) {
            System.out.println("Aprobado.");
        } else {
            System.out.println("Reprobado.");
        }



        /*
        2. CONTAR PARES E IMPARES
         */

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> conteo = new ArrayList<Integer>(); // creamos la variable donde guardaremos la lista de numeros

        System.out.println("¿Cuantos numeros desea ingresar?: ");
        int num = input.nextInt(); // Le pedimos que nos especifique cuantos numeros ingresara para que la lista se prepare

        System.out.println("Ingrese los numeros de forma aleatoria porfavor: ");
        for (int i = 0; i < num; i++) {
            conteo.add(input.nextInt()); // Agregamos los numeros a la lista del conteo
        }

        int pares = 0; // Aqui guardaremos los numeros pares
        int impares = 0; // Aqui los impares
        for (int numero : conteo) { // Por cada numero de la lista conteo
            if (numero % 2 == 0) { // Si son divisibles entre dos (o sea par)
                pares++; // se agregara a nuestro contador de numeros pares
            } else {
                impares++; // sino se agregaara en el del conteo de numeros impares
            }
        }

        System.out.println("Hay " + pares + " numeros de pares.");
        System.out.println("Hay " + impares + " numeros de impares.");

        /*
        3. SERIE FIBONACCI HASTA N
         */


        Scanner fibo = new Scanner(System.in);
        System.out.println("Introduce cuandos terminos de la serie Fibonacci: ");
        int c = fibo.nextInt();

        if (c <= 0) {
            System.out.println("Por favor ingrese un numero mayor que 0");
        } else {
            int a = 1, b = 1;

            int cont = 1;

            System.out.println("Serie Fibonacci: ");
            while (cont <= c) {
                System.out.println(a + " ");
                int siguiente = a + b;
                a = b;
                b = siguiente;
                cont++;
            }
            System.out.println();
        }

        /*
        4. NUMEROS PRIMOS
         */

        Scanner primos =  new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int number = primos.nextInt();

        boolean esPrimo = true; // Con esto determinamos si es primo

        if (number <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) { // no necesitamos verificar mas alla de la raiz cuadrada del numero
                if (number % i == 0) { // si hay divisior establecemos esPrimo como falso
                    esPrimo = false;
                    break; //salimos del ciclo
                }
            }
        }

        if (esPrimo) {
            System.out.println("El numero " + number + " es primo.");
        } else {
            System.out.println("El numero " + number + " no es primo.");
        }

        /*
        5. MUESTRA LOS DIVISORES DE UN NUMERO
         */

        Scanner divs = new Scanner(System.in);
        System.out.println("Introduce un numero del cual desee obtener sus divisores: ");
        int nu = divs.nextInt();

        boolean primo = true;
        if (nu <= 1) {
            primo = false;
            System.out.println("Este numero no cuenta con divisores aparte de 1 y el mismo.");
        } else {
            for (int i = 2; i <= Math.sqrt(nu); i++) {
                if (nu % i == 0) {
                    primo = false; // Si encontramos un divisor lo marcamos como no primo
                    System.out.println("Divisores de " + nu + ":");
                    for (int j = 1; j <= nu; j++) {
                        if (nu % j == 0) {
                            System.out.println(j); // Con este ciclo for recorremos desde 1 hasta el num ingresado
                        } // E imprimimos sus divisores
                    }
                }
                break;
            }
        }


        /*
        6. VERIFICA SI UN NUMERO ES PALINDROMO
         */

        Scanner pal = new Scanner(System.in);

        System.out.println("Ingresa un numero: ");
        int numPal = pal.nextInt();

        String numeroStr = Integer.toString(numPal); // Convertimos a string para poder iterar
        int incioContador = 0; //con este empezamos para recorrer el String desde un extremo
        int finContador = numeroStr.length() - 1; // y con este recorremos desde el otro extremo
        boolean esPalindromo = true;

        while (incioContador < finContador && esPalindromo) {
            if (numeroStr.charAt(incioContador) != numeroStr.charAt(finContador)) {
                esPalindromo = false; // si encontramos dos caracteres que no coinciden, establecemos como false para salir de ciclo
                System.out.println("El numero no es palindromo.");
            } else {
                incioContador++;
                finContador--;
            }
        }

        if (esPalindromo) {
            System.out.println("La numero es palindromo.");
        }

        /*
        7. ADIVINA EL NUMERO
         */

        Scanner adiv = new Scanner(System.in);
        Random rand = new Random();


        int numeroAl = rand.nextInt(100) + 1; // Generamos un numero entre 1 y 100
        boolean adivinoNumero = false;

        while (!adivinoNumero) {
            System.out.println("Adivina el numero: ");
            int numeroUsuario = adiv.nextInt();

            if (numeroUsuario == numeroAl) {
                System.out.println("Felicidades");

                adivinoNumero = true;
            } else {
                if (numeroUsuario > numeroAl) {
                    System.out.println("El numero que tienes que adivinar es menor.");
                } else {
                    System.out.println("El numero que tienes que adivinar es mayor.");
                }
            }
        }

        /*
        8. TABLAS DE MULTIPLICAR PERSONALIZADAS
         */

        Scanner in = new Scanner(System.in);

        System.out.println("Ingresa el numero del que desea su tabla de multiplicar: ");
        int numeroDeseado = in.nextInt();

        System.out.println("Ingrese hasta donde desea el rango: ");
        int rango = in.nextInt();

        int cont = 1;

        while (cont <= rango) {
            String texto = numeroDeseado + " * " + cont;
            int multiplicacion = numeroDeseado * cont;

            System.out.println(texto + " = " + multiplicacion);

            cont++;
        }

        /*
        9. ORDENAR TRES NUMEROS
         */

        Scanner orden = new Scanner(System.in);
        ArrayList<Integer> listaOrden = new ArrayList<Integer>(3);

        System.out.println("Ingrese tres numeros diferentes: ");
        for (int i = 0; i < 3; i++) {
            listaOrden.add(orden.nextInt());
        }

        int a = listaOrden.get(0);
        int b = listaOrden.get(1);
        int e = listaOrden.get(2);
        int temp; // Esta variable es para poder intercambiar los valores

        if (a > b) { // comparamos y si se cumple la condicion se intercambia el valor
            temp = a;
            a = b;
            b = temp;
        }

        if (a > e) {
            temp = a;
            a = e;
            e = temp;
        }

        if (b > e) {
            temp = b;
            b = e;
            e = temp;
        }

        System.out.println("Numeros ordenados de menor a mayor: " + a + ", " + b + ", " + e);


    }
}