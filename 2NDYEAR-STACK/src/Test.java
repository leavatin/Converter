
public class Test {

	public static void main(String[] args) {
        String equ = "*+AB+CD";
        System.out.println("Prefix Expression: " + equ);
        System.out.println("Infix Expression: " + new PrefixInfix().convert(equ));
    }
}