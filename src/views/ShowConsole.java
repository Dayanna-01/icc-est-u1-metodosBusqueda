package views;

import java.util.Scanner;

public class ShowConsole {
    
    private Scanner scanner;

    public ShowConsole() {
        scanner = new Scanner(System.in);
    }

    // Método para obtener un código numérico
    public int getCode() {
        System.out.print("Ingrese el código: ");
        return scanner.nextInt();
    }

    // Método para obtener un nombre
    public String getName() {
        System.out.print("Ingrese el nombre: ");
        return scanner.nextLine();  // Cambiado a nextLine() para capturar la cadena completa
    }

    // Método para mostrar un mensaje
    public void showMessage(String message) {
        System.out.println(message);
    }
}
