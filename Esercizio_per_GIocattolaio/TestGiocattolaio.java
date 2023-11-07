package Esercizio_per_GIocattolaio;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * TestGiocattolaio
 */
 

public class TestGiocattolaio {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        ArrayList <Vendita> v=new ArrayList<>();
        ArrayList <Giocattolo> g=new ArrayList<>();
        ArrayList <Cliente> c=new ArrayList<>();

       /*g.add(new Giocattolo(0, "Camion", 17.90, 4));
        g.add(new Giocattolo(1, "Macchinetta", 11.90, 8));

        c.add(new Cliente(0, "Luca", "luca@email.it"));
        c.add(new Cliente(1, "Banana", "banana@email.it"));

        v.add(new Vendita(g.get(0), c.get(1))); //parametri per cercare le vendite

        System.out.println(v.toString());

        */ 

        c.add(new Cliente());
        Inventario i= new Inventario();
        Admin a=new Admin();

        System.out.println("Sei già registrato?");
        String risp=sc.nextLine();

        if (risp.equalsIgnoreCase("si")) {
            System.out.println("Inserisci nome utente: ");
            String nome_utente=sc.nextLine();
            System.out.println("Inserisci password:");
            String password=sc.nextLine();

            if(nome_utente.equalsIgnoreCase(a.getUsername()) && password.equals(a.getPassword())){
                System.out.println("---------------------ADMIN-------------------");
                System.out.println("Premi 1 per aggiungere un prodotto all'inventario->");
                System.out.println("Premi 2 per eliminare un prodotto dall'inventario->");
                int scelta=sc.nextInt();

                //in base alla scelta, scelgo cosa fare, aggiungere un giocattolo, rimuoverlo o uscire senza effettuare nessun aggiornamneto 

                switch (scelta) {
                    case 1:
                        i.aggiungi_gioco();
                        i.visulizza_inventario();
                        break;
                    
                    case 2:
                        i.rimuovi_giocattolo();
                        i.visulizza_inventario();
                    break;
                }
            }else{
                System.out.println("------------------UTENTE----------------");
                i.visulizza_inventario();
            }
        }else{
            if (risp.equalsIgnoreCase("no")) {
                Scanner s= new Scanner(System.in);
                System.out.println("Inserisci id:");
                int id=s.nextInt();
                System.out.println("Inserisci nome: ");
                String nome=s.nextLine();
                System.out.println("Insersci email: ");
                String email=s.nextLine();
                System.out.println("Inserisci username: ");
                String username=s.nextLine();
                System.out.println("Inserisci password: ");
                String password= s.nextLine();

                c.add(new Cliente(id, nome, email, username, password));
            }
        }

    }
}