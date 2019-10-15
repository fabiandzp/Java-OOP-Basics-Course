package f_AutoboxingUnboxing;

public class AutoboxingUnboxing {
    public static void main(String[] args){
        //Autoboxing (Se convierten de tipos primitivos a tipos Object)
        Integer enteroObj = 10;
        Float floatObj = 15.2F;
        Double doubleObj = 40.1;

        System.out.println ("Autoboxing");
        System.out.println ("Entero Obj = " + enteroObj.intValue ()); //recuperamos el valor que tiene, tambien podemos hacer conversion a otro tipo object
        System.out.println ("Flotante Obj = " + floatObj.floatValue ()); //recuperamos el valor que tiene
        System.out.println ("Doble Obj = " + doubleObj.doubleValue ()); //recuperamos el valor que tiene

        //Unboxing (Se convierten de tipo Object a tipos Primitivos)
        int entero = enteroObj;
        float flotante = floatObj;
        double doble = doubleObj;
        System.out.println ("\nUnboxing" );
        System.out.println ("Entero = " + entero);
        System.out.println ("Flotante = " + flotante);
        System.out.println ("Double = " + doble);

    }
}
