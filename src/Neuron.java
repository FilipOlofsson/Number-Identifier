import java.util.List;
import java.util.Random;

public class Neuron {
    float[] weights = new float[729];           // One weight for each input

    /*
    Randomizes all the weights upon initialization, when the correct weights have been established through training,
    this should be removed and the correct weights should instead of used.
     */
    Neuron() {
        Random rnd = new Random();
        for(int i = 0; i < weights.length; i++) {
            weights[i] = rnd.nextFloat()*2 - 1;
        }
    }

    /*
        Gets the sum of the multiplication between the inputs and the corresponding weight.
     */
    float getSum(List<Byte> inputs) {
        float sum = 0;
        for(int i = 0; i < weights.length; i++) {
            sum += weights[i] * inputs.get(i);
        }
        return sum;
    }
}
