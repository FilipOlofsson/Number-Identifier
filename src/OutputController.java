import java.util.LinkedList;
import java.util.List;

    /*
        Useless right now. Will be useful in the future when I implement the ability to train the network.
     */

public class OutputController {
    OutputNeuron[] outputs;

    OutputController(int neurons) {
        outputs = new OutputNeuron[neurons];
        for(int i = 0; i < outputs.length; i++) {
            outputs[i] = new OutputNeuron();
        }
    }

}
