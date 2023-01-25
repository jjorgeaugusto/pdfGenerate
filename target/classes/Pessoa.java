package com.example.pdf.test.one;

public class Pessoa {

    private String nome;
    private String dataNasc;
    private char sexo;


    public Pessoa(String nome, String dataNasc, char sexo) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
