package h_Overriding_Sobreescritura;

public class Gerente extends Empleado{

    private String departamento;

    public Gerente(String nombre, double sueldo, String departamento){
        //clase super debe ser siempre la primera linea en el constructor de la clase hija
        super(nombre, sueldo); //usamos constructor de la clase padre
        this.departamento = departamento;
    }


    //Sobrescribimos el metodo padre heredado
    public String obtenerDetalles(){
        //Observar como accedemos directamente al atributo detalles
        //debido a que se declaro como protected en la calse padre
        //y por tanto la clase ha lo hereda y accede directamente
        return "Nombre: " + nombre + " Sueldo: " + sueldo + " Departamento: " + departamento;
    }

    public String getDepartamento(){
        return departamento;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

}
