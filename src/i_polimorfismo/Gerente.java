package i_polimorfismo;

public class Gerente extends Empleado{
    private String departamento;

    public Gerente(String nombre, double salario, String departamento){
        super(nombre, salario);
        this.departamento = departamento;
    }


    //sobreescritura del metodo heredado
    public String obtenerDetalles(){
        //Observamos que para no repetir el codigo, podemos utilizar
        //el metodo del padre y solo agregar a este metodo la clase hija
        //esto es invocar un metodo sobreescrito
        return super.obtenerDetalles () + " Departamento: " + departamento;
    }

    public String getDepartamento(){
        return departamento;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }


}
