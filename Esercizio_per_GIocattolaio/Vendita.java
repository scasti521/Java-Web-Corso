package Esercizio_per_GIocattolaio;

public class Vendita {
    Giocattolo giocattolo;
    Cliente cliente;

    public Vendita(Giocattolo giocattolo, Cliente cliente){
        this.giocattolo=giocattolo;
        this.cliente=cliente;
    }


    @Override
    public String toString() {
        return giocattolo.toString()+" "+cliente.toString();
    }
    
}
