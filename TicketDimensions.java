package ticket;

import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.pdf.parser.ImageRenderInfo;
import com.itextpdf.text.pdf.parser.PdfImageObject;

public class TicketDimensions {
	
	public void renderImage(ImageRenderInfo renderInfo) {
	    try {
	        String filename;
	        FileOutputStream os;
	        String path = "C:/Users/myworld/Desktop/W9QDZ3B.jpg";
	        PdfImageObject image = renderInfo.getImage();
	        if (image == null) return;
	        filename = String.format(path, renderInfo.getRef().getNumber(), image.getFileType());
	        os = new FileOutputStream(filename);
	        os.write(image.getImageAsBytes());
	        os.flush();
	        os.close();
	    } catch (IOException e) {
	        System.out.println(e.getMessage());
	    }
	}

}
