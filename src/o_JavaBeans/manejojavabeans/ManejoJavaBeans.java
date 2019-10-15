package o_JavaBeans.manejojavabeans;

import o_JavaBeans.beans.PersonaBean;

public class ManejoJavaBeans {

    public static void main(String[] args) {
        PersonaBean bean = new PersonaBean ();
        bean.setNombre ("Fabian");
        bean.setEdad (29);

        System.out.println ("Nombre = " + bean.getNombre ());
        System.out.println ("Edad = " + bean.getEdad ());
    }


}
