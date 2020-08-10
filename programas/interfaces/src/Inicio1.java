/**************************************************************************
 *************** IMPORT AGREGA LAS LIBRERIAS QUE SE USARAN*****************
 */
import java.util.Scanner;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Inicio1 extends JFrame implements ActionListener {
		
		static JLabel titulo, etiquetacorreo, etiquetapassword, etiquetams ; /*es el titulo de lo que se este pidiendo en consola*/
		static JTextField cajacorreo, cajapassword; /*declara el espacio a escribir o incertar valores en consola*/
		static JButton botoniniciar, botonregistrar; /*declara botones*/
		
		/*aqui abajo se encuentran las variables */
		String datoCorreo, datoPass;
		
		char arroba = '@';
		char punto = '.';
		char letra;
		char pts;
		public boolean siguiente;
		public int extensioncorreo;
		public int extensionpass;
		public int numeroDeArrobas;
		public int numeroDePuntos;
		
		
		
		
		
		/*este es el metodo constructor*/
		public Inicio1() {
		setLayout(null); /*ANULA LAS PROPIEDADES POR DEFECTO*/
			
		titulo= new JLabel("INICIAR SESION");/*VALOR DEL OBJETO*/
		titulo.setBounds(0,0,300,50);
		add(titulo);/*MUESTRA ESTO - (---)*/
		
		titulo.setHorizontalAlignment(SwingConstants.CENTER); /*alinea perfectamente el contenido llamado*/
		titulo.setFont(new Font("Cooper", 1,16));/*setFont incerta fuente de letra*/
		titulo.setForeground(Color.blue);	/*setForeground incerta color de letra*/	
		titulo.setOpaque(true); /*muestra lo anterior declarado*/
		Color naranja = new Color(255,140,0); /*los numeros dentro del parentesis declaran el codigo de color elegido*/
		titulo.setBackground(naranja);	/*incerta un color al fondo del titulo*/
		
		etiquetacorreo=new JLabel("CORREO: ");
		etiquetacorreo.setBounds(50, 80, 100, 20);
		add(etiquetacorreo);
		
		cajacorreo = new JTextField();
		cajacorreo.setBounds(50, 100, 150, 20);
		add(cajacorreo);
		
		etiquetapassword= new JLabel("CONTRASEÑA: ");
		etiquetapassword.setBounds(50, 120, 100, 20);
		add(etiquetapassword);
		
		cajapassword = new JTextField();
		cajapassword.setBounds(50, 140, 150, 20);
		add(cajapassword);
		
		botonregistrar= new JButton("REGISTRAR");
		botonregistrar.setBounds(45, 300, 100, 20);
		add(botonregistrar);
		botonregistrar.addActionListener(this);
		
		botoniniciar = new JButton("INICIAR");
		botoniniciar.setBounds(150, 300, 100, 20);
		add(botoniniciar);
		botoniniciar.addActionListener(this);
		
		etiquetams= new JLabel();
		etiquetams.setBounds(50, 320, 200, 20);
		add(etiquetams);		
	}
		
		
		public void actionPerformed(ActionEvent eventoRegistrar) {
			
			
		
			
			if(eventoRegistrar.getSource()==botonregistrar) {
				
				registrar instancia = new registrar();
				
				/*DIMENSIONES DE NUESTRA VENTANA*/
				instancia.setBounds(0, 0, 300, 450); /*EN DONDE QUIERES QUE APAREZCA LA VENTANA*/
				instancia.setVisible(true); /*QUE SEA VISIBLE LA VENTANA*/
				instancia.setResizable(false);/*RESPETA LAS MEDIDAS*/
				instancia.setLocationRelativeTo(null); /*HACE QUE APAREZCA LA VENTANA CENTRADA*/
				
			}
			
			
			if(eventoRegistrar.getSource()==botoniniciar) {
				
				datoCorreo = cajacorreo.getText();
				extensioncorreo = datoCorreo.length();
				
				datoPass = cajapassword.getText();
				extensionpass = datoPass.length();
				do{
				if(datoCorreo.equals("")) {
					
					etiquetams.setText("no haz ingresado correo");
					siguiente = true;				
				}else {
					for(int i = 0; i< extensioncorreo ; i++) {
						letra= datoCorreo.charAt(i);
						pts=datoCorreo.charAt(i);
						
						if(arroba==letra) {
							numeroDeArrobas++;
						}
						if(punto==pts){
							numeroDePuntos++;
						}
						if(numeroDeArrobas==1 && numeroDePuntos>=1) {
							registrar instancia = new registrar();
							
							/*DIMENSIONES DE NUESTRA VENTANA*/
							instancia.setBounds(0, 0, 300, 450); /*EN DONDE QUIERES QUE APAREZCA LA VENTANA*/
							instancia.setVisible(true); /*QUE SEA VISIBLE LA VENTANA*/
							instancia.setResizable(false);/*RESPETA LAS MEDIDAS*/
							instancia.setLocationRelativeTo(null); /*HACE QUE APAREZCA LA VENTANA CENTRADA*/
							siguiente = false;
							break;
							
						}
					}
				
				}
				
				break;
				}while(siguiente==false);
				
		
		
			}}
	public static void main(String [] args) {
		
		Inicio1 instancia = new Inicio1();
		
		/*DIMENSIONES DE NUESTRA VENTANA*/
		instancia.setBounds(0, 0, 300, 400); /*EN DONDE QUIERES QUE APAREZCA LA VENTANA*/
		instancia.setVisible(true); /*QUE SEA VISIBLE LA VENTANA*/
		instancia.setResizable(false);/*RESPETA LAS MEDIDAS*/
		instancia.setLocationRelativeTo(null); /*HACE QUE APAREZCA LA VENTANA CENTRADA*/
		
	}
		
}

