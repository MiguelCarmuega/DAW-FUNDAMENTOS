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




    /* Para comparar palabras se hace con xxxx1.equals(xxxxx2) ,
    si queremos que ignore las diferencias por mayúsculas usamos
    xxxx1.equalsIgnoreCase(xxxx2)
    Cifrar con código ASCII y recorriendo una frase, ver en la clase y
    en apuntes profesor
    RECOLECTOR DE BASURA(garbage collector): recolectar todas las variables o elementos que no se usen
    y tengan un valor de null
    */

    String nombre = "Miguel";

    nombre = null; //Candidata a ser capturada por la garbage collector

    System.gc(); //fuerza la recolleción de elementos en null


    }
}

