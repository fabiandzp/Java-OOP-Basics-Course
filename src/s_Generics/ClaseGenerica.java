package s_Generics;

//Definimos la clase generica con el operador diamante < >

public class ClaseGenerica<T> {
    //Definimos una variable de tipo generico
    T objeto;


    //Contructor que inicializa el tipo a utilizar
    public ClaseGenerica(T objeto){
        this.objeto = objeto;
    }

    //Metodo para obtener el tipo definido en esta clase generica
    public void obtenerTipo(){
        System.out.println ("El tipo T es :" + objeto.getClass ().getName ());//Obtenemos el nombre de la clase del tipo que definimos
        //Con el api de reflection que nos permite haer preguntas de manera dinamica a nuestros objetos

    }


}
