import java.util.*;

public class bucles_2 {

	public static void main(String[] args) {
		// tipos de bucles y condicionales
		
		Scanner pregunta_genero = new Scanner(System.in);
		System.out.println("ingresa la letra de tu genero");
		System.out.println("M");
		System.out.println("F");
		String respuesta_genero = pregunta_genero.nextLine();
		
		if(respuesta_genero.equalsIgnoreCase("M")) {
			System.out.println("hay partido mañana");
		}
		else if(respuesta_genero.equalsIgnoreCase("F")) {
			System.out.println("hoy pasaran dos capitulos de la novela");
		}
		else {
			System.out.println("la letra ingresada no es valida");
		}
		

	}

}
