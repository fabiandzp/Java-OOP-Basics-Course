package g_ModificadoresDeAcceso;

import g_ModificadoresDeAcceso.paquete1.Clase2;
import g_ModificadoresDeAcceso.paquete2.Clase3;
import g_ModificadoresDeAcceso.paquete2.Clase4;


public class ModificadoresAcceso {

    public static void main(String[] args){
        //Prueba de accesis a Clase 1 desde otras clases
        //Acceso a clase 1 desde clase 2
        System.out.println ("***Acceso desde Clase 2 a Clase 1 (mismo paquete) ***" );
        new Clase2 ().pruebaDesdeLaClase2 ();

        //Acceso a Clase 1 desde Clase3
        // Clase 3 extiende desde Clase 1
        System.out.println ("\n***Acceso desde Clase 3 a Clase 1 (diferente paquete, pero es subclase)***" );
        new Clase3 ().pruebaDesdeClase3 ();


        //Acceso a Clase 1 desde Clase 4
        //Clase4 NO es subclase y esta en otro paquete
        System.out.println ("\n***Acceso desde Clase 4 a Clase 1 (difetente paquete, NO es subclase)***" );
        new Clase4 ().pruebaDesdeClase4 ();

    }
}
