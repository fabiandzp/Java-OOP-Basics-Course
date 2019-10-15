package g_ModificadoresDeAcceso.paquete2;

import g_ModificadoresDeAcceso.paquete1.Clase1; //Importamos un paquete

public class Clase3 extends Clase1 {

    public Clase3(){
        //Constructor protegido, al ser una subclase puede acceder
        //aunque este en otro paquete
        super(1, 2);

        //Acceso a package, y al estar fuera de paquete esta restringido
        //super(1,2,3)

        //Acceso privado restringido
        //super(1,2,3,4)
    }

    public void pruebaDesdeClase3(){
        //Acceso a Ckase 1 desde Clase 3
        //Clase 3 extiende de CLase 1
        Clase1 c1 = new Clase1 ();
        System.out.println ("" );
        System.out.println ("Atributo publico = " + c1.artPublico + "o heredado: "+ artProtegido);
        System.out.println ("Atributo protejido (heredado): = " + c1.artPublico);
        System.out.println ("Atributo default: no se puede acceder a un paquete externo");
        System.out.println ("Atributo private: acceso denegado" );

        //Constructor publico
        new Clase1 ();
        //Los demas constructores no se pueden probar asi, sino desde el constructor de la clase
        //Ya que esta es una subclase

        System.out.println ("" );
        System.out.println ("Metodo publico: " + c1.metodoPublico ());
        System.out.println ("Metodo protegido (heredado): " + metodoProtegido ());
        System.out.println ("Metodo defauld: No se puede acceder desde un paquete externo" );
        System.out.println ("Metodo private: Acceso denegado");
    }
}
