package boletin3.ej3;

public class Sub extends Base{

	public void methodA() {
		System.out.println("subA");
	}
	
	public void methodB() {
		System.out.println("subB");
	}
	
	public static void main(String[] args) {
		Base b = new Sub();
		Sub sub = new Sub();
		Base base = (Base) sub;
		
		b.methodA();
		
		base.methodA();
	}
}
