import java.io.File;
import java.util.List;

public class Testing_Network {
    public static void main(String[] args) {
        Network network = new Network();
        List<Float> outputs = network.getDigit(new File("Training Data/2.png"));
        for(Float i : outputs) {
            System.out.println(i);                  // Should output -1<x<1 ten times.
        }                                           // It very much does not. It instead outputs 2.0 ten times.
    }                                               // Which is extremely strange because the sigmoid function ALWAYS
}                                                   // return something between -1 and 1.
