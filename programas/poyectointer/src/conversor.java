import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class conversor extends JFrame implements ActionListener {
	
	JMenuBar barra;  /*declaraciones de objetos de tipo frame y java*/
	JMenu menu, menu2;
	JMenuItem Kg, Hg, Dg, g, dg, cg, mg;
	JTextField valor1;
	JLabel mensaje, mensaje1, resultado, resultado2, resultado3, resultado4, resultado5, 
	resultado6, peticion, version;
	JButton volver;
	
	String dato;
	
	medidas med = new medidas(); /*instancia de la clase medidas, que nos brinda las operaciones y respuestas
	del dato dado*/
	public conversor() {	
		setLayout( null);
		
		Font fuente= new Font("Tahoma", Font.BOLD,10); /*base de datos de tipos de letra y colores*/
		Font fuente2= new Font("Tahoma", Font.BOLD,11);
		Font fuente3 = new Font("Agency fb", Font.BOLD, 15);
		Color verde = new Color(32, 178, 170);
		Color celeste = new Color(64, 224, 208);
		Color celeste2 = new Color(64, 224, 208);
		Color azul = new Color(95, 158, 160); 
		
		this.getContentPane().setBackground(verde); /*extrae el contenido de la ventana y le da un color de fondo*/
		
		barra = new JMenuBar(); /**declaracion de barra de menu*/
		setJMenuBar(barra);
		barra.setBackground(celeste);
		menu = new JMenu("MEDIDAS");
		menu.setFont(fuente);
		barra.add(menu);
		
		Kg = new JMenuItem("Kilogramo"); /*declaracion de las opciones del menu de eleccion*/
		Kg.setBackground(celeste2);
		Kg.setForeground(azul);
		Kg.setFont(fuente2);
     	Kg.addActionListener(this);
		menu.add(Kg);
		
		Hg = new JMenuItem("Hectogramo"); /*declaracion de las opciones del menu de eleccion*/
		Hg.setBackground(celeste2);
		Hg.setForeground(azul);
		Hg.setFont(fuente2);
		Hg.addActionListener(this);
		menu.add(Hg);
		
		Dg = new JMenuItem("Decagramo"); /*declaracion de las opciones del menu de eleccion*/
		Dg.setBackground(celeste2);
		Dg.setForeground(azul);
		Dg.setFont(fuente2);
     	Dg.addActionListener(this);
		menu.add(Dg);
		
		g = new JMenuItem("Gramo"); /*declaracion de las opciones del menu de eleccion*/
		g.setBackground(celeste2);
	    g.setForeground(azul);
	    g.setFont(fuente2);
		g.addActionListener(this);
		menu.add(g);
		
		dg = new JMenuItem("decigramo"); /*declaracion de las opciones del menu de eleccion*/
		dg.setBackground(celeste2);
		dg.setForeground(azul);
		dg.setFont(fuente2);
		dg.addActionListener(this);
		menu.add(dg);
		
		cg = new JMenuItem("centigramo");/*declaracion de las opciones del menu de eleccion*/
		cg.setBackground(celeste2);
		cg.setForeground(azul);
		cg.setFont(fuente2);
     	cg.addActionListener(this);
		menu.add(cg);
		
		mg = new JMenuItem("miligramo"); /*declaracion de las opciones del menu de eleccion*/
		mg.setBackground(celeste2);
		mg.setForeground(azul);
		mg.setFont(fuente2);
		mg.addActionListener(this);
		menu.add(mg);
		
		mensaje = new JLabel("Escoge la medida que introduciras"); /*declaracion de las instrucciones en una etiqueta*/
		mensaje.setHorizontalAlignment(SwingConstants.CENTER);
		mensaje.setFont(fuente3);
		mensaje.setBounds(0, 20,300, 50);
		add(mensaje);
		
		mensaje1 = new JLabel("valor a converir: "); /*etiqueta*/
		mensaje1.setBounds(20, 75, 100, 20);
		mensaje1.setFont(fuente3);
		add(mensaje1);
		
		version = new JLabel("V 0.1");
		version.setBounds(5, 320, 300, 20);
		version.setForeground(Color.GRAY);
		version.setFont(fuente2);
		add(version);
		
		valor1 = new JTextField();
		valor1.setBounds(120, 75, 60, 20);
		add(valor1);
		
		volver = new JButton("VOLVER"); /*declaracion del boton para matar proceso y regresar al panel principal*/
		volver.setBounds(150, 300, 100, 20);
		volver.setBackground(celeste);
		volver.setFont(fuente);
		add(volver);
		volver.addActionListener(this);
		
		peticion = new JLabel(); /*etiqueta de peticion*/
		peticion.setBounds(60, 150 , 250, 20);
		add(peticion);
				
				
		resultado = new JLabel(); /*etiqueta que da el resultado*/
		resultado.setBounds(60, 170, 200, 20);
		add(resultado);
		
		resultado2 = new JLabel(); /*etiqueta que de el resultado*/
		resultado2.setBounds(60, 190, 200, 20);
		add(resultado2);
		
		resultado3 = new JLabel(); /*etiqueta que de el resultado*/
		resultado3.setBounds(60, 210, 200, 20);
		add(resultado3);
		
		resultado4 = new JLabel(); /*etiqueta que de el resultado*/
		resultado4.setBounds(60, 230, 200, 20);
		add(resultado4);
		
		resultado5 = new JLabel(); /*etiqueta que de el resultado*/
		resultado5.setBounds(60, 250, 200, 20);
		add(resultado5);
		
		resultado6 = new JLabel(); /*etiqueta que de el resultado*/
		resultado6.setBounds(60, 270, 200, 20);
		add(resultado6);
			
	}
	
	public void actionPerformed(ActionEvent convercion) {
		
		if(convercion.getSource()== Kg){ /*evento que declara la accion del item de menu y haga la conversion*/
			dato = valor1.getText();
			
			if(dato.equals("")) {
				peticion.setText("ingresa valor");
			}
			else {
				peticion.setText("");
				resultado.setText("Hectogramos: " + med.Hectogramos(dato) );
				resultado2.setText("Decagramos: " + med.Decagramos(dato) );
				resultado3.setText("Gramos: " + med.gramos(dato));
				resultado4.setText("decigramos: "+ med.decigramos(dato));
				resultado5.setText("centigramos: " + med.centigramos(dato));
				resultado6.setText("miligramos: " + med.miligramos(dato));			
			}		
		}
		
		if(convercion.getSource()== Hg){ /*evento que declara la accion del item de menu y haga la conversion*/
			dato = valor1.getText();	
			if(dato.equals("")) {
				peticion.setText("ingresa valor");
			}
			else {
				peticion.setText("");
				resultado.setText("Kilogramos: " + med.Kilogramos(dato) );
				resultado2.setText("Decagramos: " + med.Decagramos2(dato) );
				resultado3.setText("Gramos: " + med.gramos2(dato));
				resultado4.setText("decigramos: "+ med.decigramos2(dato));
				resultado5.setText("centigramos: " + med.centigramos2(dato));
				resultado6.setText("miligramos: " + med.miligramos2(dato));
			}
		}
			
		if(convercion.getSource()== Dg){ /*evento que declara la accion del item de menu y haga la conversion*/
			dato = valor1.getText();		
			if(dato.equals("")) {
				peticion.setText("ingresa valor");
			}
			else {
				peticion.setText("");
				resultado.setText("Kilogramos: " + med.Kilogramos2(dato) );
				resultado2.setText("Hectogramos: " + med.Hectogramos2(dato) );
				resultado3.setText("Gramos: " + med.gramos3(dato));
				resultado4.setText("decigramos: "+ med.decigramos3(dato));
				resultado5.setText("centigramos: " + med.centigramos3(dato));
				resultado6.setText("miligramos: " + med.miligramos3(dato));		
			}		
		}
		
		if(convercion.getSource()== g){ /*evento que declara la accion del item de menu y haga la conversion*/
			dato = valor1.getText();		
			if(dato.equals("")) {
				peticion.setText("ingresa valor");
			}
			else {
				peticion.setText("");
				resultado.setText("Kilogramos: " + med.Kilogramos3(dato) );
				resultado2.setText("Hectogramos: " + med.Hectogramos3(dato) );
				resultado3.setText("Decagramos: " + med.Decagramos3(dato));
				resultado4.setText("decigramos: "+ med.decigramos4(dato));
				resultado5.setText("centigramos: " + med.centigramos4(dato));
				resultado6.setText("miligramos: " + med.miligramos4(dato));		
			}		
		}
		if(convercion.getSource()== dg){ /*evento que declara la accion del item de menu y haga la conversion*/
			dato = valor1.getText();		
			if(dato.equals("")) {
				peticion.setText("ingresa valor");
			}
			else {
				peticion.setText("");
				resultado.setText("Kilogramos: " + med.Kilogramos4(dato) );
				resultado2.setText("Hectogramos: " + med.Hectogramos4(dato) );
				resultado3.setText("Decagramos: " + med.Decagramos4(dato));
				resultado4.setText("Gramos: "+ med.gramos4(dato));
				resultado5.setText("centigramos: " + med.centigramos5(dato));
				resultado6.setText("miligramos: " + med.miligramos5(dato));		
			}		
		}
		if(convercion.getSource()== cg){ /*evento que declara la accion del item de menu y haga la conversion*/
			dato = valor1.getText();
			
			if(dato.equals("")) {
				peticion.setText("ingresa valor");
			}
			else {
				peticion.setText("");
				resultado.setText("Kilogramos: " + med.Kilogramos5(dato) );
				resultado2.setText("Hectogramos: " + med.Hectogramos5(dato) );
				resultado3.setText("Decagramos: " + med.Decagramos5(dato));
				resultado4.setText("Gramos: "+ med.gramos5(dato));
				resultado5.setText("decigramos: " + med.decigramos5(dato));
				resultado6.setText("miligramos: " + med.miligramos6(dato));		
			}
		}
		if(convercion.getSource()== mg){ /*evento que declara la accion del item de menu y haga la conversion*/
			dato = valor1.getText();
			
			if(dato.equals("")) {
				peticion.setText("ingresa valor");
			}
			else {
				peticion.setText("");
				resultado.setText("Kilogramos: " + med.Kilogramos6(dato) );
				resultado2.setText("Hectogramos: " + med.Hectogramos6(dato) );
				resultado3.setText("Decagramos: " + med.Decagramos6(dato));
				resultado4.setText("Gramos: "+ med.gramos6(dato));
				resultado5.setText("decigramos: " + med.decigramos6(dato));
				resultado6.setText("centigramos: " + med.centigramos6(dato));		
			}		
		}
		if(convercion.getSource()==volver) { /*evento que declara la accion del boton y regrese al panel principal*/
			eleccion instancia = new eleccion();
			
			/*DIMENSIONES DE NUESTRA VENTANA*/
			instancia.setBounds(0, 0, 300, 400); /*EN DONDE QUIERES QUE APAREZCA LA VENTANA*/
			instancia.setVisible(true); /*QUE SEA VISIBLE LA VENTANA*/
			instancia.setResizable(false);/*RESPETA LAS MEDIDAS*/
			instancia.setLocationRelativeTo(null); /*HACE QUE APAREZCA LA VENTANA CENTRADA*/
			
			this.dispose(); /*que mate el proceso de esta ventana*/
			
		}
		
		
	}
	public static void main(String[] args) {
		conversor instancia2 = new conversor();
		
		/*DIMENSIONES DE NUESTRA VENTANA*/
		instancia2.setBounds(0, 0, 300, 400); /*EN DONDE QUIERES QUE APAREZCA LA VENTANA*/
		instancia2.setVisible(true); /*QUE SEA VISIBLE LA VENTANA*/
		instancia2.setResizable(false);/*RESPETA LAS MEDIDAS*/
		instancia2.setLocationRelativeTo(null); /*HACE QUE APAREZCA LA VENTANA CENTRADA*/
		
	}

}