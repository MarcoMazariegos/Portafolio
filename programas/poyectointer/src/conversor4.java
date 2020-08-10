import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class conversor4 extends JFrame implements ActionListener {
	
	JMenuBar barra;  /*declaracion de objetos de tipo Frame y java*/
	JMenu menu;
	JMenuItem aire, hielo, agua, aguamar ,aluminio ,hierro, cobre, mercurio, oro;
	JLabel mensaje, mensaje1, peticion;
	JLabel resultado, version;
	JTextField valor1;
	String dato;
	JButton volver;
	
	medidasdensidad dens = new medidasdensidad(); /*instancia de la clase que retorna datos*/
	public conversor4() {
		setLayout(null);
		
		Font fuente= new Font("Tahoma", Font.BOLD,10);
		Font fuente2= new Font("Tahoma", Font.BOLD,11); /*base de datos de tipo de fuente y colores*/
		Font fuente3 = new Font("Agency fb", Font.BOLD, 15);
		
		Color verde = new Color(32, 178, 170);
		Color celeste = new Color(64, 224, 208);
		Color celeste2 = new Color(64, 224, 208);
		Color azul = new Color(95, 158, 160); 
		
		this.getContentPane().setBackground(verde); /*extrae el panel y da color de fondo*/
		
		barra = new JMenuBar(); /*declaracion de barra de menu*/
		setJMenuBar(barra);
		barra.setBackground(celeste);
		menu = new JMenu("MEDIDAS");
		menu.setFont(fuente);
		barra.add(menu);
		
		aire = new JMenuItem("Aire"); /*declaracion de items de menu*/
		aire.setBackground(celeste2);
		aire.setForeground(azul);
		aire.setFont(fuente2);
		aire.addActionListener(this);
		menu.add(aire);
		
		hielo = new JMenuItem("Hielo"); /*declaracion de items de menu*/
		hielo.setBackground(celeste2);
		hielo.setForeground(azul);
		hielo.setFont(fuente2);
		hielo.addActionListener(this);
		menu.add(hielo);
		
		agua = new JMenuItem("Agua"); /*declaracion de items de menu*/
		agua.setBackground(celeste2);
		agua.setForeground(azul);
		agua.setFont(fuente2);
		agua.addActionListener(this);
		menu.add(agua);
		
		aguamar = new JMenuItem("Agua de Mar"); /*declaracion de items de menu*/
		aguamar.setBackground(celeste2);
		aguamar.setForeground(azul);
		aguamar.setFont(fuente2);
		aguamar.addActionListener(this);
		menu.add(aguamar);
		
		aluminio = new JMenuItem("Aluminio"); /*declaracion de items de menu*/
		aluminio.setBackground(celeste2);
		aluminio.setForeground(azul);
		aluminio.setFont(fuente2);
		aluminio.addActionListener(this);
		menu.add(aluminio);
		
		hierro = new JMenuItem("Hierro"); /*declaracion de items de menu*/
		hierro.setBackground(celeste2);
		hierro.setForeground(azul);
		hierro.addActionListener(this);
		menu.add(hierro);
		
		cobre = new JMenuItem("Cobre"); /*declaracion de items de menu*/
		cobre.setBackground(celeste2);
		cobre.setForeground(azul);
		cobre.setFont(fuente2);
		cobre.addActionListener(this);
		menu.add(cobre);
		
		mercurio = new JMenuItem("Mercurio"); /*declaracion de items de menu*/
		mercurio.setBackground(celeste2);
		mercurio.setForeground(azul);
		mercurio.setFont(fuente2);
		mercurio.addActionListener(this);
		menu.add(mercurio);
		
		oro = new JMenuItem("Oro"); /*declaracion de items de menu*/
		oro.setBackground(celeste2);
		oro.setForeground(azul);
		oro.setFont(fuente2);
		oro.addActionListener(this);
		menu.add(oro);
		
		mensaje = new JLabel("Escoge la medida que deseas obtener");/*etiqueta de instrucciones*/
		mensaje.setHorizontalAlignment(SwingConstants.CENTER);
		mensaje.setFont(fuente3);
		mensaje.setBounds(0, 20,300, 50);
		add(mensaje);
		
		mensaje1 = new JLabel("valor a converir: ");
		mensaje1.setBounds(20, 75, 100, 20);
		mensaje1.setFont(fuente3);
		add(mensaje1);
		
		version = new JLabel("V 0.1");
		version.setBounds(5, 320, 300, 20);
		version.setForeground(Color.GRAY);
		version.setFont(fuente2);
		add(version);
		
		valor1 = new JTextField(); /*declaracion de caja donde se extrae el dato*/
		valor1.setBounds(120, 75, 60, 20);
		add(valor1);
		
		peticion = new JLabel();
		peticion.setBounds(60, 150 , 250, 20);
		add(peticion);
		
		resultado = new JLabel(); /*declaracion de un unico resultado*/
		resultado.setBounds(0, 170, 300, 20);
		resultado.setHorizontalAlignment(SwingConstants.CENTER);
		add(resultado);
		
		volver = new JButton("VOLVER"); /*boton que mata el proceso actual y regresa al menu principal*/
		volver.setBounds(150, 300, 100, 20);
		volver.setBackground(celeste);
		volver.setFont(fuente);
		add(volver);
		volver.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent convercion) {
		if(convercion.getSource()== aire){ /*condicional que ejecuta la conversion*/
			dato = valor1.getText();
			
			if(dato.equals("")) {
				peticion.setText("ingresa valor");
			}else {
				peticion.setText("");
				resultado.setText("densidad de aire: " + dens.AIRE(dato)+ "g/cm³");
			}
		}
		if(convercion.getSource()== hielo){ /*condicional que ejecuta la conversion*/
			dato = valor1.getText();
			
			if(dato.equals("")) {
				peticion.setText("ingresa valor");
			}else {
				peticion.setText("");
				resultado.setText("densidad del hielo: " + dens.HIELO(dato)+ "g/cm³");
			}
		}
			if(convercion.getSource()== agua){ /*condicional que ejecuta la conversion*/
				dato = valor1.getText();
				
				if(dato.equals("")) {
					peticion.setText("ingresa valor");
				}else {
					peticion.setText("");
					resultado.setText("densidad de agua: " + dens.AGUA(dato)+ "g/cm³");
				}
			}
			if(convercion.getSource()== aguamar){ /*condicional que ejecuta la conversion*/
				dato = valor1.getText();
				
				if(dato.equals("")) {
					peticion.setText("ingresa valor");
				}else {
					peticion.setText("");
					resultado.setText("densidad de agua de mar: " + dens.AGUAMAR(dato)+ "g/cm³");
				}
			}
			if(convercion.getSource()== aluminio){ /*condicional que ejecuta la conversion*/
				dato = valor1.getText();
				
				if(dato.equals("")) {
					peticion.setText("ingresa valor");
				}else {
					peticion.setText("");
					resultado.setText("densidad de aluminio: " + dens.ALUMINIO(dato)+ "g/cm³");
				}
			}
			if(convercion.getSource()== hierro){ /*condicional que ejecuta la conversion*/
				dato = valor1.getText();
				
				if(dato.equals("")) {
					peticion.setText("ingresa valor");
				}else {
					peticion.setText("");
					resultado.setText("densidad de hierro: " + dens.HIERRO(dato)+ "g/cm³");
				}
			}
			if(convercion.getSource()== cobre){ /*condicional que ejecuta la conversion*/
				dato = valor1.getText();
				
				if(dato.equals("")) {
					peticion.setText("ingresa valor");
				}else {
					peticion.setText("");
					resultado.setText("densidad de cobre: " + dens.COBRE(dato)+ "g/cm³");
				}
			}
			if(convercion.getSource()== mercurio){ /*condicional que ejecuta la conversion*/
				dato = valor1.getText();
				
				if(dato.equals("")) {
					peticion.setText("ingresa valor");
				}else {
					peticion.setText("");
					resultado.setText("densidad de mercurio: " + dens.MERCURIO(dato)+ "g/cm³");
				}
			}
			if(convercion.getSource()== oro){ /*condicional que ejecuta la conversion*/
				dato = valor1.getText();
				
				if(dato.equals("")) {
					peticion.setText("ingresa valor");
				}else {
					peticion.setText("");
					resultado.setText("densidad de oro: " + dens.ORO(dato)+ "g/cm³");
				}
			}
			if(convercion.getSource()==volver) { /*condicional que ejecuta el boton para matar el proceso actual y regresa al principal*/
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
        conversor4 instancia5 = new conversor4();
		
		/*DIMENSIONES DE NUESTRA VENTANA*/
		instancia5.setBounds(0, 0, 300, 400); /*EN DONDE QUIERES QUE APAREZCA LA VENTANA*/
		instancia5.setVisible(true); /*QUE SEA VISIBLE LA VENTANA*/
		instancia5.setResizable(false);/*RESPETA LAS MEDIDAS*/
		instancia5.setLocationRelativeTo(null); /*HACE QUE APAREZCA LA VENTANA CENTRADA*/
	}

}
