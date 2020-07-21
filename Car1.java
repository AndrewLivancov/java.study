
public class Car1 {
	int modelYear;
	String modelName;
	
	public Car1(int year, String name) {
		modelYear = year;
		modelName = name;
	}
	
	public static void main(String[] args) {
		Car1 myCar1 = new Car1(1969, "Mustang");
System.out.println(myCar1.modelYear + " " + myCar1.modelName);
	}
}
