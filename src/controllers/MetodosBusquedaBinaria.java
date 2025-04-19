package controllers;

import models.Persona;
import views.ShowConsole;
import java.util.Arrays;

public class MetodosBusquedaBinaria {
    private Persona[] people;
    private ShowConsole pantalla;

    public MetodosBusquedaBinaria(Persona[] personas) {
        this.pantalla = new ShowConsole();
        this.people = personas;

        // Ordenar el array por nombre alfabéticamente
        Arrays.sort(people, (p1, p2) -> p1.getName().compareToIgnoreCase(p2.getName()));

        pantalla.showMessage("Métodos de búsqueda binaria");
    }

    // Búsqueda binaria por código
    public int findPersonaByCode(int code) {
        int bajo = 0;
        int alto = people.length - 1;

        while (bajo <= alto) {
            int central = bajo + (alto - bajo) / 2;

            if (people[central].getCode() == code) {
                return central;
            }
            if (people[central].getCode() < code) {
                bajo = central + 1;
            } else {
                alto = central - 1;
            }
        }
        return -1;
    }

    // Mostrar persona por código
    public void showPersonByCode() {
        int codeToFind = pantalla.getCode();  // Obtén el código desde la consola
        int indexPerson = findPersonaByCode(codeToFind);

        if (indexPerson == -1) {
            pantalla.showMessage("No hay persona con ese código.");
        } else {
            pantalla.showMessage("Persona con código " + codeToFind + " encontrada.");
            pantalla.showMessage(people[indexPerson].toString());  // Muestra los detalles
        }
    }

    // Búsqueda binaria por nombre
    private int findPersonByName(String name) {
        int bajo = 0;
        int alto = people.length - 1;

        while (bajo <= alto) {
            int central = bajo + (alto - bajo) / 2;

            if (people[central].getName().equalsIgnoreCase(name)) {
                return central;
            }
            if (people[central].getName().compareToIgnoreCase(name) < 0) {
                bajo = central + 1;
            } else {
                alto = central - 1;
            }
        }
        return -1;
    }

    // Mostrar persona por nombre
    public void showPersonByName() {
        String nameToFind = pantalla.getName();  // Obtén el nombre desde la consola
        int indexPerson = findPersonByName(nameToFind);

        if (indexPerson == -1) {
            pantalla.showMessage("No hay persona con el nombre: " + nameToFind);
        } else {
            pantalla.showMessage("Persona con nombre " + nameToFind + " encontrada.");
            pantalla.showMessage(people[indexPerson].toString());  // Muestra los detalles
        }
    }
}
