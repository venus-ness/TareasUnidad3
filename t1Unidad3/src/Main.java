//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        // Nombre del cliente

        String nombreCliente = "Carlos Martinez";
        System.out.println("Nombre del cliente: " + nombreCliente);

        int espacio = nombreCliente.indexOf(" ");
        String nombre = nombreCliente.substring(0, espacio);
        String apellido = nombreCliente.substring(espacio + 1);

        // Intercambiamos primer y ultimo caracter

        String primerLetraNombre = String.valueOf(nombre.charAt(0));
        String primerLetraApellido = String.valueOf(apellido.charAt(0));

        nombre = nombre.replace(primerLetraNombre, primerLetraApellido);
        apellido = apellido.replace(primerLetraApellido, primerLetraNombre);

        // Convertimos vocalez a numeros

        nombre = nombre.replace("a", "1").replace("e", "2").replace("i", "3").replace("o", "4").replace("u", "5");
        apellido = apellido.replace("a", "1").replace("e", "2").replace("i", "3").replace("o", "4").replace("u", "5");

        // System.out.println("Nombre del cliente cifrado: " + nombre + " " + apellido);

        // Direccion IP

        String ip = "192.168.0.1";
        System.out.println("Direccion IP: " + ip);

        // Dividimos por partes
        String[] parts = ip.split("\\.");

        StringBuilder hexIP = new StringBuilder();
        for (int i = 0; i < parts.length; i++) {
            int decimal = Integer.parseInt(parts[i]);
            String hex = Integer.toHexString(decimal);
            if (hex.length() == 1) {
                hex = "0" + hex;
            }
            hexIP.append(hex);
            if (i < parts.length - 1) {
                hexIP.append(".");
            }
        }

        // System.out.println("Direccion IP en Hexadecimal: " + hexIP.toString());

        // Numero de cliente

        String numeroCliente = "1234";
        System.out.println("Numero de Cliente: " + numeroCliente);

        // Convertimo el string a un valor Integer y aplicamos formula
        int numCifrado = (Integer.valueOf(numeroCliente) * 3 + 15)/(2);

        // System.out.println("Numero de Cifrado: " + numCifrado);

        System.out.println("Datos cifrados: " + nombre + " " + apellido + " | " + hexIP.toString() + " | " + numCifrado);


    }
}