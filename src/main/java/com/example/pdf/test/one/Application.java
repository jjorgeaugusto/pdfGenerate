package com.example.pdf.test.one;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws DocumentException, IOException {
		SpringApplication.run(Application.class, args);

		Document document = new Document();
		try {
			PdfWriter.getInstance(document, new FileOutputStream("PrimeiroTest.pdf"));
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}


		ObjectMapper objectMapper = new ObjectMapper();
		File file = new File("controle.json");
		List<Produto> listaJson = objectMapper.readValue(file.toURI().toURL(), objectMapper.getTypeFactory().constructCollectionType(List.class, Produto.class));

		document.open();
//		Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
//		Chunk chunk = new Chunk("TABELA DE PRODUTOS", font);
//
//		document.add(chunk.setHorizontalScaling(Element.ALIGN_CENTER));

		document.addTitle("Primeiro Teste De Titulo");

		PdfPTable table = ControllerTable.criarCabecalho();

		ControllerTable.preencherDados(document, table, listaJson);

		document.close();


//
	}

}
