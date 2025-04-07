package boletin5.ej2;

public class CuentaCorrienteMain {

	public static void main(String[] args) {
		try {
			CuentaCorriente cuenta = new CuentaCorriente("123J", "Laura", 29.3);
		} catch (ErrorDniException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		} catch (ErrorNameException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		} catch (ErrorBalanceException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}
}
