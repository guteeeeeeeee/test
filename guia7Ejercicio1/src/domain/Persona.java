package domain;

import java.util.Objects;

public class Persona implements Comparable {
	private String nombre;
	private String apellido;
	private String direccion;
	
	public Persona(String nombre, String apellido, String direccion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(apellido, nombre);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) //son la misma referencia
			return true;
		if (obj == null) //el parametro es null
			return false;
		if (getClass() != obj.getClass()) //si son distintas clases
			return false;
		Persona other = (Persona) obj; //si son la misma clase
		return Objects.equals(this.apellido, other.apellido) && Objects.equals(this.nombre, other.nombre);
	}
	
	@Override
	public int compareTo(Object o) {
		Persona comp = (Persona) o;
		int resultado = this.getApellido().compareToIgnoreCase(comp.getApellido());
		if(resultado==0) 
			resultado = this.getNombre().compareToIgnoreCase(comp.getNombre());
		return resultado;
	}
	@Override
	public String toString() {
		return "apellido=" + apellido + ", nombre=" + nombre + ", direccion=" + direccion ;
	}
	
}	
