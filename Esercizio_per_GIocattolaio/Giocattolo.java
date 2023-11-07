package Esercizio_per_GIocattolaio;

public class Giocattolo {
    int id;
    String nome;
    double prezzo;
    int età_consigliata;

    public Giocattolo(int id, String nome, double prezzo, int età_consigliata){
        this.id=id;
        this.nome=nome;
        this.prezzo=prezzo;
        this.età_consigliata=età_consigliata;
    }

    @Override
    public String toString(){
        return "Nome Giocattolo "+nome+" "+ "Prezzo: "+prezzo+" "+"Età_consigliata: "+età_consigliata;
    }
}
