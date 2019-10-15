package g_ModificadoresDeAcceso.paquete1;

public class Clase1 {

    //Atributos
    public int artPublico = 5;
    protected int artProtegido = 6;
    int artPaquete = 7;
    private int artPrivado = 8;

    //Constructores
    public Clase1(){
    }

    //Constructor publico 1
    public Clase1(int i){
        System.out.println ("Constructor publico 1");
    }

    //Constructor protected 2
    protected Clase1(int i, int j){
        System.out.println ("Constructor protected 2");
    }

    //Constructor package 3
    Clase1(int i, int j, int k){
        System.out.println ("Constructor package 3");
    }

    //Constructor privado 4
    private Clase1(int i, int j, int k, int l){
        System.out.println ("Constructor privado 4");
    }


    //definicion de metodos
    public int metodoPublico(){
        return 9;
    }

    protected int metodoProtegido(){
        return 10;
    }

    int metodoPaquete(){
        return 11;
    }

    private int metodoPrivado(){
        return 12;
    }




}

