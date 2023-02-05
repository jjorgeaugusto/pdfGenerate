package com.example.pdf.test.one.Produto;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Image;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;

public class Produto {

    private String nome;
    private BigDecimal valor;
    private Disponivel disponivel;

    private File imagem;

    public Produto() {

    }
    public Produto(String nome, BigDecimal valor, Disponivel disponivel, File imagem) {
        this.nome = nome;
        this.valor = valor;
        this.disponivel = disponivel;
        this.imagem = imagem;
    }


//    public String estaDisponivel(){
//        if(this.disponivel == 'SIM'){
//            return "Sim";
//        } else {
//            return "Não";
//        }
//    }


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

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

//    public char getDisponivel() {
//        return disponivel;
//    }

//    public void setDisponivel(char disponivel) {
//        this.disponivel = disponivel;
//    }
}
