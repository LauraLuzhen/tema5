package exm;

import exmexcepciones.ErrorAltura;
import exmexcepciones.ErrorAnchura;
import exmexcepciones.ErrorCanal;
import exmexcepciones.ErrorModelo;
import exmexcepciones.ErrorPrecio;
import exmexcepciones.ErrorVolumen;
import exminterfaces.Volumen;

public class MandoTelevision extends Mando implements Volumen{
	private int volumen = 0;
	private int canal = 1;
	
	public MandoTelevision(String modelo, double altura, double anchura, double precio) throws ErrorModelo, ErrorAltura, ErrorAnchura, ErrorPrecio {
		super(modelo, altura, anchura, precio);
	}
	
	public int getVolumen() {
		return volumen;
	}

	public int getCanal() {
		return canal;
	}

	public boolean cambiarCanal(int canal) throws ErrorCanal{
		boolean cambiado = false;
		if (canal >= 1) {
			if (this.canal != canal) {
				this.canal = canal;
				cambiado = true;
			}
		} else {
			throw new ErrorCanal();
		}
		return cambiado;
	}

	@Override
	public boolean subirVolumne() throws ErrorVolumen{
		boolean realizado = false;
		if (volumen < 100) {
			this.volumen += 5;
		} else {
			throw new ErrorVolumen();
		}
		return realizado;
	}

	@Override
	public boolean bajarVolumen() throws ErrorVolumen{
		boolean realizado = false;
		if (volumen > 0) {
			this.volumen -= 5;
		} else {
			throw new ErrorVolumen();
		}
		return realizado;
	}

	@Override
	public String toString() {
		return super.toString() + ", volumen " + volumen + ", canal " + canal;
	}
}
