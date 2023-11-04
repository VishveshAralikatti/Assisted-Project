package CoreJava;

public class TypeCasting {

	public static void main(String[] args) {
		// Implicit type casting (Widening Conversion)
        int numInt = 100;
        long numLong = numInt; // Implicit type casting from int to long
        float numFloat = numLong; // Implicit type casting from long to float
        double numDouble = numFloat; // Implicit type casting from float to double

        System.out.println("Implicit Type Casting:");
        System.out.println("Integer value: " + numInt);
        System.out.println("After implicit casting to long: " + numLong);
        System.out.println("After implicit casting to float: " + numFloat);
        System.out.println("After implicit casting to double: " + numDouble);

        // Explicit type casting (Narrowing Conversion)
        double numD = 123.456;
        float numF = (float) numD; // Explicit type casting from double to float
        long numL = (long) numF; // Explicit type casting from float to long
        int numI = (int) numL; // Explicit type casting from long to int

        System.out.println("\nExplicit Type Casting:");
        System.out.println("Double value: " + numD);
        System.out.println("After explicit casting to float: " + numF);
        System.out.println("After explicit casting to long: " + numL);
        System.out.println("After explicit casting to int: " + numI);
	}

}
