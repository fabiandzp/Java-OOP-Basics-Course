package e_ForEach;

public class ForEach {
    public static void main(String[] args) {
        //Creanis un arreglo de Personas
        Persona[] personas = {new Persona ("Fabian"), new Persona ("Matias")};

        //Iteramos cada elemento del arreglo de personas
        for (Persona p : personas){
            //Accedemos a las propiedades y/o metodos del objeto
            String nombre = p.getNombre ();
            System.out.println ("Nombre Empleado: " + nombre);
        }

        System.out.println ("");
        // Creamos un arreglo de enteros
        int[] edades = {15, 20, 41, 50};
        //Iteramos el arreglo
        for (int edad : edades)
            System.out.println ("Edad: " + edad);
    }

}
