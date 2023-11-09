package Esercizio_per_GIocattolaio;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * TestGiocattolaio
 */
 
public class TestGiocattolaio {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        ArrayList <Cliente> c=new ArrayList<>();

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

                System.out.println("Benvenuto nel nostro negozio di giocattoli, ecco il nostro inventario: ");
                i.visulizza_inventario();

                System.out.println("Vuoi acquistare un gioco?");
                String risposta=sc.nextLine();

                if (risposta.equalsIgnoreCase("si")) {
                    System.out.println("Inserisci l'id del gioco che vuoi acquistare: ");
                    int id_gioco=sc.nextInt();

                    for (int j = 0; j < i.giochi.size(); j++) {
                        Giocattolo giocattolo = i.giochi.get(j);
                        if (giocattolo.id == id_gioco) {
                            System.out.println("Hai acquistato il gioco: "+giocattolo.nome);
                            i.acquista_giocattolo(id_gioco);
                            break; //Eseguo un break in modo che dopo che abbiamo trovato il gioco con l'id da rimuovere non continui il ciclo
                        }
                    }

                }else{
                    System.out.println("Grazie per aver visitato il nostro negozio, arrivederci!");
                }
            }
        }else{
            //se utente non è registrato lo aggiungo
            if (risp.equalsIgnoreCase("no")) {
                Scanner s= new Scanner(System.in);
                System.out.println("Inserisci id:");
                int id=s.nextInt();
                s.nextLine();
                System.out.println("Inserisci nome: ");
                String nome=s.nextLine();
                System.out.println("Insersci email: ");
                String email=s.nextLine();
                System.out.println("Inserisci username: ");
                String username=s.nextLine();
                System.out.println("Inserisci password: ");
                String password= s.nextLine();

                c.add(new Cliente(id, nome, email, username, password));

                System.out.println("Ciao"+nome+" "+"Benvenuto nel nostro negozio di giocattoli, ecco il nostro inventario: ");
                i.visulizza_inventario();

                System.out.println("Vuoi acquistare un gioco?");
                String risposta=sc.nextLine();

                if (risposta.equalsIgnoreCase("si")) {
                    System.out.println("Inserisci l'id del gioco che vuoi acquistare: ");
                    int id_gioco=sc.nextInt();

                    for (int j = 0; j < i.giochi.size(); j++) {
                        Giocattolo giocattolo = i.giochi.get(j);
                        if (giocattolo.id == id_gioco) {
                            System.out.println("Hai acquistato il gioco: "+giocattolo.nome);
                            i.acquista_giocattolo(id_gioco);
                            break; //Eseguo un break in modo che dopo che abbiamo trovato il gioco con l'id da rimuovere non continui il ciclo
                        }
                    }

                }else{
                    System.out.println("Grazie per aver visitato il nostro negozio, arrivederci!");
                }
                s.close();
            }
        }
        sc.close();
    }
}