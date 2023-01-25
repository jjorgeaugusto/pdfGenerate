package com.example.pdf.test.one;
import java.util.List;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;

public class ControllerTable {

    public static PdfPTable criarCabecalho() {
        PdfPTable table = new PdfPTable(new float[]{10f, 5f, 3f});
        PdfPCell celulaNome = new PdfPCell(new Phrase("Nome"));
        celulaNome.setBackgroundColor(BaseColor.YELLOW);
        celulaNome.setHorizontalAlignment(Element.ALIGN_CENTER);
        PdfPCell celulaDataNasc = new PdfPCell(new Phrase("Data Nascimento"));
        celulaDataNasc.setBackgroundColor(BaseColor.YELLOW);
        celulaDataNasc.setHorizontalAlignment(Element.ALIGN_CENTER);
        PdfPCell celulaSexo = new PdfPCell(new Phrase("Sexo"));
        celulaSexo.setBackgroundColor(BaseColor.YELLOW);
        celulaSexo.setHorizontalAlignment(Element.ALIGN_CENTER);


        table.addCell(celulaNome);
        table.addCell(celulaDataNasc);
        table.addCell(celulaSexo);

        return table;
    }

    public static void preencherDados(Document document, PdfPTable table, List<Pessoa> pessoas) throws DocumentException {
        if(document.isOpen()){
            for(Pessoa pessoa : pessoas) {
                PdfPCell celula1 = new PdfPCell(new Phrase(pessoa.getNome()));
                celula1.setHorizontalAlignment(Element.ALIGN_CENTER);
                PdfPCell celula2 = new PdfPCell(new Phrase(pessoa.getDataNasc()));
                celula2.setHorizontalAlignment(Element.ALIGN_CENTER);
                PdfPCell celula3 = new PdfPCell(new Phrase(String.valueOf(pessoa.getSexo())));
                celula3.setHorizontalAlignment(Element.ALIGN_CENTER);

                table.addCell(celula1);
                table.addCell(celula2);
                table.addCell(celula3);
            }

            document.add(table);
        }


    }


}
