//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        /*
        Condicionales:
        Expresion logica que puede ser verdadera o falsa.
        Permite que un programa tome decisiones y ejecute diferentyes bloques
        codigo segun el resultado de evaluacion

        > Mayor que
        >= Mayor o igual que
        < Menor que
        <= Menor o igual que
        == Igualdad
        != Diferencia/Diferencia
        && (AND) Concatena condiciones y verifica
        que ambas sean verdaderas (si hay un solo falso = falso)
        || (OR) (si hay un solo verdadero = verdadero)

        10 > 20 = false
        10 < 20 = true
        10 >= 20 = false
        10 <= 20 = true
        10 == 20 = falso
        10 == 10 = true
        10 != 20 = true
        10 != 10 = false


        */

        /*
        int edad = 10;

        boolean esMenorEdad = edad < 18; (tambien puede ser un booleano)

        if (edad >= 18) {
           System.out.println("Eres legal");
       }
        else {
          System.out.println("No eres legal");
       }

        // pueden existir variables aqui

        boolean condicion = 18 != 20 && 86 > 20 && 10 == 10;

        if (codicion == true) {
            //System.out.println("Condicion correcta");
       }
        else {
            //System.out.println("Condicion incorrecta");
       }

        /*

        5 == 5 || 3 > 4

        !(7 < 3) && 4 <= 4

        10 != 15 && 8 > 4

        (12 + 3) * 2 == 30 || 20 / 2 > 8

        6 <= 6 && (9 != 3 || 5 == 5)

        !(8 > 9) && (3 < 2 || 10 == 10)

        (5 * 2 == 10 && 7 > 2) || (4 <= 4 && 9 != 9)

        !(15 <= 10) && (6 != 3 || 8 == 8) && 20 > 5

        (10 > 5 && 2 < 3) || !(7 == 7) && (4 > 3 || 9 <= 9)

        !(12 == 11) && ((10 / 2 == 5 && 3 != 2) || 15 > 5 && 6 <= 10)

         */

        if (5 == 5 || 3 > 4) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

        boolean ejercicioDos = !(7 < 3) && 4 <= 4;
        if (ejercicioDos) {
            System.out.println("Correcto");
        }
        else {
            System.out.println("Incorrecto");
        }

        boolean ejercicioTres = 10 != 15 && 8 > 4;
        if (ejercicioTres) {
            System.out.println("Correcto");
        }
        else {
            System.out.println("Incorrecto");
        }


        boolean ejercicioCuatro = (12 + 3) * 2 == 30 || 20 / 2 > 8;
        if (ejercicioCuatro) {
            System.out.println("Correcto");
        }
        else {
            System.out.println("Incorrecto");
        }

        boolean ejercicioCinco = 6 <= 6 && (9 != 3 || 5 == 5);
        if (ejercicioCinco) {
            System.out.println("Correcto");
        }
        else {
            System.out.println("Incorrecto");
        }

        boolean ejercicioSeis = !(8 > 9) && (3 < 2 || 10 == 10);
        if (ejercicioSeis) {
            System.out.println("Correcto");
        }
        else {
            System.out.println("Incorrecto");
        }

        boolean ejercicioOcho = (5 * 2 == 10 && 7 > 2) || (4 <= 4 && 9 != 9);
        if (ejercicioOcho) {
            System.out.println("Correcto");
        }
        else {
            System.out.println("Incorrecto");
        }

        boolean ejercicoNueve = !(15 <= 10) && (6 != 3 || 8 == 8) && 20 > 5;
        if (ejercicoNueve) {
            System.out.println("Correcto");
        }
        else {
            System.out.println("Incorrecto");
        }

        boolean ejercicioDiez = (10 > 5 && 2 < 3) || !(7 == 7) && (4 > 3 || 9 <= 9);
        if (ejercicioDiez) {
            System.out.println("Correcto");
        }
        else {
            System.out.println("Incorrecto");
        }

        boolean ejercicioOnce = !(12 == 11) && ((10 / 2 == 5 && 3 != 2) || 15 > 5 && 6 <= 10);
        if (ejercicioOnce) {
            System.out.println("Correcto");
        }
        else {
            System.out.println("Incorrecto");
        }


        /*
        Ciclos:
        (o Bucle) es una estructura que permite repetir un
        bloque de código varias veces hasta que se cumpla una condición
        especifica. Utiles para automatizar tareas repetitivas. Los tipos
        mas comunes son: "for", "while", y "do-while"


         */


    }
}
