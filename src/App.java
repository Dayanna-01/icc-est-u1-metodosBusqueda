import controllers.MetodosBusquedaBinaria;
import models.Persona;

public class App {
    public static void main(String[] args) {
        Persona[] personas = new Persona[7];
        personas[0] = new Persona(101, "Dayanna");
        personas[1] = new Persona(102, "Ismael");
        personas[2] = new Persona(103, "Janelly");
        personas[3] = new Persona(104, "Alejandro");
        personas[4] = new Persona(105, "Paola");
        personas[5] = new Persona(106, "Santiago");
        personas[6] = new Persona(107, "Patricia");

        /*MetodosBusqueda mB = new MetodosBusqueda(personas);
        mB.showPersonByCode();*/

        MetodosBusquedaBinaria MBB = new MetodosBusquedaBinaria(personas);
        MBB.showPersonByName(); // Si quieres buscar por nombre
        MBB.showPersonByCode(); // Si quieres buscar por código
    }
}

