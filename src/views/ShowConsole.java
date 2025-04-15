package views;

import java.util.Scanner;

public class ShowConsole {
    private Scanner scanner = new Scanner(System.in);

    public int getCode() {
        System.out.print("Ingrese el código de la persona: ");
        return scanner.nextInt();
    }

    public void showMessage(String mensaje) {
        System.out.println(mensaje);
    }

    public void showMenu() {
        System.out.println("Método Búsqueda");
    }
}
