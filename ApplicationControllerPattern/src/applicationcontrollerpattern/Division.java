package applicationcontrollerpattern;

public class Division implements Operation {

    @Override
    public double calculate(double[] inputs) {
        try {
            return inputs[0] / inputs[1];
        } catch (ArithmeticException e) {
            System.out.println("Error: Can't divide by 0");
        }
        return 0;
    }
}
