package r_coleciones;

import java.util.*; //Clases del api de colections

public class ManejoColecciones {

    public static void main(String[] args) {

        //miLista es varable de tipo List es una interface
        List miLista = new ArrayList (); // Creamos nuevo objeto de tipo array list
        miLista.add ("1"); //por defect la lista es de tipo Objetc porque no se especifico el tipo de dato
        miLista.add ("2");
        miLista.add ("3");
        miLista.add ("4");
        //Listas permiten elementos repetidos
        miLista.add ("4");
        imprimir(miLista);


        Set miSet = new HashSet ();
        miSet.add ("100");
        miSet.add ("200");
        miSet.add ("300");
        //Los Set no permiten elementos repetidos, los ignora
        miSet.add ("300");
        imprimir(miSet);

        Map miMapa = new HashMap ();
        //llave valor
        miMapa.put ("1", "Juan");
        miMapa.put ("2", "Carlos");
        miMapa.put ("3", "Rosario");
        miMapa.put ("4", "Esperanza");
        //Se imprime todas las llaves
        imprimir(miMapa.keySet ()); // me devuelve una colecion de tipo set de las llaves del mapa
        imprimir(miMapa.values ()); // Imprime todos los valores del mapa
    }


    private static void imprimir(Collection collection){
        for (Object elemnto : collection){
            System.out.print (elemnto + " " );
        }
        System.out.println ("" );
    }


}
