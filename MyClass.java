public class MyClass {
	int x = 10;
	
	public static void main(String[] args) {
		MyClass myObj1 = new MyClass();
		MyClass myObj2 = new MyClass();
		myObj2.x = 50;
		System.out.println(myObj1.x);
		System.out.println(myObj2.x);
	}
}