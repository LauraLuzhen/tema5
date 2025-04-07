package boletin3.ej4;

public class ContactoMain {

	public static void main(String[] args) {
		Persona persona = new Persona("Laura", 12345, "10 de octublre");
		Empresa empresa = new Empresa("Java", 9876, "Java.com");
		
		System.out.println(persona);
		System.out.println(empresa);
		
		System.out.println(persona.compareTo(empresa));
	}
}
