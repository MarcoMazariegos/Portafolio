package random;

import java.util.Random;

public class ejercicio {

	public static void main(String[] args) {
		// ejercicio
		
		String Nombres[]= new String [10];
		Nombres[0]="Jorge";
		Nombres[1]="Oliver";
		Nombres[2]="Melanie";
		Nombres[3]="Javier";
		Nombres[4]="Carlos";
		Nombres[5]="Gabriel";
		Nombres[6]="Jamileth";
		Nombres[7]="Esdras";
		Nombres[8]="Jose";
		Nombres[9]="Ruben";
		
		String Ingredientes[]= new String [10];
		Ingredientes[0]="camaron";
		Ingredientes[1]="cangrejo";
		Ingredientes[2]="concha";
		Ingredientes[3]="tomate";
		Ingredientes[4]="cebolla";
		Ingredientes[5]="salsa inglesa";
		Ingredientes[6]="hierba buena";
		Ingredientes[7]="pulpo";
		Ingredientes[8]="limon";
		Ingredientes[9]="galletas";
		
		System.out.println("para un ceviche se necesita los siguientes ingredientes: ");
		System.out.println("º"+Ingredientes[0]);
		System.out.println("º"+Ingredientes[1]);
		System.out.println("º"+Ingredientes[2]);
		System.out.println("º"+Ingredientes[3]);
		System.out.println("º"+Ingredientes[4]);
		System.out.println("º"+Ingredientes[5]);
		System.out.println("º"+Ingredientes[6]);
		System.out.println("º"+Ingredientes[7]);
		System.out.println("º"+Ingredientes[8]);
		System.out.println("º"+Ingredientes[9]);
		
		
		Random numero = new Random();
		int numeroAleatorio= numero.nextInt(10);
		int numeroalAzar = numero.nextInt(10);
		System.out.println("a "+Nombres[numeroAleatorio]+" le toco traer lo siguiente: "+Ingredientes[numeroalAzar]);
	
				
	}

}
