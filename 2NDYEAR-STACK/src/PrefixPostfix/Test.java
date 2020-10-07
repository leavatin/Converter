package PrefixPostfix;

public class Test {

	public static void main(String[] args) {
        String prefix = "+10*3/5-164";
        System.out.println("Prefix Expression: " + prefix);
        System.out.println("Postfix Expression: " + new PrefixPostfix().convert(prefix));
    }
}