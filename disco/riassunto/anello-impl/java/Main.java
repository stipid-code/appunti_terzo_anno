package anello;

public class Main {
	public static void main(String[]args) {
		IntegerAnello integerAnello = new IntegerAnello();
		
		int a = integerAnello.sum(5, 7);
		a = integerAnello.sum(a, integerAnello.getOne());
		System.out.println(a);
	}
}
