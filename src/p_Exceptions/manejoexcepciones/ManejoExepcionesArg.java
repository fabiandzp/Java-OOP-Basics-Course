package p_Exceptions.manejoexcepciones;

import p_Exceptions.domain.*;

public class ManejoExepcionesArg {

    public static void main(String[] args) throws OperationException{
        try {
            int op1 = Integer.parseInt (args[0]);
            int op2 = Integer.parseInt (args[1]);
            Division div = new Division (op1, op2);
            div.visualizarOperacion ();
        }catch (ArrayIndexOutOfBoundsException aie){
            System.out.println ("Ocurrio una excepcion: " );
            System.out.println ("Hubo un error al acceder un elemento fuera de rango" );
            aie.printStackTrace ();
        }catch (NumberFormatException nfe){
            System.out.println ("Ocurrio una excepcion: " );
            System.out.println ("Uno de los argumentos no es entero " );
            nfe.printStackTrace ();
        }catch (OperationException oe){
            System.out.println ("Ocurrio una excepcion: " );
            System.out.println ("Se trato de realizar una operacion erronea" );
            oe.printStackTrace ();
        }finally {
            System.out.println ("Se terminaron de revisar las excepciones" );
        }
    }

}
