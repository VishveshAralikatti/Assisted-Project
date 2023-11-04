package CoreJava;


//A class with public access modifier
class PublicClass {
 public void display() {
     System.out.println("This is a public method.");
 }
}

//Another class with default access modifier
class DefaultClass {
 void display() {
     System.out.println("This is a default method.");
 }
}

//Another class in the same package with a subclass having protected access modifier
class ProtectedClass {
 protected void display() {
     System.out.println("This is a protected method.");
 }
}

//Another class to demonstrate the private access modifier
class PrivateClass {
 private void display() {
     System.out.println("This is a private method.");
 }
}

//Main class to demonstrate access modifiers
public class AccessModifiers {

	public static void main(String[] args) {
		PublicClass publicObj = new PublicClass();
        publicObj.display(); // Accessing public method

        DefaultClass defaultObj = new DefaultClass();
        defaultObj.display(); // Accessing default method

        ProtectedClass protectedObj = new ProtectedClass();
        protectedObj.display(); // Accessing protected method

        // Trying to access the private method from another class (results in a compilation error)
        // PrivateClass privateObj = new PrivateClass();
        // privateObj.display();
	}

}
