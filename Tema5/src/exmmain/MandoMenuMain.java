package exmmain;

import java.util.Scanner;

import exm.Mando;
import exm.MandoAireAcondicionado;
import exm.MandoAspiradora;
import exm.MandoMinicadenas;
import exm.MandoTelevision;
import exmexcepciones.ErrorAltura;
import exmexcepciones.ErrorAnchura;
import exmexcepciones.ErrorModelo;
import exmexcepciones.ErrorPrecio;

public class MandoMenuMain {

	public static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		int opc, canal;
		String tipo, modo;
		double precio, temperatura;
		Mando mando;
		
		System.out.println("¿Qué tipo de mando quieres crear? (aire acondicionado, aspiradora, televisión, minicadenas)");
		tipo = reader.nextLine();
		mando = crearMando(tipo);
		
		do {
			System.out.println("INTRODUCE UNA OPCIÓN: ");
			menuComun(mando);
			opc = reader.nextInt();
			reader.nextLine();
			
			switch(opc) {
			case 1 -> mando.onOff();
			case 2 -> System.out.println(mando);
			case 3 -> {
				System.out.println("Introduce el nuevo precio: ");
				precio = reader.nextDouble();
				reader.nextLine();
				try {
					mando.setPrecio(precio);
				} catch (ErrorPrecio e) {
					System.err.println(e);
					System.err.println(e.getMessage());
				}
			}
			case 0 -> System.out.println("Saliendo del programa...");
			default -> {
				if (mando instanceof MandoTelevision) {
					switch(opc) {
					case 4 -> {
						if (((MandoTelevision)mando).subirVolumne()) {
							System.out.println("Cambio realizado");
						} else {
							System.out.println("Has llegado al límite");
						}
					}
					case 5 -> {
						if (((MandoTelevision)mando).bajarVolumen()) {
							System.out.println("Cambio realizado");
						} else {
							System.out.println("Has llegado al límite");
						}
					}
					case 6 -> {
						System.out.println("Introduce el canal: ");
						canal = reader.nextInt();
						reader.nextLine();
						if (((MandoTelevision)mando).cambiarCanal(canal)) {
							System.out.println("Cambio realizado");
						} else {
							System.out.println("No se ha podido realizar el cambio");
						}
					}
					default -> System.out.println("Introduce una opción válida");
					}
				} else if (mando instanceof MandoMinicadenas) {
					switch(opc) {
					case 4 -> {
						if (((MandoMinicadenas)mando).subirVolumne()) {
							System.out.println("Cambio realizado");
						} else {
							System.out.println("Has llegado al límite");
						}
					}
					case 5 -> {
						if (((MandoMinicadenas)mando).bajarVolumen()) {
							System.out.println("Cambio realizado");
						} else {
							System.out.println("Has llegado al límite");
						}
					}
					default -> System.out.println("Introduce una opción válida");
					}
				} else if (mando instanceof MandoAspiradora) {
					switch(opc) {
					case 4 -> {
						if (((MandoAspiradora)mando).aumentarVelocidad()) {
							System.out.println("Cambio realizado");
						} else {
							System.out.println("Has llegado al límite");
						}
					}
					case 5 -> {
						if (((MandoAspiradora)mando).disminuirVelocidad()) {
							System.out.println("Cambio realizado");
						} else {
							System.out.println("Has llegado al límite");
						}
					}
					default -> System.out.println("Introduce una opción válida");
					}
				} else if (mando instanceof MandoAireAcondicionado) {
					switch(opc) {
					case 4 -> {
						if (((MandoAireAcondicionado)mando).aumentarVelocidad()) {
							System.out.println("Cambio realizado");
						} else {
							System.out.println("Has llegado al límite");
						}
					}
					case 5 -> {
						if (((MandoAireAcondicionado)mando).disminuirVelocidad()) {
							System.out.println("Cambio realizado");
						} else {
							System.out.println("Has llegado al límite");
						}
					}
					case 6 -> {
						System.out.println("Introduce la temperatura: ");
						temperatura = reader.nextDouble();
						reader.nextLine();
						((MandoAireAcondicionado)mando).setTemperatura(temperatura);
					}
					case 7 -> {
						System.out.println("Introduce el modo (frío o calor): ");
						modo = reader.nextLine();
						((MandoAireAcondicionado)mando).setModo(modo);
					}
					default -> System.out.println("Introduce una opción válida");
					}
				}
			}
			}
		} while(opc != 0);
		
		System.out.println("FIN DEL PROGRAMA");
		
		reader.close();
	}
	
	public static void menuComun(Mando mando) {
		System.out.println("1. Pulsar botón del mando");
		System.out.println("2. Información del mando");
		System.out.println("3. Modificar el precio");
		if (mando instanceof MandoTelevision || mando instanceof MandoMinicadenas) {
			System.out.println("4. Subir volumen");
			System.out.println("5. Bajar volumen");
			if (mando instanceof MandoTelevision) {
				System.out.println("6. Cambiar de canal");
			}
		} else if (mando instanceof MandoAspiradora || mando instanceof MandoAireAcondicionado) {
			System.out.println("4. Aumentar velocidad");
			System.out.println("5. Disminuir velocidad");
			if (mando instanceof MandoAireAcondicionado) {
				System.out.println("6. Modificar la temperatura");
				System.out.println("7. Modificar el modo (frío, calor)");
			}
		}
		System.out.println("0. Salir");
	}

	public static Mando crearMando(String tipo) {
		Mando mando = null;
		String tipoMando = tipo.toLowerCase();
		String modelo;
		double altura, anchura, precio;
		
		System.out.println("Introduce el modelo: ");
		modelo = reader.nextLine();
		System.out.println("Introduce la altura: ");
		altura = reader.nextDouble();
		System.out.println("Introduce la anchura: ");
		anchura = reader.nextDouble();
		System.out.println("Introduce el precio: ");
		precio = reader.nextDouble();
		reader.nextLine();
		
		try {
			switch(tipoMando) {
			case "aire acondicionado" -> {
				mando = new MandoAireAcondicionado(modelo, altura, anchura, precio);
			}
			case "aspiradora" -> {
				mando = new MandoAspiradora(modelo, altura, anchura, precio);
			}
			case "minicadenas" -> {
				mando = new MandoMinicadenas(modelo, altura, anchura, precio);
			}
			case "television", "televisión" -> {
				mando = new MandoTelevision(modelo, altura, anchura, precio);
			}
			}
		} catch (ErrorModelo e) {
			System.err.println(e);
			System.err.println(e.getMessage());
		} catch (ErrorAltura e) {
			System.err.println(e);
			System.err.println(e.getMessage());
		} catch (ErrorAnchura e) {
			System.err.println(e);
			System.err.println(e.getMessage());
		} catch (ErrorPrecio e) {
			System.err.println(e);
			System.err.println(e.getMessage());
		}
		
		return mando;
	}
}
