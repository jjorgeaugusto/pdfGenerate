package com.example.pdf.test.one;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Image;

import java.io.File;
import java.io.IOException;

public class Produto {

    private String nome;
    private String valor;
    private char disponivel;

    private File imagem;

    public Produto() {

    }
    public Produto(String nome, String valor, char disponivel, File imagem) {
        this.nome = nome;
        this.valor = valor;
        this.disponivel = disponivel;
        this.imagem = imagem;
    }

    public Image renderizarImagem(){
        Image img = null;
        try {
            img = Image.getInstance(this.imagem.toURI().toURL());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (BadElementException e) {
            throw new RuntimeException(e);
        }
        return img;
    }

    public File getImagem() {
        return imagem;
    }

    public void setImagem(File imagem){
        this.imagem = imagem;
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

    public void setValor(String valor) {
        this.valor = valor;
    }

    public char getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(char disponivel) {
        this.disponivel = disponivel;
    }
}
