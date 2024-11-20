package abstarct.clas;

public class partial1 extends Partial{

	@Override
	void partiality() {
		System.out.println("they will not no partiality");
	}
	
	public static void main(String[] args) {
		partial1 p = new partial1();
				p.partiality();
		p.hindu();
	}
}
