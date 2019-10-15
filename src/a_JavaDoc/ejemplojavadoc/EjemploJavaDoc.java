/*
 * Derechos Fabian S.A.
 *
 */
package a_JavaDoc.ejemplojavadoc;
import a_JavaDoc.com.gm.javadoc.Aritmetica;

/**
 * Clase para probar el concepto de JavaDoc
 * @author Fabian Zabala
 * @version 1.0
 */
public class EjemploJavaDoc {
    /**
     * Metodo que ejecuta la prueba de clase Aritmetica
     * @param args argumentos de la linea de comandos
     */

    public static void main(String[] args){
        Aritmetica aritmetica = new Aritmetica();
        int resultado = aritmetica.sumar(3, 2);
        System.out.println("resultado: " + resultado);
    }
}
