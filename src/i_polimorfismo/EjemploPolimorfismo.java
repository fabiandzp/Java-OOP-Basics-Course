package i_polimorfismo;

public class EjemploPolimorfismo {
    public static void main(String[] args) {

        Empleado emp = new Empleado ("Juan", 1500);
        imprimirDetalles(emp);

        Gerente ger = new Gerente ("Karla", 2600, "Finanzas");
        imprimirDetalles(ger);
    }

    public static void imprimirDetalles(Empleado emp){
        System.out.println (emp.obtenerDetalles ());
    }
}



































//Obeservamos que el tipo que recibe el metodo es de tipo padre
//Sin embargo al momento de ejecutar el metodo, se ejecuta el hijo (Gerente)
//eso es el polimorfismo, multiples formas pero en tiempo de ejecucion