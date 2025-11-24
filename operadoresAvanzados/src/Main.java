//import nombrePaquete.NombreClase
//import controller.GestorUsuarios
//import controller.GestorUsuarios
//import controller.* (toda la carpeta controller)

import controller.GestorDocumentos;
import controller.GestorUsuarios;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando la clase");
        GestorUsuarios gestorUsuarios = new GestorUsuarios();
        gestorUsuarios.validarUsuarios("Miguel", 27, "miguelcarmu98@gmail.com");
        GestorDocumentos gestorDocumentos = new GestorDocumentos();
        gestorDocumentos.enviarDocumento("Hola", "miguelcarmu98@gmail.com");

    }
}
