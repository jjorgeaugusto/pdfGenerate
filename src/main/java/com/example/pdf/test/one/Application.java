package com.example.pdf.test.one;

import com.itextpdf.text.DocumentException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws DocumentException, IOException {
		SpringApplication.run(Application.class, args);

//		Document document = new Document();
//		try {
//			PdfWriter.getInstance(document, new FileOutputStream("PrimeiroTest.pdf"));
//		} catch (FileNotFoundException e) {
//			throw new RuntimeException(e);
//		}


//		ObjectMapper objectMapper = new ObjectMapper();
//		File file = new File("C://teste/controle.json");
//		List<Produto> listaJson = objectMapper.readValue(file.toURI().toURL(), objectMapper.getTypeFactory().constructCollectionType(List.class, Produto.class));

//		document.open();
//		document.addTitle("Primeiro Teste De Titulo");

//		PdfPTable table = ControllerTable.criarCabecalho();

//		ControllerTable.preencherDados(document, table, listaJson);
//
//		document.close();


		// Métodos Post e Get



		//
	}

}
