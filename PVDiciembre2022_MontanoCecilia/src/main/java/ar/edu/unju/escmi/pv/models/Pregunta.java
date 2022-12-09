package ar.edu.unju.escmi.pv.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Pregunta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Integer CodPregunta;
	
	private String enunuciado;
	private String nivel;
	private String opcion01;
	private String opcion02;
	private String opcion03;
	private String opcionCorrecta;
	private int puntaje;
	public Integer getCodPregunta() {
		return CodPregunta;
	}
	public void setCodPregunta(Integer codPregunta) {
		CodPregunta = codPregunta;
	}
	public String getEnunuciado() {
		return enunuciado;
	}
	public void setEnunuciado(String enunuciado) {
		this.enunuciado = enunuciado;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public String getOpcion01() {
		return opcion01;
	}
	public void setOpcion01(String opcion01) {
		this.opcion01 = opcion01;
	}
	public String getOpcion02() {
		return opcion02;
	}
	public void setOpcion02(String opcion02) {
		this.opcion02 = opcion02;
	}
	public String getOpcion03() {
		return opcion03;
	}
	public void setOpcion03(String opcion03) {
		this.opcion03 = opcion03;
	}
	public String getOpcionCorrecta() {
		return opcionCorrecta;
	}
	public void setOpcionCorrecta(String opcionCorrecta) {
		this.opcionCorrecta = opcionCorrecta;
	}
	public int getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	public Pregunta(String enunuciado, String nivel, String opcion01, String opcion02, String opcion03,
			String opcionCorrecta, int puntaje) {
		super();
		this.enunuciado = enunuciado;
		this.nivel = nivel;
		this.opcion01 = opcion01;
		this.opcion02 = opcion02;
		this.opcion03 = opcion03;
		this.opcionCorrecta = opcionCorrecta;
		this.puntaje = puntaje;
	}
	public Pregunta() {
		super();
	}
	
	
}
