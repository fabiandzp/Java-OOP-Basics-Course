package k_Casting;

public class Gerente extends Empleado{

    private String departamento;

    public Gerente(String nombre, double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    //Sobreescribir el metodo padre heredado
    public String obtenerDetalles(){
        //Observamos que para no repetir codigo, podemos utilizar
        //el metodo del padre y solo agregar a este merodo la clase hija
        //esto es invocar un metodo sobreescrito
        return super.obtenerDetalles () + " Departamento: " +departamento;
    }

    public String getDepartamento(){
        return departamento;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
}
