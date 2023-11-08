package Esercizio_per_GIocattolaio;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventario { 
    Scanner sc= new Scanner(System.in);
    ArrayList<Giocattolo> giochi= new ArrayList<>();

    public void aggiungi_gioco(){
        System.out.println("--Hai scelto di aggiumgere un giocattolo all'interno del tuo inventario--");
        System.out.println("Inserisci l'id del gioco:");
        int id=sc.nextInt();
        //aggiungo un utilizzo del nextLine in quanto lo scanner dopo un utilizzo per interi si bagga
        sc.nextLine();
        System.out.println("Inserisci il nome del gioco: ");
        String nome=sc.nextLine();
        System.out.println("Inserisci il prezzo del gioco:");
        double prezzo=sc.nextDouble();
        System.out.println("Inserisci l'età consigliata: ");
        int età_consigliata=sc.nextInt();
        giochi.add(new Giocattolo(id, nome, prezzo, età_consigliata));
    }

    //rimuovere un giocattolo in base all'id
    public void rimuovi_giocattolo(){

        System.out.println("Inserisci l'identificativo del gioco da rimuovere: ");
        int IdDaRimuovere=sc.nextInt();

        for (int i = 0; i < giochi.size(); i++) {
            Giocattolo giocattolo = giochi.get(i);
            if (giocattolo.id == IdDaRimuovere) {
                giochi.remove(i);
                break; //Eseguo un break in modo che dopo che abbiamo trovato il gioco con l'id da rimuovere non continui il ciclo
            }
        }
    }

    //visualizza inventario
    public void visulizza_inventario(){
        for (int i = 0; i < giochi.size(); i++) {
            System.out.println("-------------Prodotto-----------");
            System.out.println("ID:"+giochi.get(i).id);
            System.out.println("Nome:"+giochi.get(i).nome);
            System.out.println("Prezzo:"+giochi.get(i).prezzo);
            System.out.println("Eta consigliata:"+giochi.get(i).età_consigliata);

        }
    }

    public void acquista_giocattolo(int acquisto){

        for (int i = 0; i < giochi.size(); i++) {
            Giocattolo giocattolo = giochi.get(i);
            if (giocattolo.id == acquisto) {
                giochi.remove(i);
                break; //Eseguo un break in modo che dopo che abbiamo trovato il gioco con l'id da rimuovere non continui il ciclo
            }
        }
    }

}
