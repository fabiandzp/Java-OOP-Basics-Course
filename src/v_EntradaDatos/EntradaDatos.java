package v_EntradaDatos;

import java.io.*;

public class EntradaDatos {

    public static void main(String[] args) {
        String captura;
        InputStreamReader input = new InputStreamReader (System.in);
        BufferedReader bInput = new BufferedReader(input); //Para leer lineas completas no oslo caracter a caracter
        try{
            System.out.print ("Introduce dato: " );
            captura = bInput.readLine ();
            while (captura != null){
                System.out.print ("Dato Introducido: " + captura);
                captura = bInput.readLine ();
            }
        }catch (IOException e){
            e.printStackTrace ();
        }
    }
}
