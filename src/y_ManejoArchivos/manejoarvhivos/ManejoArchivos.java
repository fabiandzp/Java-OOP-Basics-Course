package y_ManejoArchivos.manejoarvhivos;

import static y_ManejoArchivos.utileria.Archivos.*;//importa todos los metodos static

public class ManejoArchivos {

    //Nora: Ya debe estar creada la carpeta sobre la que se va a trabajar
    //En caso de ser necesario se deben asignar permisos a la carpetta
    private static final String NOMBRE_ARCHIVO = "C:\\Dev-Projects\\java-fundamentals\\ProgramacionJava\\files\\pruebaJava.txt";


    public static void main(String[] args) {

        //Crear archivo
        crearArchivo(NOMBRE_ARCHIVO);

        //Escribir archivo
        escribirArchivo (NOMBRE_ARCHIVO);

        //Leer archivo
        leerArchivo (NOMBRE_ARCHIVO);

        //Anexar Arvhivo
        anexarArchivo (NOMBRE_ARCHIVO);

        //Leer archivo
        leerArchivo (NOMBRE_ARCHIVO);
    }


}


