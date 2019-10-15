package q_Exceptions2.datos;

import q_Exceptions2.exepciones.AccesoDatosEx;

public interface AccesoDatos {

    public abstract void insertar() throws AccesoDatosEx;

    public abstract void listar() throws AccesoDatosEx;

    public abstract void simularError(boolean simularError);
}
