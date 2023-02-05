package com.example.pdf.test.one.controller;

import com.example.pdf.test.one.Produto.DadosCadastrosProduto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("produtos")
public class ProdutoController {
    @PostMapping
    public void cadastrar(@RequestBody List<DadosCadastrosProduto> dados){
        System.out.println(dados);
    }

}
