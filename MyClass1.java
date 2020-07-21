
public class MyClass1 {
	// Static method
static void myStaticMethod() {
System.out.println("Static methods can be called without creating objects");
	}

	// public method
	public void myPublicMethod() {
System.out.println("Public methods must be called by creating objects");
	}
	
	// Main method
public static void main(String[] args) {
	myStaticMethod(); // Call the static method
	
	MyClass1 myObj  = new MyClass1();
	myObj.myPublicMethod();
	}
}
