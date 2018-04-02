import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Network {

    NeuronController neuronController;
    OutputController outputController;
    int amountNeurons = 10;

    Network() {
        neuronController = new NeuronController(amountNeurons);
        outputController = new OutputController(10);
    }


    /*
    Converts the image into a long list of binary digits representing the color.
     */
    private List<Byte> getColorArray(File file) throws IOException {
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

    /*
        The function which outputs a list of all the output neurons outputs.
     */
    List<Float> getDigit(File file) {
        List<Byte> colorArray = null;
        List<Float> outputs = new LinkedList<>();
        try {
            colorArray = getColorArray(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(int i = 0; i < 10; i++) {
            float sum = 0;
            for(int j = 0; j < amountNeurons; j++) {
                sum += neuronController.neuron[j].getSum(colorArray);
            }
            outputs.add(outputController.outputs[i].guess(sum));
        }
        return outputs;
    }

}
