package InfixPrefix;

public class Test {
	 public static void main(String[] args) {
	        String exp = "A*B/C^2*D";
	        System.out.println("Infix Expression: " + exp);
	        System.out.println("Prefix Expression: " + InfixPrefix.infixToPreFix(exp));
	    }
	}

