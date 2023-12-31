/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package bitmap.transformer;

import java.io.IOException;
import java.io.File;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class App {
    public static void main(String[] args) throws IOException {
        if(args.length < 3) {
            System.out.println("Usage: ./gradlew run --args InputPath OutputName TransformOperation");
            System.exit(1);
        }
        File input = new File(args[0]);
        File output = new File(args[1]);
        String transformOperation = args[2];

        BufferedImage inputImage = ImageIO.read(input);
            Bitmap bitmap = new Bitmap(inputImage);

            if (transformOperation.equals("greyscale")) {
                bitmap.greyscale();
            } else {
                System.out.println("Transform Not a Method");
                System.exit(1);
            }
            ImageIO.write(bitmap.toBufferedImage(), "bmp", output);
    }
}

//./gradlew run --args app/src/main/resources/baldy-8bit.bmp outputFile greyscale