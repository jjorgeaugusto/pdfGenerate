package com.example.pdf.test.one.Produto;

import java.io.File;
import java.math.BigDecimal;

public record DadosCadastrosProduto(String nome, BigDecimal valor, Disponivel disponivel, File imagem) {
}
