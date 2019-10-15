package t_ColecionesGenericas;

import java.util.*;

public class ManejoColecionesGenericas {

    public static void main(String[] args) {
        List<String> miLista = new ArrayList<> ();
        miLista.add ("1");
        miLista.add ("2");
        miLista.add ("3");
        imprimir(miLista);

        Set<String> miSet = new HashSet<> ();
        miSet.add ("100");
        miSet.add ("200");
        miSet.add ("300");
        miSet.add ("300");
        imprimir(miSet);


        Map<String, String> miMapa = new HashMap<> ();
        miMapa.put ("1", "Fabian");
        miMapa.put ("2", "Dany");
        miMapa.put ("3", "Zabala");
        miMapa.put ("4", "Pardo");
        imprimir(miMapa.keySet ());
        imprimir(miMapa.values ());
    }

    static void imprimir(Collection<String> col){
        for(String elemnto : col){
            System.out.print (elemnto + " " );
        }
        System.out.println ();
    }

}
