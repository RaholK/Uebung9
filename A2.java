package Uebung9;

import java.util.HashSet;
import java.util.LinkedList;

public class A2 {

    private static String commonAncestor(Object a, Object b) {
        // TODO: Übungsblatt 9, Aufgabe 2

        boolean test = false;
        if(a.getClass().toString() == b.getClass().toString()) {
            return a.getClass().toString();
        }
        else {
            test = false;
        }

        Class c = a.getClass().getSuperclass();
        Class d = b.getClass().getSuperclass();

        boolean test1 = false;
       /* while(!test1) {
            if(c.toString().equals(d.toString())) {
                return c.toString();
            }

        } */

        LinkedList<Class> lista = new LinkedList<Class>();
        LinkedList<Class> listb = new LinkedList<Class>();

        while(c.getSuperclass() != null) {
            lista.add(c.getSuperclass());
            c = c.getSuperclass();
            System.out.println("--");
        }

        while(d.getSuperclass() !=null) {
            listb.add(d.getSuperclass());
            d= d.getSuperclass();
        }

        for(Class elem : lista) {
            for(Class elem2 : listb) {
                if(elem.toString().equals(elem2.toString())) {
                    return elem.toString();
                }
            }
        }

       /* while(!test) {
            if(c.toString().equals(d.toString())) {
                return c.toString();

            }
            c = c.getSuperclass();
            if(c.toString().equals(d.toString())) {
                return c.toString();
            }
            d = d.getSuperclass();
            if(d.toString().equals(c.toString())) {
                return c.toString();
            }






        }*/



        return "";
    }

    public static void main(String[] args) {
        System.out.println(commonAncestor(new LinkedList<Integer>(), new HashSet<Integer>()));
    }
}
