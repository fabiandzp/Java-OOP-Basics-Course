package a_JavaDoc.com.gm.javadoc;

/**
 * Esta clase permite realizar operaciones de Aritmetica como sumar, restar, etc.
 *
 * @author Fabian Zabala
 * @version 1.0
 */
public class Aritmetica {

    /**
     * Primer Operando
     */
    int operandoA;
    /**
     * Segundo Operando
     */
    int operandoB;

    /**
     * Constructor vacio de la clase
     */
    public Aritmetica(){
    }

    /**
     * Este metodo realiza la suma de dos operandos enteros
     * @return int es el resultado de la suma.
     */
    public int sumar(int a, int b){
        this.operandoA = a;
        this.operandoB = b;
        return operandoA + operandoB;
    }
}
