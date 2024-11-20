package creating.project;

public class Class {
	
	private void name() {
		System.out.println("Naveen");

	}
	private void age() {
		System.out.println("26");

	}
	
	private void maritialStatus() {
		System.out.println("single");
	}
public static void main(String[] args) {
	Class c = new Class();
	
	c.age();
	c.name();
	c.maritialStatus();
	
	Friend f = new Friend();
	f.friendAge();
	f.friendName();
}
}
