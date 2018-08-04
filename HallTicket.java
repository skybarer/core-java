

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;


public class HallTicket {
	public static void main(String args[]){
		try {
			//Create Document instance.
			Document document = new Document();
			// document header attributes
			document.addAuthor("APSSDC");
			document.addCreationDate();
			document.addProducer();
			document.addTitle("Challan");
			document.setPageSize(PageSize.LETTER);

		    document.setPageSize(PageSize.A4);
		    document.setMargins(0, 0, 0, 0);
		    
		    OutputStream outputStream = new FileOutputStream(new File("E:\\HallTicket.pdf"));
		
			
			//Create PDFWriter instance.
			PdfWriter writer = PdfWriter.getInstance(document, outputStream);
			  
            //Open the document.
            document.open();
            
	       //creating a rounded rectangle 
            PdfContentByte canvas = writer.getDirectContent();
            canvas.roundRectangle(36, 350, 520, 480, 5);
            
           
          
            
           /* Rectangle rect = new Rectangle(36, 36, 559, 806);
            rect.setBorder(Rectangle.BOX);
            rect.setBorderWidth(1);
            canvas.rectangle(rect);*/
            Rectangle rect1 = new Rectangle(100, 100, 520, 520);
            // rect.setBackgroundColor(BaseColor.LIGHT_GRAY);
             rect1.setBorder(Rectangle.BOX);
             rect1.setBorderWidth(1);
             canvas.rectangle(rect1);
          
          

            //Add content to the document.
             float scaler = 67;
            Image imageLeft = Image.getInstance("E:\\logo.jpg");
            imageLeft.setAbsolutePosition(38f, 780f);
            imageLeft.setAlignment(Image.LEFT);
            imageLeft.scalePercent(scaler);
            writer.getDirectContent().addImage(imageLeft);
            
            Image imageRight = Image.getInstance("E:\\logo.jpg");
            imageRight.setAbsolutePosition(500f, 780f);
            imageRight.setAlignment(Image.LEFT);
            imageRight.scalePercent(scaler);
            writer.getDirectContent().addImage(imageRight);
           
            
            document.add(Chunk.NEWLINE);
            LineSeparator ls = new LineSeparator();
            document.add(new Chunk(ls));
           
          
            //Close document and outputStream.
            document.close();
            outputStream.close();
            
            
           
            
            System.out.println("Pdf created successfully.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
