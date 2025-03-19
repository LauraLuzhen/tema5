package boletin1.ej2;

public class EmpleadoMain {

	public static void main(String[] args) {
		
		Empleado empleado = new Empleado("Laura");
		Directivo directivo = new Directivo("Laura");
		Oficial oficial = new Oficial("Laura");
		Operario operario = new Operario("Laura");
		Tecnico tecnico = new Tecnico("Laura");
		
		System.out.println(empleado);
		System.out.println(directivo);
		System.out.println(oficial);
		System.out.println(operario);
		System.out.println(tecnico);
	}
}
