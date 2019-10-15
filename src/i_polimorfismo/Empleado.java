package i_polimorfismo;

public class Empleado {
    protected String nombre;
    protected double salario;

    protected Empleado(String nombre, double salario){
        this.nombre = nombre;
        this.salario = salario;
    }

    public String obtenerDetalles(){
        return "Nombre: " + nombre + " Salario: " + salario;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double Salario){
        this.salario = salario;
    }
}
