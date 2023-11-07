package Esercizio_per_GIocattolaio;

public class Cliente {
    int id;
    private String nome;
    private String email;

    public Cliente(int id, String nome, String email){
        this.id=id;
        this.nome=nome;
        this.email=email;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome cliente: "+getNome()+" "+"Email: "+getEmail();
    }
}
