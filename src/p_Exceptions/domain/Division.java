package p_Exceptions.domain;

public class Division {

    //attributo de la clase
    private int numerador;
    //atributo denominador
    private int denominador;

    public Division(int numerador, int denominador) throws OperationException{
        if (denominador == 0){
            //throw new IllegalArgumentException("Denominador igual a cero");
            throw new OperationException ("Denominador igual a cero");
        }
        this.numerador = numerador;
        this.denominador = denominador;

    }

    public void visualizarOperacion(){
        System.out.println ("El resultado de la division es = " + numerador / denominador);
    }

}
