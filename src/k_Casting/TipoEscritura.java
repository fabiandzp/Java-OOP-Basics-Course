package k_Casting;

public enum TipoEscritura {

    //Constantes
    CLASICO("Escritura a Mano"),
    MODERNO("Escritura digital");

    //Atributo constante
    private final String descripcion;

    //Constructor privado
    private TipoEscritura(String descripcion){
        this.descripcion = descripcion;
    }


    public String getDescripcion(){
        return descripcion;
    }

}
