package k_Casting;

public class Escritor extends Empleado{

    //Utilizamos enumeracion para las opciones de tipo de escritura
    final TipoEscritura tipoEscritura;

    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura){
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }

    public String obtenerDetalles(){
        //Observamos que para no repetir codigo, podemos utilizar
        //el metodo del padre y solo agregar a este merodo la clase hija
        //esto es invocar un metodo sobreescrito
        return super.obtenerDetalles () + " TipoEscritura: " + tipoEscritura.getDescripcion ();
    }

    public TipoEscritura getTipoEscritura(){
        return tipoEscritura;
    }

    public String getTipoDeEscrituraEnTexto(){
        return tipoEscritura.getDescripcion ();
    }

}
