package u_PropiedadesDelSistema;

import java.util.*;

public class PropiedadesSistema {

    public static void main(String[] args) {

        Properties propiedades = System.getProperties ();


        Enumeration nombrePropiedades = propiedades.propertyNames (); // Obtener cada una de las propiedades
        //Regresa un enumeracion

        while (nombrePropiedades.hasMoreElements ()){
            String nombrePropiedad = (String) nombrePropiedades.nextElement ();
            String valorPropiedad = propiedades.getProperty (nombrePropiedad);

            System.out.println ("Llave:" + nombrePropiedad + " = " + valorPropiedad);
        }


    }

}
