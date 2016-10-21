package applicationcontrollerpattern;

public class Multiplication implements Operation {

    @Override
    public double calculate(double[] inputs) {
        return inputs[0] * inputs[1];
    }

}
