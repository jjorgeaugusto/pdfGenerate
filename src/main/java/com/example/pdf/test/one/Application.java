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
import java.util.ArrayList;
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


		String json = "{\"nome\":\"David\",\"dataNasc\":\"28/04/1999\",\"sexo\":\"M\"}";
		ObjectMapper objectMapper = new ObjectMapper();
		Pessoa listaPessoa = objectMapper.readValue(json, Pessoa.class);
		System.out.println(json);

		document.open();
		Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
		Chunk chunk = new Chunk("Teste Gerador de PDF", font);

		document.add(chunk);
//		document.close();

		document.addTitle("Primeiro Teste De Titulo");

		File file = new File("cachorro.jpg");

		Image img = null;
		try {
			img = Image.getInstance(file.toURI().toURL());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		img.scaleAbsoluteWidth(50);
		img.scaleAbsoluteHeight(50);
		document.add(img);

		PdfPTable table = ControllerTable.criarCabecalho();

		List<Pessoa> lpessoa = new ArrayList<Pessoa>();
		Pessoa pessoa1 = new Pessoa("Jorge","28/04/1997",'M');
		Pessoa pessoa2 = new Pessoa("Indiano","23/01/1977",'M');
		Pessoa pessoa3 = new Pessoa("Estranho","01/04/1966",'F');

		lpessoa.add(pessoa1);
		lpessoa.add(pessoa2);
		lpessoa.add(pessoa3);

		ControllerTable.preencherDados(document, table, lpessoa);
		document.close();


//
	}

}
