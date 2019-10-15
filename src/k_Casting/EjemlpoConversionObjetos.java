package k_Casting;

public class EjemlpoConversionObjetos {

    public static void main(String[] args) {

        //1. Creamos un tipo de mas alta jerarquia
        Empleado empleado;
        //Asignamos referencia a un Objeto de menor jerarquia
        //Esto es UPCASTING, no hay necesidad de una notacion especia
        empleado = new Escritor("Roy", 15000, TipoEscritura.CLASICO);

        //Sin embargo si quisieramos acceder al detalle de la calse Escritor
        //No es posible, ya que esas caracteristicas no estan en comun
        //entre todas las clases de la jerarquia de clases
        //empleado.getTipoDeEscrituraEnTexto();

        //Imprimimos los detalles en un metodo generico
        imprimirDetalles(empleado);

        //2. Podemos hacer lo mismo con la calse gerente
        //Esto es upcasting, por lo que no requiere una sintaxis especial
        empleado = new Gerente ("Laura", 18000, "Sistemas");


        //Pero si queremos acceder durecti oir ka variable empleado
        //al detalle del objeto Gerente no es posible, se pierde el acceso
        //empleado.getDepartamento();
        imprimirDetalles(empleado);
    }


    //Metodo generico para imprimir los detalles de la jerarquia Empleado
    private static void imprimirDetalles(Empleado empleado){

        String resultado = null;

        //Imprimir detalles es generico para todos ya que es polimorfismo
        //No se necesita de nunguan conversion
        System.out.println ("\nDetalle: " + empleado.obtenerDetalles ());

        //Pero los detalles de cada clase debemos hacer un downcasting
        if(empleado instanceof Escritor){
            //Convertimos el objeto al tipo inferior deseado
            //Convierte objeto - Downcasting
            Escritor escritor = (Escritor) empleado;
            //Finalmente podemos acceder a los metodos de la lcase Escritor
            resultado = ((Escritor) empleado).tipoEscritura.getDescripcion ();

            System.out.println ("resultado tipoEscritura" + resultado);
        } else if (empleado instanceof Gerente){
            //Hacemos al downcasting en la mism linea de codigo
            //Ahorrando una variable
            resultado = ((Gerente) empleado).getDepartamento ();

            System.out.println ("Resultado departamento: " + resultado);
        }
    }


}
