package prueba;

import domain.Usuario;
import excepciones.*;

public class Prueba {

	public static void main(String[] args) {
		try {
			Usuario usuario1 = new Usuario("guty","cubata12");
			System.out.println("usuario creado correctamente: " + usuario1.getNombre() + " " + usuario1.getContra());
		} catch (NombreInvalido e) {
			System.out.println(e.getMessage());
			System.out.println("ingresar nuevo nombre");
		} catch (ContrasenaInvalidaException e) {
			System.out.println(e.getMessage());
			System.out.println("ingresar nueva contraseña");
		}
	}

}
