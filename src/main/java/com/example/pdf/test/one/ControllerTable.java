package com.example.pdf.test.one;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;

import java.util.List;

public class ControllerTable {


    private static void padraoCabecalho(PdfPCell celula){
        celula.setBackgroundColor(BaseColor.YELLOW);
        celula.setHorizontalAlignment(Element.ALIGN_CENTER);
    }

    private final static List<String> listaCabecalho = List.of("IMAGEM", "PRODUTO", "VALOR","DISPONIVEL");


    public static PdfPTable criarCabecalho() {
        PdfPTable table = new PdfPTable(new float[]{10f, 10f, 5f, 7f});
        for(String celula : listaCabecalho) {
            PdfPCell novaCelula = new PdfPCell(new Phrase(celula));
            padraoCabecalho(novaCelula);
            table.addCell(novaCelula);
        }
        return table;
    }

    public static void preencherDados(Document document, PdfPTable table, List<Produto> produtos) throws DocumentException {
        if(document.isOpen()){
            for(Produto produto : produtos) {
                PdfPCell celula1 = new PdfPCell(new Phrase(produto.getNome()));
                celula1.setHorizontalAlignment(Element.ALIGN_CENTER);

                PdfPCell celula2 = new PdfPCell(new Phrase(produto.getValor()));
                celula2.setHorizontalAlignment(Element.ALIGN_CENTER);

                PdfPCell celula3 = new PdfPCell(new Phrase(produto.estaDisponivel()));
                celula3.setHorizontalAlignment(Element.ALIGN_CENTER);

                table.addCell(produto.renderizarImagem());
                table.addCell(celula1);
                table.addCell(celula2);
                table.addCell(celula3);
            }
            document.add(table);
        }


    }


}
