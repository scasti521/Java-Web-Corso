package Esercizio_per_GIocattolaio;

import java.util.ArrayList;

/**
 * TestGiocattolaio
 */


public class TestGiocattolaio {
    public static void main(String[] args) {

        ArrayList <Vendita> v=new ArrayList<>();
        ArrayList <Giocattolo> g=new ArrayList<>();
        ArrayList <Cliente> c=new ArrayList<>();

        g.add(new Giocattolo(0, "Camion", 17.90, 4));
        g.add(new Giocattolo(1, "Macchinetta", 11.90, 8));

        c.add(new Cliente(0, "Luca", "luca@email.it"));
        c.add(new Cliente(1, "Banana", "banana@email.it"));

        v.add(new Vendita(g.get(0), c.get(1)));

        System.out.println(v.toString());
    }
}