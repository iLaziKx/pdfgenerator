package pdfgenerator;

import java.awt.Color;
import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class PDFGenerator {

    public static void main(String args[]) throws IOException {

        //Creating PDF document object 
        File file = new File("C:/Users/benoi/Desktop/pdf/template.pdf");
        PDDocument document = PDDocument.load(file);

        //Retrieving the pages of the document 
        PDPage page = document.getPage(0);
        PDPageContentStream contentStream = new PDPageContentStream(document, page, PDPageContentStream.AppendMode.APPEND, false);

        //Begin the Content stream 
        contentStream.beginText();

        contentStream.setNonStrokingColor(Color.BLACK);

        //Setting the font to the Content stream  
        contentStream.setFont(PDType1Font.HELVETICA, 12);

        //Setting the position for the line         
        String text = "x";
        
        //###Favorable###
        contentStream.newLineAtOffset(138, 458);
        contentStream.showText(text);
        
        contentStream.newLine(); 
        
        //###Réservé###
        contentStream.newLineAtOffset(200, 458);
        contentStream.showText(text);
        
        contentStream.newLine(); 
        
        //###Défavorable###
        contentStream.newLineAtOffset(150, 458);
        contentStream.showText(text);

        //Ending the content stream
        contentStream.endText();

        System.out.println("Content added");

        //Closing the content stream
        contentStream.close();

        //Saving the document
        document.save("C:/Users/benoi/Desktop/pdf/my_doc.pdf");

        System.out.println("PDF created");

        //Closing the document  
        document.close();

    }
}
