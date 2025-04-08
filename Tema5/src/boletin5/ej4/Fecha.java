package boletin5.ej4;

import java.util.Objects;

public class Fecha {
	private int dia;
	private int mes;
	private int año;

	public Fecha(int dia, int mes, int año) throws ErrorDayException, ErrorMonthException, ErrorYearException{
		if (fechaCorrecta(dia, mes, año)) {
			this.dia = dia;
			this.mes = mes;
			this.año = año;
		}
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnyo() {
		return año;
	}

	public void setAnño(int año) {
		if (año > 0) {
			this.año = año;
		}
	}

	public boolean esBisiesto(int año) {
		boolean esBisi = false;
		if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0) {
			esBisi = true;
		}
		return esBisi;
	}

	public boolean fechaCorrecta(int dia, int mes, int año) throws ErrorDayException, ErrorMonthException, ErrorYearException{
		boolean esCor = false;
		if (año > 0) {
			if (mes >= 1 && mes <= 12) {
				switch (mes) {
				case 1, 3, 5, 7, 8, 10, 12 -> {
					if (dia <= 31 && dia >= 1) {
						esCor = true;
					} else {
						throw new ErrorDayException();
					}
				}
				case 4, 6, 9, 11 -> {
					if (dia <= 30 && dia >= 1) {
						esCor = true;
					} else {
						throw new ErrorDayException();
					}
				}
				case 2 -> {
					if (esBisiesto(año)) {
						if (dia <= 29 && dia >= 1) {
							esCor = true;
						} else {
							throw new ErrorDayException();
						}
					} else if (dia <= 28 && dia >= 1) {
						esCor = true;
					} else {
						throw new ErrorDayException();
					}
				}
				}
			} else {
				throw new ErrorMonthException();
			}
		} else {
			throw new ErrorYearException();
		}
		return esCor;
	}

	public void diaSiguiente() {
		switch (this.mes) {
		case 1, 3, 5, 7, 8, 10, 12 -> {
			if (this.dia + 1 > 31) {
				this.dia = 1;
				if (this.mes == 12) {
					this.mes = 1;
					this.año += 1;
				} else {
					this.mes += 1;
				}
			} else {
				this.dia += 1;
			}
		}
		case 4, 6, 9, 11 -> {
			if (this.dia + 1 > 30) {
				this.dia = 1;
				this.mes += 1;
			} else {
				this.dia += 1;
			}
		}
		default -> {
			if (esBisiesto(this.año)) {
				if (this.dia + 1 > 29) {
					this.dia = 1;
					this.mes += 1;
				} else {
					this.dia += 1;
				}
			} else if (this.dia + 1 > 28) {
				this.dia = 1;
				this.mes += 1;
			} else {
				this.dia += 1;
			}
		}
		}
	}

	public String toString() {
		String cadena = "";
		if (dia < 10) {
			cadena += "0";
		}
		cadena += dia + "-";
		if (mes < 10) {
			cadena += "0";
		}
		cadena += mes + "-" + año;
		return cadena;
	}

	public int hashCode() {
		return Objects.hash(dia, mes, año);
	}

	public boolean equals(Object obj) {
		Fecha fecha2 = (Fecha) obj;
		boolean sonIgu = false;
		if (this.dia == fecha2.dia && this.mes == fecha2.mes && this.año == fecha2.año) {
			sonIgu = true;
		}
		return sonIgu;
	}
}
