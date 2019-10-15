package q_Exceptions2.manejoexepciones2;

import q_Exceptions2.datos.*;
import q_Exceptions2.exepciones.*;

public class ManejoExepciones2 {
    public static void main(String[] args){
        AccesoDatos datos = new ImplementacionMySql ();
        //Cambiamos el estado de la simulacion de error = true
        datos.simularError (true);
        ejecutar(datos, "listar");

        //Cambiamos el estado a simulacionError = false
        datos.simularError (false);
        System.out.println ("" );
        ejecutar(datos, "insertar");

    }

    public static void ejecutar(AccesoDatos datos, String accion){
        if ("listar".equals (accion)){
            try {
                datos.listar ();
            }
            catch (LecturaDatosEx ex){
                System.out.println ("Error lectura: Procesa la exepcion mas especifica de lectura de datos" );
            }
            catch (AccesoDatosEx ex){
                System.out.println ("Error Acceso datos: Procesa la exepcion mas generica de acceso a datos");
            }
            catch (Exception ex){
                System.out.println ("Error general");
            }
            finally {
                System.out.println ("Procesar finally opcional, siempre se ejecuta si hubo error o no." );
            }
        }else if ("insertar".equals (accion)){
            try{
                datos.insertar ();
            }
            catch (AccesoDatosEx ex){
                System.out.println ("Error acceso datos: Podemos procesar solo la exepcion mas generica" );
            }
            finally {
                System.out.println ("Procesar finally opcional, siempre se ejecuta si hubo error o no." );
            }
        }else
            System.out.println ("No se proporciono accion conocida." );
    }
}
