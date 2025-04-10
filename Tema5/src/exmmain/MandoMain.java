package exmmain;

import java.util.ArrayList;
import java.util.List;

import exm.Mando;
import exm.MandoAireAcondicionado;
import exm.MandoAspiradora;
import exm.MandoMinicadenas;
import exm.MandoTelevision;
import exmexcepciones.ErrorAltura;
import exmexcepciones.ErrorAnchura;
import exmexcepciones.ErrorModelo;
import exmexcepciones.ErrorPrecio;

public class MandoMain {

	public static void main(String[] args) {
		
		List<Mando> mandos = new ArrayList<Mando>();
		
		try {
			Mando m1 = new MandoAireAcondicionado("Aire1", 2.3, 2.3, 10.2);
			mandos.add(m1);
			Mando m2 = new MandoAireAcondicionado("Aire2", 6.2, 9.1, 8.1);
			mandos.add(m2);
			Mando m3 = new MandoAireAcondicionado("Aire3", 7.7, 8.1, 7.6);
			mandos.add(m3);
			
			Mando m4 = new MandoTelevision("Tv1", 2.3, 2.3, 10.2);
			mandos.add(m4);
			Mando m5 = new MandoTelevision("Tv2", 6.2, 9.1, 8.1);
			mandos.add(m5);
			Mando m6 = new MandoTelevision("Tv3", 7.7, 8.1, 7.6);
			mandos.add(m6);
			
			Mando m7 = new MandoAspiradora("Aspiradora1", 2.3, 2.3, 10.2);
			mandos.add(m7);
			Mando m8 = new MandoAspiradora("Aspiradora2", 6.2, 9.1, 8.1);
			mandos.add(m8);
			
			Mando m9 = new MandoMinicadenas("Mini1", 2.3, 2.3, 10.2);
			mandos.add(m9);
			Mando m10 = new MandoMinicadenas("Mini2", 6.2, 9.1, 8.1);
			mandos.add(m10);
		} catch (ErrorModelo e) {
			System.err.println(e);
			System.err.println(e.getMessage());
		} catch (ErrorAnchura e) {
			System.err.println(e);
			System.err.println(e.getMessage());		
		} catch (ErrorAltura e) {
			System.err.println(e);
			System.err.println(e.getMessage());
		} catch (ErrorPrecio e) {
			System.err.println(e);
			System.err.println(e.getMessage());		
		}
		
		for(Mando mando: mandos) {
			mando.onOff();
			
			if (mando instanceof MandoTelevision) {
				System.out.println(mando);
				((MandoTelevision)mando).cambiarCanal(5);
				System.out.println(mando);
				((MandoTelevision)mando).subirVolumne();
				System.out.println(mando);
				((MandoTelevision)mando).bajarVolumen();
				System.out.println(mando);
			} else if (mando instanceof MandoMinicadenas) {
				System.out.println(mando);
				((MandoMinicadenas)mando).subirVolumne();
				System.out.println(mando);
				((MandoMinicadenas)mando).bajarVolumen();
				System.out.println(mando);
			} else if (mando instanceof MandoAspiradora) {
				System.out.println(mando);
				((MandoAspiradora)mando).aumentarVelocidad();
				System.out.println(mando);
				((MandoAspiradora)mando).disminuirVelocidad();
				System.out.println(mando);
			} else if (mando instanceof MandoAireAcondicionado) {
				System.out.println(mando);
				((MandoAireAcondicionado)mando).setTemperatura(5.3);
				System.out.println(mando);
				((MandoAireAcondicionado)mando).setModo("calor");
				System.out.println(mando);
			}
			
			mando.onOff();
		}
	}
}
