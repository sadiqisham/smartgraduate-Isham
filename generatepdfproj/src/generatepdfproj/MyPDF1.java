package generatepdfproj;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class MyPDF1 {

	public static void main(String[] args) {
		
		try {
			
		
		String file_name="C:\\Generate_PDF\\o3PDF.pdf";
		
		Document document=new Document();
		
		//simple paragraph
		PdfWriter.getInstance(document, new FileOutputStream(file_name));
		
		document.open();
		
		
		Paragraph para=new Paragraph("This is a testing from unrivaller.com");
		
		document.add(para);
		
		
		
		
		document.add(new Paragraph(" "));
		document.add(new Paragraph(" "));
		document.add(new Paragraph(" "));
		document.add(new Paragraph(" "));
		document.add(new Paragraph(" "));
		
		//add table
		
		PdfPTable table=new PdfPTable(3);
		PdfPCell c1=new PdfPCell(new Phrase("Heading 1"));
		table.addCell(c1);
		
		
		c1=new PdfPCell(new Phrase("Heading 2"));
		table.addCell(c1);
		
		
		c1=new PdfPCell(new Phrase("Heading 3"));
		table.addCell(c1);
		table.setHeaderRows(1);
		
		
		table.addCell("1.0");
		table.addCell("1.1");
		table.addCell("1.2");
		table.addCell("2.1");
		table.addCell("2.2");
		table.addCell("2.3");
		
		
		document.add(table);
		
		//add image 
		
		document.add(Image.getInstance("C:\\Generate_PDF\\msi.png"));
		
		
		
		document.close();
		
		System.out.println("Finished...");
		}catch(Exception e) {
			System.err.println(e);
		}
		
		
		
	}
}
