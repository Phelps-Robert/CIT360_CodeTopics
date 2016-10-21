package applicationcontrollerpattern;

import java.util.HashMap;

public class ApplicationController {

	private final HashMap<Character, Operation> calculations = new HashMap<>();
	
	public ApplicationController() {
		calculations.put('+', new Addition());
		calculations.put('-', new Subtraction());
		calculations.put('*', new Multiplication());
		calculations.put('÷', new Division());
	}
	
	public double requestCalculation(char operator, double[] inputs) throws NullPointerException {
		Operation operation = calculations.get(operator);
		return operation.calculate(inputs);
	}
}
