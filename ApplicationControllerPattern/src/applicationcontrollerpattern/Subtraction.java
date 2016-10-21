package applicationcontrollerpattern;

public class Subtraction implements Operation {

    @Override
    public double calculate(double[] inputs) {
        return inputs[0] - inputs[1];
    }

}
