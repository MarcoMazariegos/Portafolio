import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

import javax.swing.*;

public class eleccion extends JFrame implements ActionListener{

	
	JLabel mensaje, version; /*declaraciones de objetos de tipo frame y java*/
	JButton masa, longitud, tiempo, densidad, finalizar;
	public JMenuBar barra;
	public JMenu name;
	public JMenuItem negro, rojo, Azul, gris;
	
	public ActionEvent conver;
	
	public eleccion() {
		setLayout(null);
		
		
		Font fuente= new Font("Tahoma", Font.BOLD, 14);
		Font fuente2= new Font("Tahoma", Font.BOLD, 10);
		Color celeste = new Color(64, 224, 208);
		Color celeste2 = new Color(64, 224, 208);
		Color azul = new Color(95, 158, 160); 
		Color verde = new Color(32, 178, 170);
		
		
		this.getContentPane().setBackground(verde); /**extrae el contenido del panel 
		y le agrega un color de fondo*/
		
		/*barra = new JMenuBar(); /**valores a la barra de menu***/
		/*setJMenuBar(barra);
		barra.setBackground(celeste);
		name = new JMenu("CUSTOM");
		name.setFont(fuente2);
		barra.add(name);
		
		negro = new JMenuItem("Oscuro");  
		negro.setBackground(celeste2);
		negro.setForeground(azul);
		negro.setFont(fuente2);
     	negro.addActionListener(this);
		name.add(negro);
		
		rojo = new JMenuItem("Love");
		rojo.setBackground(celeste2);
		rojo.setForeground(azul);
		rojo.setFont(fuente2);
		rojo.addActionListener(this);
		name.add(rojo);
		
		Azul = new JMenuItem("AZUL");
		Azul.setBackground(celeste2);
		Azul.setForeground(azul);
		Azul.setFont(fuente2);
		Azul.addActionListener(this);
		name.add(Azul);
		
		gris = new JMenuItem("escala de grises");
		gris.setBackground(celeste2);
		gris.setForeground(azul);
		gris.setFont(fuente2);
		gris.addActionListener(this);
		name.add(gris); */
		
		mensaje = new JLabel("Escoge que tipo de conversion deseas");
		mensaje.setHorizontalAlignment(SwingConstants.CENTER);
		mensaje.setBounds(-5, 20, 300, 20); /***se declaran y se da valor a las etiquetas***/
		mensaje.setForeground(Color.BLACK);
		mensaje.setFont(fuente);
		add(mensaje);
		
		version = new JLabel("V 0.1");
		version.setBounds(5, 320, 300, 20);
		version.setForeground(Color.GRAY);
		version.setFont(fuente2);
		add(version);
		
		masa = new JButton("MASA"); /****se declaran botones y se da valor a los mismos******/
		masa.setBounds(110, 65, 80, 25);
		masa.setFont(fuente2);
		masa.setForeground(celeste2);
		masa.setBackground(azul);
		add(masa);
	    masa.addActionListener(this);
		
		longitud = new JButton("LONGITUD"); /****se declaran botones y se da valor a los mismos******/
		longitud.setBounds(100, 105, 100, 25);
		longitud.setFont(fuente2);
		longitud.setForeground(celeste2);
		longitud.setBackground(azul);
		add(longitud);
		longitud.addActionListener(this);
		
		tiempo = new JButton("TIEMPO"); /****se declaran botones y se da valor a los mismos******/
		tiempo.setBounds(110, 145, 80, 25);
		add(tiempo);
		tiempo.setFont(fuente2);
		tiempo.setForeground(celeste2);
		tiempo.setBackground(azul);
		tiempo.addActionListener(this);
		
		densidad = new JButton("DENSIDAD"); /****se declaran botones y se da valor a los mismos******/
		densidad.setBounds(100, 185, 100, 25);
		add(densidad);
		densidad.setFont(fuente2);
		densidad.setForeground(celeste2);
		densidad.setBackground(azul);
		densidad.addActionListener(this);
		
		finalizar = new JButton("FINALIZAR"); /****se declaran botones y se da valor a los mismos******/
		finalizar.setBounds(170, 310, 100, 25);
		add(finalizar);
		finalizar.setFont(fuente2);
		finalizar.setForeground(celeste2);
		finalizar.setBackground(azul);
		finalizar.addActionListener(this);
		
		
		
	}
	
	public void actionPerformed(ActionEvent conver) {
		
		/*if(conver.getSource()== negro) { 
			this.getContentPane().setBackground(instanciaColores.negro);
			mensaje.setForeground(instanciaColores.rojo);
			barra.setBackground(instanciaColores.gris);
			version.setForeground(instanciaColores.rojo);
			masa.setForeground(instanciaColores.rojo);
			longitud.setForeground(instanciaColores.rojo);
			tiempo.setForeground(instanciaColores.rojo);
			densidad.setForeground(instanciaColores.rojo);
			finalizar.setForeground(instanciaColores.rojo);
			masa.setBackground(instanciaColores.gris);
			longitud.setBackground(instanciaColores.gris);
			tiempo.setBackground(instanciaColores.gris);
			densidad.setBackground(instanciaColores.gris);
			finalizar.setBackground(instanciaColores.gris);
			negro.setBackground(instanciaColores.negro);
			rojo.setBackground(instanciaColores.negro);
			Azul.setBackground(instanciaColores.negro);
			gris.setBackground(instanciaColores.negro);
			negro.setForeground(instanciaColores.rojo);
			rojo.setForeground(instanciaColores.rojo);
			Azul.setForeground(instanciaColores.rojo);
			gris.setForeground(instanciaColores.rojo);
			
		}
		if(conver.getSource()== rojo) {
			this.getContentPane().setBackground(instanciaColores.rosita2);
			mensaje.setForeground(instanciaColores.rosita1);
			barra.setBackground(instanciaColores.rosita3);
			version.setForeground(instanciaColores.rojo);
			masa.setForeground(instanciaColores.rojo);
			longitud.setForeground(instanciaColores.rojo);
			tiempo.setForeground(instanciaColores.rojo);
			densidad.setForeground(instanciaColores.rojo);
			finalizar.setForeground(instanciaColores.rojo);
			masa.setBackground(instanciaColores.rosita3);
			longitud.setBackground(instanciaColores.rosita3);
			tiempo.setBackground(instanciaColores.rosita3);
			densidad.setBackground(instanciaColores.rosita3);
			finalizar.setBackground(instanciaColores.rosita3);
			negro.setBackground(instanciaColores.rosita2);
			rojo.setBackground(instanciaColores.rosita2);
			Azul.setBackground(instanciaColores.rosita2);
			gris.setBackground(instanciaColores.rosita2);
			negro.setForeground(instanciaColores.rojo);
			rojo.setForeground(instanciaColores.rojo);
			Azul.setForeground(instanciaColores.rojo);
			gris.setForeground(instanciaColores.rojo);
		}
		if(conver.getSource()== Azul) {
			this.getContentPane().setBackground(instanciaColores.azul2);
			mensaje.setForeground(instanciaColores.azul1);
			barra.setBackground(instanciaColores.azul3);
			version.setForeground(instanciaColores.azul1);
			masa.setForeground(instanciaColores.azul1);
			longitud.setForeground(instanciaColores.azul1);
			tiempo.setForeground(instanciaColores.azul1);
			densidad.setForeground(instanciaColores.azul1);
			finalizar.setForeground(instanciaColores.azul1);
			masa.setBackground(instanciaColores.azul3);
			longitud.setBackground(instanciaColores.azul3);
			tiempo.setBackground(instanciaColores.azul3);
			densidad.setBackground(instanciaColores.azul3);
			finalizar.setBackground(instanciaColores.azul3);
			negro.setBackground(instanciaColores.azul2);
			rojo.setBackground(instanciaColores.azul2);
			Azul.setBackground(instanciaColores.azul2);
			gris.setBackground(instanciaColores.azul2);
			negro.setForeground(instanciaColores.azul1);
			rojo.setForeground(instanciaColores.azul1);
			Azul.setForeground(instanciaColores.azul1);
			gris.setForeground(instanciaColores.azul1);
			
		}
		if(conver.getSource()== gris) {
			this.getContentPane().setBackground(instanciaColores.gris1);
			mensaje.setForeground(instanciaColores.negro);
			barra.setBackground(instanciaColores.gris2);
			version.setForeground(instanciaColores.negro);
			masa.setForeground(instanciaColores.negro);
			longitud.setForeground(instanciaColores.negro);
			tiempo.setForeground(instanciaColores.negro);
			densidad.setForeground(instanciaColores.negro);
			finalizar.setForeground(instanciaColores.negro);
			masa.setBackground(instanciaColores.gris2);
			longitud.setBackground(instanciaColores.gris2);
			tiempo.setBackground(instanciaColores.gris2);
			densidad.setBackground(instanciaColores.gris2);
			finalizar.setBackground(instanciaColores.gris2);
			negro.setBackground(instanciaColores.gris1);
			rojo.setBackground(instanciaColores.gris1);
			Azul.setBackground(instanciaColores.gris1);
			gris.setBackground(instanciaColores.gris1);
			negro.setForeground(instanciaColores.negro);
			rojo.setForeground(instanciaColores.negro);
			Azul.setForeground(instanciaColores.negro);
			gris.setForeground(instanciaColores.negro);
			
		} */
		
		if(conver.getSource()== masa){ /**condicional que establece que al momento de darle al boton 
		me mande a la nueva instancia*/
			conversor instancia2 = new conversor();
			
			/*DIMENSIONES DE NUESTRA VENTANA*/
			instancia2.setBounds(0, 0, 300, 400); /*EN DONDE QUIERES QUE APAREZCA LA VENTANA*/
			instancia2.setVisible(true); /*QUE SEA VISIBLE LA VENTANA*/
			instancia2.setResizable(false);/*RESPETA LAS MEDIDAS*/
			instancia2.setLocationRelativeTo(null); /*HACE QUE APAREZCA LA VENTANA CENTRADA*/
			
			if(conver.getSource()==negro){
				instancia2.getContentPane().setBackground(Color.BLACK);
			}
			this.dispose(); /**variable que mata el proceso de la ventana**/
			
			
		}
		if(conver.getSource()== longitud){/**condicional que establece que al momento de darle al boton 
			me mande a la nueva instancia*/
			conversor2 instancia3 = new conversor2();
			
			/*DIMENSIONES DE NUESTRA VENTANA*/
			instancia3.setBounds(0, 0, 300, 400); /*EN DONDE QUIERES QUE APAREZCA LA VENTANA*/
			instancia3.setVisible(true); /*QUE SEA VISIBLE LA VENTANA*/
			instancia3.setResizable(false);/*RESPETA LAS MEDIDAS*/
			instancia3.setLocationRelativeTo(null); /*HACE QUE APAREZCA LA VENTANA CENTRADA*/
			
			this.dispose();
			
		}
		if(conver.getSource()== tiempo){/**condicional que establece que al momento de darle al boton 
			me mande a la nueva instancia*/
		conversor3 instancia4 = new conversor3();
		
			/*DIMENSIONES DE NUESTRA VENTANA*/
			instancia4.setBounds(0, 0, 300, 400); /*EN DONDE QUIERES QUE APAREZCA LA VENTANA*/
			instancia4.setVisible(true); /*QUE SEA VISIBLE LA VENTANA*/
			instancia4.setResizable(false);/*RESPETA LAS MEDIDAS*/
			instancia4.setLocationRelativeTo(null); /*HACE QUE APAREZCA LA VENTANA CENTRADA*/
			
			this.dispose();
			
		}
		if(conver.getSource()== densidad){ /**condicional que establece que al momento de darle al boton 
			me mande a la nueva instancia*/
			conversor4 instancia5 = new conversor4();
			
			/*DIMENSIONES DE NUESTRA VENTANA*/
			instancia5.setBounds(0, 0, 300, 400); /*EN DONDE QUIERES QUE APAREZCA LA VENTANA*/
			instancia5.setVisible(true); /*QUE SEA VISIBLE LA VENTANA*/
			instancia5.setResizable(false);/*RESPETA LAS MEDIDAS*/
			instancia5.setLocationRelativeTo(null); /*HACE QUE APAREZCA LA VENTANA CENTRADA*/
			
			this.dispose();
			
		}
		
		if(conver.getSource()==finalizar) { /*boton que finaliza el programa y no mata el proceso en memoria ram 
		para que este pueda ser eliminado sin problemas*/
			this.dispose();
		}
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
       eleccion instancia = new eleccion();
		
		/*DIMENSIONES DE NUESTRA VENTANA*/
		instancia.setBounds(0, 0, 300, 400); /*EN DONDE QUIERES QUE APAREZCA LA VENTANA*/
		instancia.setVisible(true); /*QUE SEA VISIBLE LA VENTANA*/
		instancia.setResizable(false);/*RESPETA LAS MEDIDAS*/
		instancia.setLocationRelativeTo(null); /*HACE QUE APAREZCA LA VENTANA CENTRADA*/

	}

}
