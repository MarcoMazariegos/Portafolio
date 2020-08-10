import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class conversor2 extends JFrame implements ActionListener{
	
	JMenuBar barra;   /*declaraciones de objetos de tipo frame y java*/
	JMenu menu;
	JMenuItem Km, Hm, Dm, M ,dm ,cm, mm;
	JTextField valor1;
	JLabel mensaje, mensaje1;
	JLabel  resultado, resultado2, resultado3, resultado4, resultado5,
	resultado6, peticion, version;
	JButton volver;
	
	String dato;
	medidas med1 = new medidas();
	public conversor2() {
		
        setLayout( null);
        
        Font fuente= new Font("Tahoma", Font.BOLD,10); /*base de datos de tipo de fuente de letra
        y de colores*/
		Font fuente2= new Font("Tahoma", Font.BOLD,11);
		Font fuente3 = new Font("Agency fb", Font.BOLD, 15);
		
		Color verde = new Color(32, 178, 170);
		Color celeste = new Color(64, 224, 208);
		Color celeste2 = new Color(64, 224, 208);
		Color azul = new Color(95, 158, 160); 
		
		this.getContentPane().setBackground(verde); /*extrae el panel y le da color de fondo*/
		
		barra = new JMenuBar(); /*declaracion de la barra de menu*/
		setJMenuBar(barra);
		barra.setBackground(celeste);
		menu = new JMenu("MEDIDAS");
		menu.setFont(fuente);
		barra.add(menu);
		
		Km = new JMenuItem("Kilometro"); /*declaracion de lo items de menu*/
		Km.setBackground(celeste2);
		Km.setForeground(azul);
		Km.setFont(fuente2);
     	Km.addActionListener(this);
		menu.add(Km);
		
		Hm = new JMenuItem("Hectometro"); /*declaracion de lo items de menu*/
		Hm.setBackground(celeste2);
		Hm.setForeground(azul);
		Hm.setFont(fuente2);
		Hm.addActionListener(this);
		menu.add(Hm);
		
		Dm = new JMenuItem("Decametro"); /*declaracion de lo items de menu*/
		Dm.setBackground(celeste2);
		Dm.setForeground(azul);
		Dm.setFont(fuente2);
     	Dm.addActionListener(this);
		menu.add(Dm);
		
		M = new JMenuItem("Metro"); /*declaracion de lo items de menu*/
		M.setBackground(celeste2);
	    M.setForeground(azul);
	    M.setFont(fuente2);
		M.addActionListener(this);
		menu.add(M);
		
		dm = new JMenuItem("decimetro"); /*declaracion de lo items de menu*/
		dm.setBackground(celeste2);
		dm.setForeground(azul);
		dm.setFont(fuente2);
		dm.addActionListener(this);
		menu.add(dm);
		
		cm = new JMenuItem("centimetro"); /*declaracion de lo items de menu*/
		cm.setBackground(celeste2);
		cm.setForeground(azul);
     	cm.addActionListener(this);
		menu.add(cm);
		
		mm = new JMenuItem("milimetro"); /*declaracion de lo items de menu*/
		mm.setBackground(celeste2);
		mm.setForeground(azul);
		mm.setFont(fuente2);
		mm.addActionListener(this);
		menu.add(mm);
		
		mensaje = new JLabel("Escoge la medida que introduciras"); /*declaracion de las etiquetas*/
		mensaje.setHorizontalAlignment(SwingConstants.CENTER);
		mensaje.setFont(fuente3);
		mensaje.setBounds(0, 20,300, 50);
		add(mensaje);
		
		mensaje1 = new JLabel("valor a converir: "); /*declaracion de las etiquetas*/
		mensaje1.setBounds(20, 75, 100, 20);
		mensaje1.setFont(fuente3);
		add(mensaje1);
		
		version = new JLabel("V 0.1");
		version.setBounds(5, 320, 300, 20);
		version.setForeground(Color.GRAY);
		version.setFont(fuente2);
		add(version);
		
		valor1 = new JTextField(); /*declaracion de la caja donde se extrae el valor a convertir*/
		valor1.setBounds(120, 75, 60, 20);
		add(valor1);
		
		volver = new JButton("VOLVER"); /*boton que mata el proceso*/
		volver.setBounds(150, 300, 100, 20);
		volver.setBackground(celeste);
		volver.setFont(fuente);
		add(volver);
		volver.addActionListener(this);
		
		peticion = new JLabel();
		peticion.setBounds(60, 150 , 250, 20);
		add(peticion);
				
				 
		resultado = new JLabel(); /*etiqueta de respuesta*/
		resultado.setBounds(60, 170, 200, 20);
		add(resultado);
		
		resultado2 = new JLabel(); /*etiqueta de respuesta*/
		resultado2.setBounds(60, 190, 200, 20);
		add(resultado2);
		
		resultado3 = new JLabel(); /*etiqueta de respuesta*/
		resultado3.setBounds(60, 210, 200, 20);
		add(resultado3);
		
		resultado4 = new JLabel(); /*etiqueta de respuesta*/
		resultado4.setBounds(60, 230, 200, 20);
		add(resultado4);
		
		resultado5 = new JLabel(); /*etiqueta de respuesta*/
		resultado5.setBounds(60, 250, 200, 20);
		add(resultado5);
		
		resultado6 = new JLabel(); /*etiqueta de respuesta*/
		resultado6.setBounds(60, 270, 200, 20);
		add(resultado6);
		
		
	}
	
	public void actionPerformed(ActionEvent convercion) {
		
		if(convercion.getSource()== Km){ /*condicional del evento que ejecuta las conversiones*/
			dato = valor1.getText();
			
			if(dato.equals("")) {
				peticion.setText("ingresa valor");
			}
			else {
				peticion.setText("");
				resultado.setText("Hectometros: " + med1.Hectogramos(dato) );
				resultado2.setText("Decametros: " + med1.Decagramos(dato) );
				resultado3.setText("Metros: " + med1.gramos(dato));
				resultado4.setText("decimetro: "+ med1.decigramos(dato));
				resultado5.setText("centimetro: " + med1.centigramos(dato));
				resultado6.setText("milimetros: " + med1.miligramos(dato));			
			}		
		}
		
		if(convercion.getSource()== Hm){ /*condicional del evento que ejecuta las conversiones*/
			dato = valor1.getText();	
			if(dato.equals("")) {
				peticion.setText("ingresa valor");
			}
			else {
				peticion.setText("");
				resultado.setText("Kilometros: " + med1.Kilogramos(dato) );
				resultado2.setText("Decametros: " + med1.Decagramos2(dato) );
				resultado3.setText("Metros: " + med1.gramos2(dato));
				resultado4.setText("decimetro: "+ med1.decigramos2(dato));
				resultado5.setText("centimetro: " + med1.centigramos2(dato));
				resultado6.setText("milimetros: " + med1.miligramos2(dato));
			}
		}
			
		if(convercion.getSource()== Dm){ /*condicional del evento que ejecuta las conversiones*/
			dato = valor1.getText();		
			if(dato.equals("")) {
				peticion.setText("ingresa valor");
			}
			else {
				peticion.setText("");
				resultado.setText("Kilometros: " + med1.Kilogramos2(dato) );
				resultado2.setText("Hectometros: " + med1.Hectogramos2(dato) );
				resultado3.setText("Metros: " + med1.gramos3(dato));
				resultado4.setText("decimetro: "+ med1.decigramos3(dato));
				resultado5.setText("centimetro: " + med1.centigramos3(dato));
				resultado6.setText("milimetros: " + med1.miligramos3(dato));		
			}		
		}
		
		if(convercion.getSource()== M){ /*condicional del evento que ejecuta las conversiones*/
			dato = valor1.getText();		
			if(dato.equals("")) {
				peticion.setText("ingresa valor");
			}
			else {
				peticion.setText("");
				resultado.setText("Kilometros: " + med1.Kilogramos3(dato) );
				resultado2.setText("Hectometros: " + med1.Hectogramos3(dato) );
				resultado3.setText("Decametros: " + med1.Decagramos3(dato));
				resultado4.setText("decimetro: "+ med1.decigramos4(dato));
				resultado5.setText("centimetro: " + med1.centigramos4(dato));
				resultado6.setText("milimetros: " + med1.miligramos4(dato));		
			}		
		}
		if(convercion.getSource()== dm){ /*condicional del evento que ejecuta las conversiones*/
			dato = valor1.getText();		
			if(dato.equals("")) {
				peticion.setText("ingresa valor");
			}
			else {
				peticion.setText("");
				resultado.setText("Kilometros: " + med1.Kilogramos4(dato) );
				resultado2.setText("Hectometros: " + med1.Hectogramos4(dato) );
				resultado3.setText("Decametros: " + med1.Decagramos4(dato));
				resultado4.setText("Metros: "+ med1.gramos4(dato));
				resultado5.setText("centimetro: " + med1.centigramos5(dato));
				resultado6.setText("milimetros: " + med1.miligramos5(dato));		
			}		
		}
		if(convercion.getSource()== cm){ /*condicional del evento que ejecuta las conversiones*/
			dato = valor1.getText();
			
			if(dato.equals("")) {
				peticion.setText("ingresa valor");
			}
			else {
				peticion.setText("");
				resultado.setText("Kilometros: " + med1.Kilogramos5(dato) );
				resultado2.setText("Hectometros: " + med1.Hectogramos5(dato) );
				resultado3.setText("Decametros: " + med1.Decagramos5(dato));
				resultado4.setText("Metros: "+ med1.gramos5(dato));
				resultado5.setText("decimetro: " + med1.decigramos5(dato));
				resultado6.setText("milimetros: " + med1.miligramos6(dato));		
			}
		}
		if(convercion.getSource()== mm){ /*condicional del evento que ejecuta las conversiones*/
			dato = valor1.getText();
			
			if(dato.equals("")) {
				peticion.setText("ingresa valor");
			}
			else {
				peticion.setText("");
				resultado.setText("Kilometros: " + med1.Kilogramos6(dato) );
				resultado2.setText("Hectometros: " + med1.Hectogramos6(dato) );
				resultado3.setText("Decametros: " + med1.Decagramos6(dato));
				resultado4.setText("Metros: "+ med1.gramos6(dato));
				resultado5.setText("decimetro: " + med1.decigramos6(dato));
				resultado6.setText("centimetro: " + med1.centigramos6(dato));		
			}		
		}
		if(convercion.getSource()==volver) { /*condicional que ejecuta la accion de regrear a la pagina 
		principal y mata este proceso de ventana en ram*/
			eleccion instancia = new eleccion();
			
			/*DIMENSIONES DE NUESTRA VENTANA*/
			instancia.setBounds(0, 0, 300, 400); /*EN DONDE QUIERES QUE APAREZCA LA VENTANA*/
			instancia.setVisible(true); /*QUE SEA VISIBLE LA VENTANA*/
			instancia.setResizable(false);/*RESPETA LAS MEDIDAS*/
			instancia.setLocationRelativeTo(null); /*HACE QUE APAREZCA LA VENTANA CENTRADA*/
			
			this.dispose();
			
		}
	}

	public static void main(String[] args) {
		conversor2 instancia3 = new conversor2();
		
		/*DIMENSIONES DE NUESTRA VENTANA*/
		instancia3.setBounds(0, 0, 300, 400); /*EN DONDE QUIERES QUE APAREZCA LA VENTANA*/
		instancia3.setVisible(true); /*QUE SEA VISIBLE LA VENTANA*/
		instancia3.setResizable(false);/*RESPETA LAS MEDIDAS*/
		instancia3.setLocationRelativeTo(null); /*HACE QUE APAREZCA LA VENTANA CENTRADA*/
	}

}
