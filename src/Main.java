import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Escribe tu nombre: ");
        Scanner consola = new Scanner(System.in);
        var usuario = consola.nextLine();
        System.out.println("usuario = " + usuario);

        System.out.println("Escribe tu Apellido");
        var apellido = consola.nextLine();
        System.out.println("Resultado: " + usuario + " " + apellido);
    }
}