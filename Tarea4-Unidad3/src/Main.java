import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        //NUMERO DIVISIBLE ENTRE 3, 5 O AMBOS
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa un numero: ");
        int numeroUno = input.nextInt();

        if (numeroUno % 3 == 0 && numeroUno % 5 == 0) {
            System.out.println("El numero es divisible entre 3 y 5" + "\n");
        } else if (numeroUno % 3 == 0) {
            System.out.println("El numero es divisible entre 3" + "\n");
        } else if (numeroUno % 5 == 0) {
            System.out.println("El numero es divisible entre 5" + "\n");
        } else {
            System.out.println("El numero no es divisible entre ninguno" + "\n");
        }


        //LADOS DE UN TRIANGULO
        System.out.println("Ingresa el primer lado del traingulo: ");
        int ladoUno = input.nextInt();
        System.out.println("Ingresa el segundo lado del traingulo: ");
        int ladoDos = input.nextInt();
        System.out.println("Ingresa el tercer lado del traingulo: ");
        int ladoTres = input.nextInt();

        boolean isoceles = ((ladoUno == ladoDos || ladoUno == ladoTres || ladoDos == ladoTres) && (ladoUno != ladoTres || ladoDos != ladoTres));
        boolean equilatero = (ladoUno == ladoDos || ladoUno == ladoTres || ladoDos == ladoTres);

        if (isoceles) {
            System.out.println("El triangulo es isoceles" + "\n");
        } else if (equilatero) {
            System.out.println("El triangulo es equilatero" + "\n");
        } else {
            System.out.println("El triangulo es escaleno" + "\n");
        }

        //SALARIO DE UN CLIENTE
        System.out.println("Ingresa tu salario: " + "\n");
        int salario = input.nextInt();

        if (salario <= 10000) {
            System.out.println("No pagas impuestos");
        } else if (salario >= 10001 && salario <= 20000) {
            double inpuestoUno = salario * 0.10;
            System.out.println("Pagaras impuesto del 10%, es decir :" + "$" + inpuestoUno + "\n");
        } else if (salario >= 20000) {
            double inpuestoDos = salario * 0.20;
            System.out.println("Pagaras impuesto del 20%, es decir: " + "$" + inpuestoDos + "\n");
        }

        //PAR O IMPAR
        System.out.println("Ingresa otro numero: ");
        int numero2 = input.nextInt();

        if (numero2 % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");


        }
    }
}