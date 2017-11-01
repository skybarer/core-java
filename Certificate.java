package certificate;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Hashtable;

import javax.imageio.ImageIO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.itextpdf.text.DocumentException;

public class Certificate {
	public static final String RESULT = "C:/Users/myworld/Desktop/test.pdf";
	  static Font customFont;

	public static void main(String[] args) throws DocumentException, IOException, WriterException {
		
		try {
		    //create the font to use. Specify the size!
		     customFont = Font.createFont(Font.TRUETYPE_FONT, new File("E:/workspace/corejava/Test/src/certificate/pala.ttf")).deriveFont(60f);
		    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		    //register the font
		    ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("E:/workspace/corejava/Test/src/certificate/pala.ttf")));
		} catch (IOException e) {
		    e.printStackTrace();
		} catch(FontFormatException e) {
		    e.printStackTrace();
		}

		BufferedImage im = ImageIO.read(new URL("file:///E:/workspace/corejava/Test/src/certificate/plain_template1.png"));
		FileOutputStream fos = new FileOutputStream("C:/Users/myworld/Desktop/plain_template1.png");
		Graphics2D g2 = im.createGraphics();
		g2.setFont(new Font("Arial Black", Font.PLAIN, 60));

		int size = 240;
		Hashtable<EncodeHintType, String> hintMap = new Hashtable<EncodeHintType, String>(2);
		hintMap.put(EncodeHintType.CHARACTER_SET, "UTF-16");
		QRCodeWriter qrCodeWriter = new QRCodeWriter();
		BitMatrix byteMatrix = qrCodeWriter.encode("barcode", BarcodeFormat.QR_CODE, size, size, hintMap);
		MatrixToImageWriter.writeToStream(byteMatrix, "png",
				new FileOutputStream("C:/Users/myworld/Desktop/" + "barcode" + "_qr" + ".png"));
		BufferedImage certificateQR = ImageIO.read(new File("C:/Users/myworld/Desktop/" + "barcode" + "_qr" + ".png"));
		g2.drawImage(certificateQR, 2947, 1940, null);

		g2.setColor(Color.BLACK);
		g2.drawString("123456789", 687, 659);

//		g2.drawString("I.Akash Dhar", 1179, 1429);
		
		drawCenteredString(g2,"Jagan Mohan Gumpa",new Rectangle(0,1387,3508,20),customFont);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ImageIO.write(im, "png", baos);
		byte[] writeImage = baos.toByteArray();

		fos.write(writeImage);
		baos.flush();
		fos.close();

	}
	
	public static void drawCenteredString(Graphics2D g, String text, Rectangle rect, Font font) {
	    // Get the FontMetrics
	    FontMetrics metrics = g.getFontMetrics(font);
	    // Determine the X coordinate for the text
	    int x = rect.x + (rect.width - metrics.stringWidth(text)) / 2;
	    // Determine the Y coordinate for the text (note we add the ascent, as in java 2d 0 is top of the screen)
	    int y = rect.y + ((rect.height - metrics.getHeight()) / 2) + metrics.getAscent();
	    // Set the font
	    g.setFont(font);
	    // Draw the String
	    g.drawString(text, x, y);
	}

}
