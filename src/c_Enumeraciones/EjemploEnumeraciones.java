package c_Enumeraciones;

public class EjemploEnumeraciones {
    public static void main(String[] args) {
        //Valores de la enumeracion
        System.out.println ("Valor1 : " + Dias.LUNES);

        //llamar metodo indicarDia
        indicarDia(Dias.VIERNES);

        //Utilizamos las enumeraciones de paises
        System.out.println ("Continente no. 4 : " + Continentes.AMERICA);
        System.out.println ("Paises en America: " + Continentes.AMERICA.getPaises ());

        //Hacemos el test del numero de paises por continentte
        System.out.println ("");
        indicarPaises(Continentes.AFRICA);

        //Imprimimos los continentes
        System.out.println ("");
        imprmirContinentes();
    }


    public static void indicarDia(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println ("Primer dia de la Semana");
                break;
            case MARTES:
                System.out.println ("Segundo dia de la Semana");
                break;
            case MIERCOLES:
                System.out.println ("Tercer dia de la Semana");
                break;
            case JUEVES:
                System.out.println ("Cuerto dia de la Semana");
                break;
            case VIERNES:
                System.out.println ("Quinto dia de la Semana");
                break;
            default:
                System.out.println ("Es fin de semana");
        }
    }

    public static void indicarPaises(Continentes continentes){
        switch (continentes){
            //podemos user algun valor constante
            //de la enumeracion directamente
            case AFRICA:
                System.out.println ("No de Paises en :" + continentes + ": " + continentes.getPaises ());
                break;
            case EUROPA:
                System.out.println ("No de Paises en :" + continentes + ": " + continentes.getPaises ());
                break;
            case ASIA:
                System.out.println ("No de Paises en :" + continentes + ": " + continentes.getPaises ());
                break;
            case AMERICA:
                System.out.println ("No de Paises en :" + continentes + ": " + continentes.getPaises ());
                break;
            case OCEANIA:
                System.out.println ("No de Paises en :" + continentes + ": " + continentes.getPaises ());
                break;
            default:
                System.out.println ("Continente no existe" );
        }
    }

    public static void imprmirContinentes(){
        //ustilizamos el ForEach
        for (Continentes c : Continentes.values ()) {
            System.out.println ("Continente: " + c  + " contiene: " + c.getPaises () + " paises.");
        }
        System.out.println ( );
    }
}
