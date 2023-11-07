package Esercizio_per_GIocattolaio;

import java.util.Scanner;

public class Cliente {
    int id;
    private String nome;
    private String email;
    private String username;
    private String password;

    public Cliente(){
        id=1;
        nome="Sergio";
        email="scastiglione521@gmail.com";
        username="scasti521";
        password="Sergio1234";
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

    public Cliente(int id, String nome, String email, String username, String password){
        this.id=id;        
        this.nome=nome;
        this.email=email;
        this.username=username;
        this.password=password;

    }
}
