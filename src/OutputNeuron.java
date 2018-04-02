import java.util.List;
import java.util.Random;

public class OutputNeuron {
    float[] weights = new float[729];           // One weight for each input


    /*
        The sigmoid function where we pass the (input * weights) to.
        Returns between -1 and 1, I should modify it to return between 0 and 1 so it directly represents
        "how much alike" the inputs are compared to a real digit. Bad explanation but if the first output neuron outputs
        a 1, it's VERY sure the digit is in fact a 0. If it returns 0, it's VERY sure it isn't.
     */
    private float sigmoid(float x) {
        return (float)(Math.pow(Math.E, x)/Math.pow(Math.E, x) + 1);
    }


    /*
        Randomize the weights upon initialization.
     */
    OutputNeuron() {
        Random rnd = new Random();
        for(int i = 0; i < weights.length; i++) {
            weights[i] = rnd.nextFloat()*2 - 1;
        }
    }

    /*
        Does the (input * weights) multiplication and summation which we pass onto the sigmoid function.
     */
    float guess(float input) {
        float output = 0;
        for(int i = 0; i < weights.length; i++) {
            output += weights[i] * input;
        }
        return sigmoid(output);
    }
}
