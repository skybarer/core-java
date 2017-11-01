package ticket;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Hashtable;

import javax.imageio.ImageIO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.ByteMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import model.Movie;

public class TicketPrint {

	public static void main(String[] args) throws MalformedURLException, IOException, WriterException {

		String imageFilePath = "file:///E:/workspace/corejava/Test/src/ticket/W9QDZ3B.png";

		Movie movie = new Movie();
		movie.setMovieCode("W9Q3ZCB");
		movie.setMovieName("Java Janaki Nayaka");
		movie.setMovieDate("Fri, 11 Aug, 2017");
		movie.setMovieTime("1:30 PM");
		movie.setMovieLocation("BVK Multiplex");
		movie.setMovieSeats("BALCONY-E14");
		movie.setMovieImage("E:/workspace/corejava/Test/src/ticket/movie_logo.png");

		FileOutputStream fos = new FileOutputStream("C:/Users/myworld/Desktop/so2.png");
		BufferedImage im = ImageIO.read(new URL(imageFilePath));
		
		Image movieImage = ImageIO.read(new File(movie.getMovieImage()));
		Graphics2D g2 = im.createGraphics();
		g2.setFont(new Font("Arial Black", Font.PLAIN, 20));
		
		g2.drawImage(movieImage , 22, 79, 518, 207, null );
		
		g2.setColor(Color.WHITE);
		g2.drawString(movie.getMovieCode(), 151 , 48 );
		
		g2.setColor(Color.BLACK);
		g2.drawString(movie.getMovieName(), 88  , 339);
		g2.drawString(movie.getMovieDate(), 41  , 446);
		g2.drawString(movie.getMovieTime(), 343 , 446);
		g2.drawString(movie.getMovieLocation(), 41 , 546);
		g2.drawString(movie.getMovieSeats(), 339 , 546);
		
		
		int size = 160;
		Hashtable<EncodeHintType, String> hintMap = new Hashtable<EncodeHintType, String>(2);
		hintMap.put(EncodeHintType.CHARACTER_SET, "UTF-8");
		QRCodeWriter qrCodeWriter = new QRCodeWriter();
		BitMatrix byteMatrix = qrCodeWriter.encode(movie.getMovieCode(), BarcodeFormat.QR_CODE, size, size, hintMap);
		MatrixToImageWriter.writeToStream(byteMatrix, "png", new FileOutputStream("C:/Users/myworld/Desktop/"+movie.getMovieCode()+"_qr"+".png") );
		Image movieQR = ImageIO.read(new File("C:/Users/myworld/Desktop/"+movie.getMovieCode()+"_qr"+".png"));
		g2.drawImage(movieQR, 193, 670, null);
		g2.drawString(movie.getMovieCode(), 221 , 849 );
	

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ImageIO.write(im, "png", baos);
		byte[] writeImage = baos.toByteArray();

		fos.write(writeImage);
		baos.flush();
		fos.close();

	}
	
	
}
