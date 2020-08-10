import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class conversor3 extends JFrame implements ActionListener{
	
	JMenuBar barra;   /*declaraciones de objetos de tipo frame y java*/
	JMenu menu;
	JMenuItem año, mes, semana, dia ,hora ,minutos, segundos;
	JLabel mensaje, mensaje1, peticion;
	JLabel resultado, resultado2, resultado3, resultado4, resultado5,
	resultado6, version;
	JTextField valor1;
	JButton volver;
	
	String dato;
	medidastiempo tiempo = new medidastiempo(); /*instancia de clase que ejecuta y devuelve respuestas*/
	public conversor3() {
		setLayout(null);
		
		Font fuente= new Font("Tahoma", Font.BOLD,10); /*base de datos de tipos de fuente y colores*/
		Font fuente2= new Font("Tahoma", Font.BOLD,11);
		Font fuente3 = new Font("Agency fb", Font.BOLD, 15);
		
		Color verde = new Color(32, 178, 170);
		Color celeste = new Color(64, 224, 208);
		Color celeste2 = new Color(64, 224, 208);
		Color azul = new Color(95, 158, 160); 
		
		this.getContentPane().setBackground(verde); /*extrae el panel y le da color de fondo*/
		
		barra = new JMenuBar(); /*declaracion de barra de menu*/
		setJMenuBar(barra);
		barra.setBackground(celeste);
		menu = new JMenu("MEDIDAS");
		menu.setFont(fuente);
		barra.add(menu);
		
		año = new JMenuItem("Año"); /*declaracion de items de menu*/
		año.setBackground(celeste2);
		año.setForeground(azul);
		año.setFont(fuente2);
		año.addActionListener(this);
		menu.add(año);
		
		mes = new JMenuItem("Mes"); /*declaracion de items de menu*/
		mes.setBackground(celeste2);
		mes.setForeground(azul);
		mes.setFont(fuente2);
		mes.addActionListener(this);
		menu.add(mes);
		
		semana = new JMenuItem("Semana"); /*declaracion de items de menu*/
		semana.setBackground(celeste2);
		semana.setForeground(azul);
		semana.setFont(fuente2);
		semana.addActionListener(this);
		menu.add(semana);
		
		dia = new JMenuItem("Dia"); /*declaracion de items de menu*/
		dia.setBackground(celeste2);
		dia.setForeground(azul);
		dia.setFont(fuente2);
		dia.addActionListener(this);
		menu.add(dia);
		
		hora = new JMenuItem("Hora"); /*declaracion de items de menu*/
		hora.setBackground(celeste2);
		hora.setForeground(azul);
		hora.setFont(fuente2);
		hora.addActionListener(this);
		menu.add(hora);
		
		minutos = new JMenuItem("Minuto"); /*declaracion de items de menu*/
		minutos.setBackground(celeste2);
		minutos.setForeground(azul);
		minutos.addActionListener(this);
		menu.add(minutos);
		
		segundos = new JMenuItem("Segundo"); /*declaracion de items de menu*/
		segundos.setBackground(celeste2);
		segundos.setForeground(azul);
		segundos.setFont(fuente2);
		segundos.addActionListener(this);
		menu.add(segundos);
		
		mensaje = new JLabel("Escoge la medida que introduciras"); /*declaracion de etiqueta de instrucciones*/
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
		
		valor1 = new JTextField(); /*declaracion de caja de texto donde se extrae el dato a convertir*/
		valor1.setBounds(120, 75, 60, 20);
		add(valor1);
		
		volver = new JButton("VOLVER");
		volver.setBounds(150, 300, 100, 20);
		volver.setBackground(celeste);
		volver.setFont(fuente); /*boton para matar el proceso actual y regresar al principal*/
		add(volver);
		volver.addActionListener(this);
		
		peticion = new JLabel();
		peticion.setBounds(60, 150 , 250, 20);
		add(peticion);
		
		resultado = new JLabel(); /*declaracion de etiqueta de resultado*/
		resultado.setBounds(60, 170, 200, 20);
		add(resultado);
		
		resultado2 = new JLabel(); /*declaracion de etiqueta de resultado*/
		resultado2.setBounds(60, 190, 200, 20);
		add(resultado2);
		
		resultado3 = new JLabel(); /*declaracion de etiqueta de resultado*/
		resultado3.setBounds(60, 210, 200, 20);
		add(resultado3);
		
		resultado4 = new JLabel(); /*declaracion de etiqueta de resultado*/
		resultado4.setBounds(60, 230, 200, 20);
		add(resultado4);
		
		resultado5 = new JLabel(); /*declaracion de etiqueta de resultado*/
		resultado5.setBounds(60, 250, 200, 20);
		add(resultado5);
		
		resultado6 = new JLabel(); /*declaracion de etiqueta de resultado*/
		resultado6.setBounds(60, 270, 200, 20);
		add(resultado6);
		
	}
	
	
	public void actionPerformed(ActionEvent convercion) {
		
		if(convercion.getSource()== año){	/*condicional que permite ejecutar la conversion*/
			dato = valor1.getText();
			
			if(dato.equals("")) {
				peticion.setText("ingresa valor");
			}
			else {
				peticion.setText("");
				resultado.setText("Meses: " + tiempo.mes(dato) );
				resultado2.setText("Semanas: " + tiempo.semana(dato) );
				resultado3.setText("Dias: " + tiempo.dia(dato));
				resultado4.setText("Horas: "+ tiempo.hora(dato));
				resultado5.setText("Minutos: " + tiempo.minuto(dato));
				resultado6.setText("Segundos: " + tiempo.segundo(dato));			
			}		
		}
		if(convercion.getSource()== mes){	/*condicional que permite ejecutar la conversion*/
			dato = valor1.getText();
			
			if(dato.equals("")) {
				peticion.setText("ingresa valor");
			}
			else {
				peticion.setText("");
				resultado.setText("Años: " + tiempo.año(dato) );
				resultado2.setText("Semanas: " + tiempo.semana2(dato) );
				resultado3.setText("Dias: " + tiempo.dia2(dato));
				resultado4.setText("Horas: "+ tiempo.hora2(dato));
				resultado5.setText("Minutos: " + tiempo.minuto2(dato));
				resultado6.setText("Segundos: " + tiempo.segundo2(dato));			
			}		
		}
		if(convercion.getSource()== semana){	/*condicional que permite ejecutar la conversion*/
			dato = valor1.getText();
			
			if(dato.equals("")) {
				peticion.setText("ingresa valor");
			}
			else {
				peticion.setText("");
				resultado.setText("Años: " + tiempo.año2(dato) );
				resultado2.setText("Meses: " + tiempo.mes2(dato) );
				resultado3.setText("Dias: " + tiempo.dia3(dato));
				resultado4.setText("Horas: "+ tiempo.hora3(dato));
				resultado5.setText("Minutos: " + tiempo.minuto3(dato));
				resultado6.setText("Segundos: " + tiempo.segundo3(dato));			
			}		
		}
		if(convercion.getSource()== dia){	/*condicional que permite ejecutar la conversion*/
			dato = valor1.getText();
			
			if(dato.equals("")) {
				peticion.setText("ingresa valor");
			}
			else {
				peticion.setText("");
				resultado.setText("Años: " + tiempo.año3(dato) );
				resultado2.setText("Meses: " + tiempo.mes3(dato) );
				resultado3.setText("Semanas: " + tiempo.semana3(dato));
				resultado4.setText("Horas: "+ tiempo.hora4(dato));
				resultado5.setText("Minutos: " + tiempo.minuto4(dato));
				resultado6.setText("Segundos: " + tiempo.segundo4(dato));			
			}		
		}
		if(convercion.getSource()== hora){	/*condicional que permite ejecutar la conversion*/
			dato = valor1.getText();
			
			if(dato.equals("")) {
				peticion.setText("ingresa valor");
			}
			else {
				peticion.setText("");
				resultado.setText("Años: " + tiempo.año4(dato) );
				resultado2.setText("Meses: " + tiempo.mes4(dato) );
				resultado3.setText("Semanas: " + tiempo.semana4(dato));
				resultado4.setText("Dias: "+ tiempo.dia4(dato));
				resultado5.setText("Minutos: " + tiempo.minuto5(dato));
				resultado6.setText("Segundos: " + tiempo.segundo5(dato));			
			}		
		}
		if(convercion.getSource()== minutos){	/*condicional que permite ejecutar la conversion*/
			dato = valor1.getText();
			
			if(dato.equals("")) {
				peticion.setText("ingresa valor");
			}
			else {
				peticion.setText("");
				resultado.setText("Años: " + tiempo.año5(dato) );
				resultado2.setText("Meses: " + tiempo.mes5(dato) );
				resultado3.setText("Semanas: " + tiempo.semana5(dato));
				resultado4.setText("Dias: "+ tiempo.dia5(dato));
				resultado5.setText("Horas: " + tiempo.hora5(dato));
				resultado6.setText("Segundos: " + tiempo.segundo6(dato));			
			}		
		}
		if(convercion.getSource()== segundos){	/*condicional que permite ejecutar la conversion*/
			dato = valor1.getText();
			
			if(dato.equals("")) {
				peticion.setText("ingresa valor");
			}
			else {
				peticion.setText("");
				resultado.setText("Años: " + tiempo.año6(dato) );
				resultado2.setText("Meses: " + tiempo.mes6(dato) );
				resultado3.setText("Semanas: " + tiempo.semana6(dato));
				resultado4.setText("Dias: "+ tiempo.dia6(dato));
				resultado5.setText("Horas: " + tiempo.hora6(dato));
				resultado6.setText("Minutos: " + tiempo.minuto6(dato));		
			}		
		}
		if(convercion.getSource()==volver) { /*condicional que permite matar el proceso actual y regresar al menu principal*/
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
		conversor3 instancia4 = new conversor3();
		
		/*DIMENSIONES DE NUESTRA VENTANA*/
		instancia4.setBounds(0, 0, 300, 400); /*EN DONDE QUIERES QUE APAREZCA LA VENTANA*/
		instancia4.setVisible(true); /*QUE SEA VISIBLE LA VENTANA*/
		instancia4.setResizable(false);/*RESPETA LAS MEDIDAS*/
		instancia4.setLocationRelativeTo(null); /*HACE QUE APAREZCA LA VENTANA CENTRADA*/
	}

}
