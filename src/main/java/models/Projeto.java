package models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "projeto")

public class Projeto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String descricao;
    private LocalDate dataInicio;
    private  LocalDate dataorevistaFIm;

    public Projeto(int id, String nome,
                   String descricao, LocalDate dataInicio,
                   LocalDate dataorevistaFIm) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataorevistaFIm = dataorevistaFIm;
    }
}
