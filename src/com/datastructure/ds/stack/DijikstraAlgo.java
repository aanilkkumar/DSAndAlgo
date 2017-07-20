package com.datastructure.ds.stack;

public class DijikstraAlgo {
	
	private GenericStack<Integer> valueStack;
	private GenericStack<String> operandStack;
	
	public DijikstraAlgo(){
		valueStack = new GenericStack<>();
		operandStack = new GenericStack<>();
	}

	public int evaluateExpression(String expression){
		for (int i = 0; i < expression.length(); i++) {
			char exp = expression.charAt(i);
			if(anyNumber(exp)){
				Integer integer = new Integer(Character.getNumericValue(exp));
				valueStack.push(integer);
			}
			else if(anyOperand(exp)){
				operandStack.push(exp+"");
			}
			else if(exp == ')'){
				Integer v1 = valueStack.pop();
				Integer v2 = valueStack.pop();
				String operand = operandStack.pop();
				Integer calulatedValue = calculateValue(v1, v2, operand);
				valueStack.push(calulatedValue);
			}
		}
		
		return valueStack.pop();
	}

	private Integer calculateValue(Integer v1, Integer v2, String operand) {
		Integer result = 0;
		switch (operand) {
		case "+":
			result = v1+v2;
			break;
		case "*":
			result = v1*v2;
			break;	
		default:
			break;
		}
		return result;
	}

	private boolean anyOperand(char exp) {
		return exp == '+' || exp == '*';
	}

	private boolean anyNumber(char exp) {
		return exp == '0' || exp == '1'|| exp == '2' || exp == '3' || exp == '4' || exp == '5';
	}
}
