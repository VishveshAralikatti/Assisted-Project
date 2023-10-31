package CoreJava;

public class FinallyBlock {
    public static void main(String[] args) {
        try {
            int result = 12 / 4;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block always executes.");
        }
    }
}
