public class sample1 {
	public static void main(String[] args) {
		String name = "John";
		System.out.println(name);
		int myNum;
		myNum = 15;
		myNum = 20; // myNum is now 20
		System.out.println(myNum);
		System.out.println("Hello " + name);
		String lastName = " Doe";
		String fullName = name + lastName;
		System.out.println(fullName);
		int x = 5;
		int y = 6;
		System.out.println(x + y); // Value 
		int z = 50;
		System.out.println(x + y + z);
		byte maNum = 100;
		System.out.println(maNum);
		short myNen = 5000;
		System.out.println(myNen);
		long myNon = 1500000000L;
		System.out.println(myNon);
		// Floating point types
		float Flo = 5.75f;
		System.out.println(Flo);
		double doub = 19.99d; //Double sample
		System.out.println(doub);
		float f1 = 35e3f;
		double d1 = 12E4d;
		System.out.println(f1);
		System.out.println(d1);
		boolean isJavaFun = true;
		boolean isFishTasty = false;
		System.out.println(isJavaFun);
		System.out.println(isFishTasty);
		char myGrade = 'B';
		System.out.println(myGrade);
		char a = 65, b = 66, c = 67;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		String greeting = "Hello World";
		System.out.println(greeting);
		int myInt = 9;
		double myDouble = myInt;
		//automatic casting: int to double
		System.out.println(myInt);
		System.out.println(myDouble);
		double myDoubl = 9.78;
		int myIn = (int) myDoubl;
		System.out.println(myDoubl);
		System.out.println(myIn);
		int w = 100 + 50;
		System.out.println(w);
		int sum1 = 100 + 50;
		int sum2 = sum1 + 250;
		int sum3 = sum2 + sum2;
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		x += 10;
		System.out.println(x);
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	System.out.println("The length of the string is: "
		+ txt.length());
		String txt1 = "Hello World";
		System.out.println(txt1.toUpperCase());
		System.out.println(txt1.toLowerCase());
		String txt2 = "Please locate where 'locate' occurs!";
		System.out.println(txt2.indexOf("locate"));
		System.out.println(name + " " + lastName);
		System.out.println(name.concat(lastName));
		String txt3 = "We are the so-called \"Viking\" from the north.";
		System.out.println(txt3);
		String txt4 = "It\'s alright.";
		System.out.println(txt4);
		String txt5 = "The character \\ is called backslash.";
		System.out.println(txt5);
		System.out.println(Math.max(5,10));
		System.out.println(Math.min(5, 10));
		System.out.println(Math.sqrt(64));
		System.out.println(Math.abs(-4.7));
		System.out.println(Math.random());
		System.out.println(x > y);
		System.out.println(x);
		System.out.println(10 > 9);
		System.out.println(x ==15);
		System.out.println(15 == 10);
		if (20 > 10) {
			System.out.println("20 is greater than 18");
			}
		if (x > y) {
System.out.println("x is greater than y");
			}
		int time = 20;
		if (time < 18) {
			System.out.println("Good day.");
			} else {
			System.out.println("Good evening.");
			}
		int time2 = 22;
		if (time2 < 10) {
			System.out.println("Good morning.");
			} else if (time2 < 20) {
			System.out.println("Good Day.");
			} else {
			System.out.println("Good evening.");
			}
		String result;
		result = (time < 18) ? "Good day." :"Good evening.";
		System.out.println(result);
		int[][] myNumbers = {{1,2,3,4}, {5,6,7,}};
		int v = myNumbers[1][2];
		System.out.println(v);
for (int i = 0; i < myNumbers[1].length; ++i) {
	for (int j = 0; j < myNumbers[i].length; ++j) {
		System.out.println(myNumbers[i][j]);
		}
		}
 	}
}