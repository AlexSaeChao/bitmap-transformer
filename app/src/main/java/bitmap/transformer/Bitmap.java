package bitmap.transformer;

import java.awt.image.BufferedImage;
import java.awt.*;
public class Bitmap {

    private BufferedImage image;

    public Bitmap(BufferedImage image){
        this.image = image;
    }

    public void greyscale() {
        int width = image.getWidth();
        int height = image.getHeight();

        for (int i = 0; i < width; i++){
            for (int j = 0; j < height; j++) {
                Color fromSource = new Color(this.image.getRGB(i, j));

                int red = fromSource.getRed();
                int green = fromSource.getGreen();
                int blue = fromSource.getBlue();

            int grey = (red + green + blue ) / 3;
            Color greyColor = new Color ( grey, grey, grey);

            image.setRGB(i, j, greyColor.getRGB());
            }
        }
    }

    public BufferedImage toBufferedImage() {
        return this.image;
    }
}
