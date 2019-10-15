package g_ModificadoresDeAcceso.paquete1;

public class Clase2 {
    public Clase2(){
        //Prueba constructores
        System.out.println ("");

        //Constructor publico
        new Clase1 (1);

        //Constructor protejido
        new Clase1 (1, 2);

        //Constructor default o package
        new Clase1 (1, 2, 3);

        //Constructor private
        //new Clase1 (1,2,3,4); //has a private access
        System.out.println ("Constructo private: Acceso privado");
    }

    public void pruebaDesdeLaClase2(){
        //Accesso a Clase 1 desde Clase2
        Clase1 c1 = new Clase1 ();
        System.out.println ("");
        System.out.println ("Atributo publico: " + c1.artPublico);
        System.out.println ("Atributo protegido: " + c1.artProtegido);
        System.out.println ("Atributo paquete: " + c1.artPaquete);
        System.out.println ("Atributo private: Acceso denegado");


        System.out.println ("");
        System.out.println ("Metodo publico: " + c1.metodoPublico() );
        System.out.println ("Metodo protegido: " + c1.metodoProtegido() );
        System.out.println ("metodo default:" + c1.metodoPaquete() );
        System.out.println ("Metodo Private: Acceso negado" );

    }
}
