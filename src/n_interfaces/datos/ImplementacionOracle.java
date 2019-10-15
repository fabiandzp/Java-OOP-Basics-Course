package n_interfaces.datos;

public class ImplementacionOracle implements AccesoDatos{ //Se implementa la interface Acceso Datos

    @Override
    public void insertar(){
        System.out.println ("Insertar desde Oracle" );
    }

    @Override
    public void listar(){
        System.out.println ("Listar desde Oracle" );
    }



}
