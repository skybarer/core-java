package ticket;

import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import model.Movie;

public class ImagingTest {

	public static void main(String[] args) throws IOException {
		String url = "file:///C:/Users/myworld/Desktop/W9QDZ3B.png";
		Movie movie = new Movie();
		movie.setMovieCode("W9Q3ZCB");
		movie.setMovieName("Java Janiki Nayaka");
		
		byte[] movieCode = mergeImageAndText(url, movie.getMovieCode(), new Point(151, 48));
//		byte[] movieName = mergeImageAndText(url, movie.getMovieName(), new Point(88, 339));
		
		FileOutputStream fos = new FileOutputStream("C:/Users/myworld/Desktop/so2.png");
		fos.write(movieCode);
		fos.close();
	}

	public static byte[] mergeImageAndText(String imageFilePath, String text, Point textPosition) throws IOException {
		
		BufferedImage im = ImageIO.read(new URL(imageFilePath));
		Graphics2D g2 = im.createGraphics();
		g2.setFont(new Font("Arial Black", Font.PLAIN, 20));
		g2.drawString(text, textPosition.x, textPosition.y);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ImageIO.write(im, "png", baos);
		baos.flush();
		return baos.toByteArray();
	}
}
