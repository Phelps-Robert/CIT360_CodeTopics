package applicationcontrollerpattern;

public class Addition implements Operation {

    @Override
    public double calculate(double[] inputs) {
        return inputs[0] + inputs[1];
    }

}
