package com.example.pdf.test.one;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;

import java.io.IOException;
import java.util.List;

public class ControllerTable {



    public static PdfPTable criarCabecalho() {
        PdfPTable table = new PdfPTable(new float[]{10f, 10f, 5f, 5f});
        PdfPCell celulaImagem = new PdfPCell(new Phrase("Imagem"));

        PdfPCell celulaNome = new PdfPCell(new Phrase("Produto"));
        celulaNome.setBackgroundColor(BaseColor.YELLOW);
        celulaNome.setHorizontalAlignment(Element.ALIGN_CENTER);

        PdfPCell celulaDataNasc = new PdfPCell(new Phrase("Valor"));
        celulaDataNasc.setBackgroundColor(BaseColor.YELLOW);
        celulaDataNasc.setHorizontalAlignment(Element.ALIGN_CENTER);

        PdfPCell celulaSexo = new PdfPCell(new Phrase("Disponivel"));
        celulaSexo.setBackgroundColor(BaseColor.YELLOW);
        celulaSexo.setHorizontalAlignment(Element.ALIGN_CENTER);

        table.addCell(celulaImagem);
        table.addCell(celulaNome);
        table.addCell(celulaDataNasc);
        table.addCell(celulaSexo);

        return table;
    }

    public static void preencherDados(Document document, PdfPTable table, List<Produto> produtos) throws DocumentException, IOException {
        if(document.isOpen()){
            for(Produto produto : produtos) {
                PdfPCell celula1 = new PdfPCell(new Phrase(produto.getNome()));
                celula1.setHorizontalAlignment(Element.ALIGN_CENTER);

                PdfPCell celula2 = new PdfPCell(new Phrase(produto.getValor()));
                celula2.setHorizontalAlignment(Element.ALIGN_CENTER);

                PdfPCell celula3 = new PdfPCell(new Phrase(String.valueOf(produto.getDisponivel())));
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
