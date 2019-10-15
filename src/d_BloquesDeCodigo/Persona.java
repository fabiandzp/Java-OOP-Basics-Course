package d_BloquesDeCodigo;

public class Persona {
    private final int idPersona;
    private static int contadorPersona;


    //Bloque de inicializacion estatico
    static {
        //Inicializacion idPersonas
        contadorPersona = 10;
        //aqui no se pueden usar variables no estaticas
        System.out.println ("Ejecuta bloque estatico");
    }

    //Bloque de codigo para inicializar atributos de la clase
    //El Bloque se copia en cada constructor de la clase
    {
        System.out.println ("Ejecuta Bloque Inicializador");
        idPersona = ++contadorPersona;
    }

    Persona() {
        System.out.println ("Ejecuta constructor");
    }

    public int getIdPersona(){
        return idPersona;
    }

}
