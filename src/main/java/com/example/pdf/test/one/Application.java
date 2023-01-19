package com.example.pdf.test.one;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws DocumentException {
		SpringApplication.run(Application.class, args);

		Document document = new Document();
		try {
			PdfWriter.getInstance(document, new FileOutputStream("PrimeiroTest.pdf"));
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}

		document.open();
		Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
		Chunk chunk = new Chunk("Teste Gerador", font);

		document.add(chunk);
		document.close();
	}

}
