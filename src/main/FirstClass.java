package main;

public class FirstClass {
	static String result;

	public static void main(String[] args) {
		System.out.print("Hello, World!\n");
		
		result = returnLargerNumber(4, 9);
		System.out.print(result);
		
		System.out.print(addTwoNumbers(2, 5));
	}
	
	public static String returnLargerNumber(int a, int b) {
		if (a >= b){
			return "The larger number is: " + a + "\n";
		}else{
			return "The larger number is: " + b + "\n";
		}
	}
	
	public static String addTwoNumbers(int a, int b){
		int c = a + b;
		return "The result is: " + c;
	}
}
