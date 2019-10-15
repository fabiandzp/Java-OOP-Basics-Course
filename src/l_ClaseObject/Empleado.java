package l_ClaseObject;

public class Empleado {

    private String nombre;
    private double sueldo;

    Empleado(String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getSueldo(){
        return sueldo;
    }

    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }

    //Este metodo nos permite imprimir el estado actual de este objeto
    @Override
    public String toString(){
        return "Empleado { " + "Nombre: " + nombre + ", Sueldo: " + sueldo + '}';
    }

    //
    @Override
    public boolean equals(Object obj){ //Comparar el estado del objeto con un objeto que estemos recibiendo
        if(obj == null){//preguntar si es null
            return  false;
        }
        if (obj instanceof Empleado){// Preguntar si el arg que recibimos es de tipo Empledo

            //Hacmos conversion del objeto para poder obtener los atrubutos o metdos de la clase Empleado del objeto que recibimos
            Empleado emp = (Empleado) obj; // Se convierte obj a tipo Empleado y se asigna a variable tipo Empleado

            if(nombre.equals (emp.nombre) && Double.valueOf(sueldo).equals(emp.sueldo)){
                return false;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }

    @Override
    public int hashCode(){
        int hash = 7;
        hash = 31 * hash + this.nombre.hashCode ();
        hash = 31 * hash + Double.valueOf (this.sueldo).hashCode ();
        return hash;
    }
}
