package y_ManejoArchivos.utileria;

import java.io.*;

public class Archivos {

    public static void crearArchivo(String nombreArchivo){ //Recibe una cadena como parametro nombreArchivo
        File archivo = new File (nombreArchivo); //Creamo objeto de tipo FIle usando cadena nombreArchivo
        try{
            //Objeto FileWiriter se inicializa con el objeto tipo file archivo
            //PrintWriter, el objeto FileWriter lo pasamos como parametro
            PrintWriter salida = new PrintWriter (new FileWriter(archivo));
            salida.close (); //Cerramos el flujo
            System.out.println ("El arcvhivo se ha creado correctamente\n" );
        }
        catch (IOException ex){
            ex.printStackTrace ();
        }
    }

    public static void escribirArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter (new FileWriter (archivo));
            String contenido = "Contenido a escribir en el archivo";
            salida.println (contenido);
            salida.println ();
            salida.println ("Fin de la escritura");
            salida.close ();
            System.out.println ("Se ha escrito correctamente al en el archivo\n" );
        }
        catch (IOException ex){
            ex.printStackTrace ();
        }
    }

    public static void leerArchivo(String nombreArchivo){
        File archivo = new File (nombreArchivo); //Inicializa el contructor de la clase
        try{

            BufferedReader entrada = new BufferedReader (new FileReader (archivo));
            String lectura;
            lectura = entrada.readLine ();
            while (lectura != null){
                System.out.println ("Lectura: " + lectura);
                lectura = entrada.readLine (); //Si el metodo readline llega al final del archivo lectura es null
            }
            entrada.close ();

        }
        catch (IOException ex){
            ex.printStackTrace ();
        }
    }

    public static void anexarArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);

        try{
            //True le indica a la clase fileWriter que respete lo que ya tienen almacendo y que adicione lo que vienen
            PrintWriter salida = new PrintWriter (new FileWriter (archivo, true));
            String contenido = "Anexando informacion al archivo";
            salida.println (contenido);
            salida.println ();
            salida.println ("Fin de anexar");
            salida.close ();
            System.out.println ("Se ha anexado la informacion correctamente" );
        }catch (IOException ex){
            ex.printStackTrace ();
        }




    }

}
