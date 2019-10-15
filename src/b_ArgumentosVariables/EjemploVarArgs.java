package b_ArgumentosVariables;

public class EjemploVarArgs {
    public static void main(String[] args) {
        //Imprimimos varios numeros
        imprimirNumeros(15,20,3,61,75,18,10);

        System.out.println ("" );
        imprimirNumerosForEach(15,20,3,61,75,18,10);

        System.out.println ("" );
        variosParametros("Juan", true, 15,20,14);
    }


    //Imprimir numeros enviando un solo argumento como arreglo FOR NORMAL
    public static void imprimirNumeros(int... nuemeros){
        int elemento;
        for(int i=0; i < nuemeros.length; i++){
            elemento = nuemeros[i];
            System.out.println ("Elemento " + i + ": " + elemento);
        }
    }


    //Imprimir numeros enviando un solo argumento como arreglo ForEach
    public static void imprimirNumerosForEach(int... numeros){
        for(int numero : numeros){ //se declara el ForEach
            System.out.println ("El numero es: " + numero);
        }
    }

    //for eahc con enviando varios elementos
    public static void variosParametros(String nombre, boolean valido, int... numeros){
        System.out.println ("nombre = " + nombre);
        System.out.println ("valido = " + valido);
        for(int nuemero : numeros) {
            System.out.println ("numeros = " + nuemero);
        }
    }
}

