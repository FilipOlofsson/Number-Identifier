public class NeuronController {
    Neuron neuron[];

    NeuronController(int amt) {
        neuron = new Neuron[amt];
        for(int i = 0; i < amt; i++) {
            neuron[i] = new Neuron();
        }
    }

}
