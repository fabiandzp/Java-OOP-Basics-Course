package s_Generics;

public class ManejoGenericos {

    public static void main(String[] args) {
        //Creamos una instancia de la Clase Generica para Integer
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica<Integer> (15);
        objetoInt.obtenerTipo ();

        //Creamos una instancia de una ClaseGenerica para String
        //Se puede utilizar la inferencia del tipo del lado derecho
        ClaseGenerica<String> objetoStr = new ClaseGenerica<> ("Prueba");
        objetoStr.obtenerTipo ();

        //Los genericos no pueden ser aplicados a tipos primitivos
        //Por lo que esto marcaria un error de compilacion
        //ClaseGenerica<int> intPrimitivo = new ClaseGenerica<int> (88);


    }
}
