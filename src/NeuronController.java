public class NeuronController {
    Neuron neuron[];

    /*
        Useless right now. Will be useful in the future when I implement the ability to train the network.
     */
    NeuronController(int amt) {
        neuron = new Neuron[amt];
        for(int i = 0; i < amt; i++) {
            neuron[i] = new Neuron();
        }
    }

}
