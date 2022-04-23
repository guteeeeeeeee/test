package domain;

import excepciones.ContrasenaInvalidaException;
import excepciones.NombreInvalido;

public class Usuario {
	private String nombre;
	private String contra;
	
	
	public Usuario(String nombre,String contra) throws NombreInvalido, ContrasenaInvalidaException {
		this.setNombre(nombre);
		this.setContra(contra);
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) throws NombreInvalido { 
		if(nombre!=null) {
			if(!nombre.isEmpty())
				this.nombre = nombre;
			else
				throw new NombreInvalido("nombre vacio");
		}else
			throw new NombreInvalido("nombre null");
	}


	public String getContra() {
		return contra;
	}


	public void setContra(String contra) throws ContrasenaInvalidaException {
		if(contra!=null) {
			if(contra.length()>6) {
				if(Character.isLetter(contra.charAt(0)))
					this.contra = contra;
				else
					throw new ContrasenaInvalidaException("contraseña no empieza con letra");
			}else
				throw new ContrasenaInvalidaException("contraseña menor a 6 de longitud");
		}else
			throw new ContrasenaInvalidaException("contraseña null");
	}
	
}
