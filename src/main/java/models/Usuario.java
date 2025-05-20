package models;

import jakarta.persistence.*;


@Entity
@Table(name = "usuario")
public class Usuario {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String email;
    private String senha;

    public Usuario(int id, String email, String nome, String senha) {
        this.id = id;
        this.email = email;
        this.nome = nome;
        this.senha = senha;
    }

    public  Usuario (){}
}
