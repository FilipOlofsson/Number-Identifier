import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Network {

    NeuronController neuronController;
    int amountNeurons = 10;

    Network() {
        neuronController = new NeuronController(amountNeurons);
    }

    List<Byte> getColorArray(File file) throws IOException {
        BufferedImage image = ImageIO.read(file);
        List<Byte> colorArray = new LinkedList<>();
        for(int y = 0; y < image.getWidth(); y++) {
            for(int x = 0; x < image.getHeight(); x++) {
                if(new Color(image.getRGB(x, y)).equals(Color.WHITE)) {
                    colorArray.add((byte) 0);
                } else {
                    colorArray.add((byte) 1);
                }
            }
        }
        return colorArray;
    }

}
