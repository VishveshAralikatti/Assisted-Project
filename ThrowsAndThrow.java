package CoreJava;

//Class with a method that throws an exception using the throw keyword
class ThrowsExample {
 void checkNumber(int number) {
     if (number < 0) {
         throw new IllegalArgumentException("Number cannot be negative");
     } else {
         System.out.println("Number is: " + number);
     }
 }
}

//Main class to demonstrate the usage of throw keyword
public class ThrowsAndThrow {
 public static void main(String[] args) {
     ThrowsExample obj = new ThrowsExample();
     try {
         obj.checkNumber(-5);
     } catch (IllegalArgumentException e) {
         System.out.println("Exception: " + e.getMessage());
     }
 }
}
