package k_Casting;

public class Empleado {
    protected String nombre;
    protected double sueldo;

    protected Empleado(String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    protected String obtenerDetalles(){
        return "Nombre: " + nombre +
                " Sueldo: " + sueldo;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }

    public double getSueldo(){
        return sueldo;
    }

}
