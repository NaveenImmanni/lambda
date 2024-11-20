package abst.cls2;

public class Cl1 implements In1{

	@Override
	public void naveen() {
		System.out.println("sdfgh");
		
	}

	@Override
	public void pavan() {
		System.out.println("sdfgh");
		
	}
	
	public static void main(String[] args) {
		Cl1 c = new Cl1();
		
		c.pavan();
		c.naveen();
	}

}
