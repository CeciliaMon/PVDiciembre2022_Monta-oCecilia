package ar.edu.unju.escmi.pv.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Usuario {
	
	@Id
	private Long dni;
	
	private String apellido;
	private String nombre;
	private LocalDate fecha_de_nacimiento;
	private String password;
	private String TipoUusuario;
	public Long getDni() {
		return dni;
	}
	public void setDni(Long dni) {
		this.dni = dni;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFecha_de_nacimiento() {
		return fecha_de_nacimiento;
	}
	public void setFecha_de_nacimiento(LocalDate fecha_de_nacimiento) {
		this.fecha_de_nacimiento = fecha_de_nacimiento;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTipoUusuario() {
		return TipoUusuario;
	}
	public void setTipoUusuario(String tipoUusuario) {
		TipoUusuario = tipoUusuario;
	}
	public Usuario(Long dni, String apellido, String nombre, LocalDate fecha_de_nacimiento, String password,
			String tipoUusuario) {
		super();
		this.dni = dni;
		this.apellido = apellido;
		this.nombre = nombre;
		this.fecha_de_nacimiento = fecha_de_nacimiento;
		this.password = password;
		TipoUusuario = tipoUusuario;
	}
	public Usuario() {
		super();
	}
	
	
	
}
