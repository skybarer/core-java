package ticket;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Testing {
	public static void main(String arg[]) throws IOException {
		String key = "Sample";
		BufferedImage bufferedImage = new BufferedImage(170, 30, BufferedImage.TYPE_INT_RGB);
		Graphics graphics = bufferedImage.getGraphics();
		graphics.setColor(Color.LIGHT_GRAY);
		graphics.fillRect(0, 0, 200, 50);
		graphics.setColor(Color.BLACK);
		graphics.setFont(new Font("Arial Black", Font.BOLD, 20));
		graphics.drawString(key, 10, 25);
		ImageIO.write(bufferedImage, "jpg", new File("C:/Users/myworld/Desktop/akash.jpg"));
		System.out.println("Image Created");
	}
}