package com.example.pdf.test.one;

public class Pessoa {

    private String nome;
    private String valor;
    private char disponivel;

    public Pessoa() {

    }
    public Pessoa(String nome, String valor, char disponivel) {
        this.nome = nome;
        this.valor = valor;
        this.disponivel = disponivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValor() {
        return valor;
    }

    public void setValort(String valor) {
        this.valor = valor;
    }

    public char getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(char disponivel) {
        this.disponivel = disponivel;
    }
}
