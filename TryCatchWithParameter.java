package CoreJava;

public class TryCatchWithParameter {
	 public static void main(String[] args) {
	        int num1 = 10;
	        int num2 = 0;

	        try {
	            // Performing division inside the try block
	            int result = num1 / num2;
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Exception: " + e.getMessage());
	        }
	  }
}
