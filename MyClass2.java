// Create a MyClass class
public class MyClass2 {
	int x;
	// Create a class constructor for the MyClass class
	public MyClass2(int y) {
		x = y;
	}
	
	public static void main(String[] args) {
		MyClass2 myObj = new MyClass2(5);
		System.out.println(myObj.x);
	}
}
