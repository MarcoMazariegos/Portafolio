import java.util.*;
public class clase_principal {

	public static void main(String[] args) {
		
		String respuesta;
		
		nPersonas names = new nPersonas();
		nProductos prod = new nProductos();
		
		System.out.println("que quiere buscar?");
		System.out.println("Nombres de personas: ");
		System.out.println("Nombres de productos: ");
		
		do{
			Scanner pregunta= new Scanner(System.in);
			respuesta = pregunta.nextLine();
			
			if (respuesta.equalsIgnoreCase("personas")) {
				Scanner pregunta1= new Scanner(System.in);
				respuesta = pregunta1.nextLine();
				
				for(int i = 0; i<5;i++){
					if(respuesta.equalsIgnoreCase(names.nombres[i])){
						System.out.println("persona encontrada");
					}
				}
			}
			
			else if(respuesta.equalsIgnoreCase("productos")){
				Scanner pregunta2= new Scanner(System.in);
				respuesta = pregunta2.nextLine();
				
				for(int i = 0; i<5;i++){
					if(respuesta.equalsIgnoreCase(prod.productos[i])){
						System.out.println("producto encontrado");
					}
				}
				
			}else {
				System.out.println("invalido");
			}
		}while(1==2);
		
	

	}

}
