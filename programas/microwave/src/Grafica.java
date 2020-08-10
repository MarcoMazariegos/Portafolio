import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Grafica extends JFrame implements ActionListener{
	JLabel puerta, compuerta;
	JLabel minuto;
	JButton hamburguesa, cafe, palomitas, descongelado, hervir, enlatada;
	JButton nueve, ocho, siete, seis, cinco, cuatro, tres, dos, uno, cero;
	JButton stop, start, open;
	ImageIcon imagen, imagen2, imagen3, imagen4, imagen5, imagen6;
	Icon icono, icono2, icono3, icono4, icono5, icono6;
	Thread temporizador;
	
	
	int min = 0, seg =0;
	int suma;
	int estado=1;
	int estado1 = 1;
	int estado2 = 1;
	int estado3 =2;
	
	public Grafica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		
		Font fuente3 = new Font("Agency fb", Font.BOLD, 50);
		
		Container contentpane = getContentPane();
		this.getContentPane().setBackground(Color.black);
		
		compuerta= new JLabel("");/*VALOR DEL OBJETO*/
		compuerta.setBounds(20,25,350,400);
		add(compuerta);/*MUESTRA ESTO - (---)*/
		
		compuerta.setHorizontalAlignment(SwingConstants.CENTER); /*alinea perfectamente el contenido llamado*/
		compuerta.setFont(new Font("Cooper", 1,16));/*setFont incerta fuente de letra*/
		compuerta.setForeground(Color.black);	/*setForeground incerta color de letra*/	
		compuerta.setOpaque(true);
		compuerta.setBackground(Color.LIGHT_GRAY);	/*incerta un color al fondo del titulo*/
		
		puerta= new JLabel("");/*VALOR DEL OBJETO*/
		puerta.setBounds(0,0,400,500);
		add(puerta);/*MUESTRA ESTO - (---)*/
		
		puerta.setHorizontalAlignment(SwingConstants.CENTER); /*alinea perfectamente el contenido llamado*/
		puerta.setFont(new Font("Cooper", 1,16));/*setFont incerta fuente de letra*/
		puerta.setForeground(Color.black);	/*setForeground incerta color de letra*/	
		puerta.setOpaque(true);
		puerta.setBackground(Color.gray);	/*incerta un color al fondo del titulo*/
		
		minuto = new JLabel();
		minuto.setOpaque(true);
		minuto.setBackground(Color.BLACK);
		minuto.setForeground(Color.CYAN);
		minuto.setFont(fuente3);
		minuto.setBounds(510, 5, 120, 50);
		add(minuto);
		
		hamburguesa = new JButton();
		hamburguesa.setBounds(480,80, 45, 45);
		imagen = new ImageIcon("img1.png");
		icono = new ImageIcon(imagen.getImage().getScaledInstance(hamburguesa.getWidth(), hamburguesa.getHeight(), Image.SCALE_DEFAULT));
		hamburguesa.setIcon(icono);
		hamburguesa.addActionListener(this);
		contentpane.add(hamburguesa);
		
		cafe = new JButton();
		cafe.setBounds(535,80, 45, 45);
		imagen2 = new ImageIcon("img2.png");
		icono2 = new ImageIcon(imagen2.getImage().getScaledInstance(cafe.getWidth(), cafe.getHeight(), Image.SCALE_DEFAULT));
		cafe.setIcon(icono2);
		cafe.addActionListener(this);
		contentpane.add(cafe);
		
		palomitas = new JButton();
		palomitas.setBounds(590,80, 45, 45);
		imagen3 = new ImageIcon("img3.png");
		icono3 = new ImageIcon(imagen3.getImage().getScaledInstance(palomitas.getWidth(), palomitas.getHeight(), Image.SCALE_DEFAULT));
		palomitas.setIcon(icono3);
		palomitas.addActionListener(this);
		contentpane.add(palomitas);
		
		descongelado = new JButton();
		descongelado.setBounds(590,135, 45, 45);
		imagen4 = new ImageIcon("img4.png");
		icono4 = new ImageIcon(imagen4.getImage().getScaledInstance(descongelado.getWidth(), descongelado.getHeight(), Image.SCALE_DEFAULT));
		descongelado.setIcon(icono4);
		descongelado.addActionListener(this);
		contentpane.add(descongelado);
		
		hervir = new JButton();
		hervir.setBounds(535,135, 45, 45);
		imagen5 = new ImageIcon("img5.png");
		icono5 = new ImageIcon(imagen5.getImage().getScaledInstance(hervir.getWidth(), hervir.getHeight(), Image.SCALE_DEFAULT));
		hervir.setIcon(icono5);
		hervir.addActionListener(this);
		contentpane.add(hervir);
		
		enlatada = new JButton();
		enlatada.setBounds(480,135, 45, 45);
		imagen6 = new ImageIcon("img6.png");
		icono6 = new ImageIcon(imagen6.getImage().getScaledInstance(enlatada.getWidth(), enlatada.getHeight(), Image.SCALE_DEFAULT));
		enlatada.setIcon(icono6);
		enlatada.addActionListener(this);
		contentpane.add(enlatada);
		
		nueve = new JButton("9");
		nueve.setBounds(480, 190, 45, 45);
		nueve.addActionListener(this);
		contentpane.add(nueve);
		
		ocho = new JButton("8");
		ocho.setBounds(535, 190, 45, 45);
		ocho.addActionListener(this);
		contentpane.add(ocho);
		
		siete = new JButton("7");
		siete.setBounds(590, 190, 45, 45);
		siete.addActionListener(this);
		contentpane.add(siete);
		
		seis = new JButton("6");
		seis.setBounds(480, 240, 45, 45);
		seis.addActionListener(this);
		contentpane.add(seis);
		
		cinco = new JButton("5");
		cinco.setBounds(535, 240, 45, 45);
		cinco.addActionListener(this);
		contentpane.add(cinco);
		
		cuatro = new JButton("4");
		cuatro.setBounds(590, 240, 45, 45);
		cuatro.addActionListener(this);
		contentpane.add(cuatro);
		
		tres = new JButton("3");
		tres.setBounds(480, 290, 45, 45);
		tres.addActionListener(this);
		contentpane.add(tres);
		
		dos = new JButton("2");
		dos.setBounds(535, 290, 45, 45);
		dos.addActionListener(this);
		contentpane.add(dos);
		
		uno = new JButton("1");
		uno.setBounds(590, 290, 45, 45);
		uno.addActionListener(this);
		contentpane.add(uno);
		
		cero = new JButton("0");
		cero.setBounds(535, 340, 45, 45);
		cero.addActionListener(this);
		contentpane.add(cero);
		
		stop = new JButton("stop");
		stop.setBounds(445, 340, 80, 45);
		stop.addActionListener(this);
		contentpane.add(stop);
		
		start = new JButton("start");
		start.setBounds(590, 340, 85, 45);
		start.addActionListener(this);
		contentpane.add(start);
		
		open = new JButton("open");
		open.setBounds(465, 400, 190, 45);
		open.addActionListener(this);
		contentpane.add(open);
		

		/**************declaracion del proceso que se hara hasta que segundos llegue a 0***************/
		temporizador = new Thread() {
			@SuppressWarnings("deprecation")
			@Override 
			public void run() { /****clase que comienza el proceso****/
				
				for(;;) {
					try {	
						seg--;
						if(seg >59){ /*****condicionales de segundos y minutos*****/
							
						int oper=seg-59;
						min ++;
						seg = oper;
						}
						if(seg==0 && min>=1) {
							min --;
							seg = 59;
							seg --;
						} 
						if(min ==0 && seg == 0) {
							compuerta.setText("listo");
							temporizador.stop();
						}		
					minuto.setText(min + ":"+seg);
					Thread.sleep(999);
				}catch(InterruptedException e) {
					
				}
			}
			}				
			};	
}
	public void actionPerformed(ActionEvent establecido) {
		
		/***************condicionales a cada boton del panel del microondas***************/
			
		if(establecido.getSource()== hamburguesa) {
			seg = 60;
			minuto.setText(min+":"+seg);
		}
		if(establecido.getSource() == cafe) {
			seg = 80;
			minuto.setText(min+":"+seg);
		}
		if(establecido.getSource()== palomitas) {
			seg = 90;
			minuto.setText(min+":"+seg);
		}
		if(establecido.getSource()==descongelado) {
			seg = 70;
			minuto.setText(min+":"+seg);
		}
		if(establecido.getSource()== hervir) {
			seg = 100;
			minuto.setText(min+":"+seg);
		}
		if(establecido.getSource() == enlatada) {
			seg = 45;
			minuto.setText(min+":"+seg);
		}
		
		/*************************numeros*********************************/
		
		
		if(establecido.getSource()== uno) {
			if(estado3 == 2) {
				
				suma ++;
				seg = suma;
				estado3 =1;
			}
			else if(estado3 ==1) {
				suma = seg + 10;
				seg = suma;
				estado3 = 0;
			}
			else {
				suma = seg + 60;
				seg = suma;
				estado3 = -1;
			}
			minuto.setText(min+":"+seg);
		}
		/****estado4****/ 
		if(establecido.getSource()== dos) {
			if(estado3 == 2) {
				
				suma =2;
				seg = suma;
				estado3 =1;
			}
			else if(estado3 ==1) {
				suma = seg + 20;
				seg = suma;
				estado3 = 0;
			}
			else {
				suma = seg + 120;
				seg = suma;
				estado3 = -1;
			}
			minuto.setText(min+":"+seg);
		}
		
		
		/********estado5**********/
		
		if(establecido.getSource()== tres) {
			if(estado3 == 2) {
				
				suma =3;
				seg = suma;
				estado3 =1;
			}
			else if(estado3 ==1) {
				suma = seg + 30;
				seg = suma;
				estado3 = 0;
			}
			else if(estado3 == 0){
				suma = seg + 180;
				seg = suma;
				estado3 = -1;
			}
			minuto.setText(min+":"+seg);
		}
		if(establecido.getSource()== cuatro) {
			if(estado3 == 2) {
				
				suma =4;
				seg = suma;
				estado3 =1;
			}
			else if(estado3 ==1) {
				suma = seg + 40;
				seg = suma;
				estado3 = 0;
			}
			else if(estado3 == 0){
				suma = seg + 240;
				seg = suma;
				estado3 = -1;
			}
			minuto.setText(min+":"+seg);
		}
		if(establecido.getSource()== cinco) {
			if(estado3 == 2) {
				
				suma =5;
				seg = suma;
				estado3 =1;
			}
			else if(estado3 ==1) {
				suma = seg + 50;
				seg = suma;
				estado3 = 0;
			}
			else if(estado3 == 0){
				suma = seg + 300;
				seg = suma;
				estado3 = -1;
			}
			minuto.setText(min+":"+seg);
		}
		if(establecido.getSource()== seis) {
			if(estado3 == 2) {
				
				suma =6;
				seg = suma;
				estado3 =1;
			}
			else if(estado3 ==1) {
				suma = seg + 60;
				seg = suma;
				estado3 = 0;
			}
			else if(estado3 == 0){
				suma = seg + 360;
				seg = suma;
				estado3 = -1;
			}
			minuto.setText(min+":"+seg);
		}
		if(establecido.getSource()== siete) {
			if(estado3 == 2) {
				
				suma =7;
				seg = suma;
				estado3 =1;
			}
			else if(estado3 ==1) {
				suma = seg + 70;
				seg = suma;
				estado3 = 0;
			}
			else if(estado3 == 0){
				suma = seg + 420;
				seg = suma;
				estado3 = -1;
			}
			minuto.setText(min+":"+seg);
		}
		if(establecido.getSource()== ocho) {
			if(estado3 == 2) {
				
				suma =8;
				seg = suma;
				estado3 =1;
			}
			else if(estado3 ==1) {
				suma = seg + 80;
				seg = suma;
				estado3 = 0;
			}
			else if(estado3 == 0){
				suma = seg + 480;
				seg = suma;
				estado3 = -1;
			}
			minuto.setText(min+":"+seg);
		}
		if(establecido.getSource()== nueve) {
			if(estado3 == 2) {
				
				suma =9;
				seg = suma;
				estado3 =1;
			}
			else if(estado3 ==1) {
				suma = seg + 90;
				seg = suma;
				estado3 = 0;
			}
			else if(estado3 == 0){
				suma = seg + 540;
				seg = suma;
				estado3 = -1;
			}
			minuto.setText(min+":"+seg);
		}
		if(establecido.getSource()== cero) {
			if(estado3 == 2) {
				
				suma =0;
				seg = suma;
				estado3 =1;
			}
			else if(estado3 ==1) {
				suma = seg * 10;
				seg = suma;
				estado3 = 0;
			}
			else if(estado3 == 0){
				suma = seg * 10;
				seg = suma;
				estado3 = -1;
			}
			minuto.setText(min+":"+seg);
		}  
		
		/**********************acciones**********************************/
		
		
		if(establecido.getSource()== start) {
			
			if(estado1 == 1) {
			temporizador.start();
			start.setText("borrar");
			
			estado1 =0;
		}else if(estado1 == 0){
			temporizador.stop();
			start.setText("start");
	
			estado1 = 1;
		}
			
	}
		
			if(establecido.getSource()==stop) {
			if(estado ==1) {
				temporizador.suspend();
				stop.setText("seguir");
				estado =0;
			}else {
				temporizador.resume();
				stop.setText("stop");
				estado=1;
			}
		}
			
		
		if(establecido.getSource()== open) {
			
			if(estado2==1) {
			compuerta.setText("abierto");
			open.setText("CERRAR");
			estado2 = 0;
		}else {
			compuerta.setText("");
			open.setText("open");
			estado2 = 1;
		}
	}
}
	
	

	public static void main(String [] args) {
		Grafica instancia1 = new Grafica();
				
				/*DIMENSIONES DE NUESTRA VENTANA*/
				instancia1.setBounds(0, 0, 700, 500); /*EN DONDE QUIERES QUE APAREZCA LA VENTANA*/
				instancia1.setVisible(true); /*QUE SEA VISIBLE LA VENTANA*/
				instancia1.setResizable(false);/*RESPETA LAS MEDIDAS*/
				instancia1.setLocationRelativeTo(null); /*HACE QUE APAREZCA LA VENTANA CENTRADA*/
				instancia1.setBackground(Color.black);
			}
}