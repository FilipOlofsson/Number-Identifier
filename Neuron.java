import java.util.List;
import java.util.Random;

public class Neuron {
    float[] weights = new float[729];           // One weight for each input

    private float sigmoid(float x) {
        return (float)(Math.pow(Math.E, x)/Math.pow(Math.E, x) + 1);        // Sigmoid activation function
    }

    Neuron() {
        Random rnd = new Random();
        for(int i = 0; i < weights.length; i++) {
            weights[i] = rnd.nextFloat()*2 - 1;
        }
    }

    float guess(List<Byte> inputs) {
        float sum = 0;
        for(int i = 0; i < weights.length; i++) {
            sum += weights[i] * inputs.get(i);
        }
        return sigmoid(sum);
    }
}
