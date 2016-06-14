package test;

import java.util.HashMap;
import java.util.Stack;

public class Parser {

	public static boolean checkParanthesisBalance(String input) {

		HashMap<Character, Character> map = new HashMap<Character, Character>();
		Stack<Character> stack = new Stack<Character>();

		map.put('{', '}');
		map.put('(', ')');
		map.put('[', ']');
		map.put('<', '>');

		for (int i = 0; i < input.length(); i++) {
			char currentElement = input.charAt(i);

			if (map.containsKey(currentElement)) {
				stack.push(currentElement);
			} else {
				char stackElement = stack.pop();
				if (currentElement != map.get(stackElement)) {
					return false;
				}
			}
		}

		return stack.isEmpty();
	}

	public static void main(String[] args) {
		String[] tests = { "{}()", "({()})", "{}(" };

//		for (String test : tests) {
//			System.out.println("Testing " + test + " : " + checkParanthesisBalance(test));
//		}

		B o = new B();
		System.out.println(o instanceof B && !(o instanceof A));
		System.out.println(o instanceof B && !(o instanceof C));
		
	}

}
