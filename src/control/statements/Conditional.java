package control.statements;

public class Conditional {
	
	public static void main(String[] args) {
		
		
		int a=10,b=20,c=30;
		
		if (a<b && b>c) {
			System.out.println("correct");
		}else if (a<b && b<a) {
			System.out.println("correct1");
		}else if (b<a || c>a) {
			System.out.println("correct 2");
		}else {
			System.out.println("all Wrong");
		}
			
		}
}