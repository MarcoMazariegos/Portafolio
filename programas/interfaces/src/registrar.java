import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class registrar extends JFrame implements ActionListener{

	static JLabel titulo, etiquetaNOMBRE, etiquetaAPELLIDO, etiquetaCORREO, etiquetaCONFC, etiquetaCONTRA, etiquetaCONFCO, etiquetaMENSAJE1, etiquetaMENSAJE2,
	etiquetaMENSAJE3, etiquetaMENSAJE4, etiquetaMENSAJE5, etiquetaMensaje6; /*es el titulo de lo que se este pidiendo en consola*/
	static JTextField cajaNOMBRE, cajaAPELLIDO, cajaCORREO, cajaCONFC, cajaCONTRA, cajaCONFCO; /*declara el espacio a escribir o incertar valores en consola*/
	static JButton botoniniciar, botonregistrar; /*declara botones*/
	
	String datoNombre;
	String datoApellido;
	String datoCorreo;
	String datoCC;
	String datoContraseña;
	String datoConfContraseña;
	String sinNada= "";
	
	int extensionNm;
	int extensionPl;
	int extensionCorreo;
	int extensionCC;
	int extensionPassword;
	int extensionCONFCO;
	int numeroDeArrobas;
	int numeroDePuntos;
	
	char punto = '.';
	char arroba = '@';
	char letra;
	char pts;
	
	public registrar() {
	setLayout(null); /*ANULA LAS PROPIEDADES POR DEFECTO*/
		
	titulo= new JLabel("REGISTRATE");/*VALOR DEL OBJETO*/
	titulo.setBounds(0,0,300,50);
	add(titulo);/*MUESTRA ESTO - (---)*/
	
	titulo.setHorizontalAlignment(SwingConstants.CENTER); /*alinea perfectamente el contenido llamado*/
	titulo.setFont(new Font("Cooper", 1,16));/*setFont incerta fuente de letra*/
	titulo.setForeground(Color.blue);	/*setForeground incerta color de letra*/	
	titulo.setOpaque(true);
	Color naranja = new Color(255,140,0); /*los numeros dentro del parentesis declaran el codigo de color elegido*/
	titulo.setBackground(naranja);	/*incerta un color al fondo del titulo*/
	
	etiquetaNOMBRE=new JLabel("NOMBRE:");
	etiquetaNOMBRE.setBounds(50, 60, 100, 20);
	add(etiquetaNOMBRE);
	
	cajaNOMBRE = new JTextField();
	cajaNOMBRE.setBounds(50, 80, 150, 20);
	add(cajaNOMBRE);
	
	etiquetaAPELLIDO= new JLabel("APELLIDO:");
	etiquetaAPELLIDO.setBounds(50, 100, 100, 20);
	add(etiquetaAPELLIDO);
	
	cajaAPELLIDO = new JTextField();
	cajaAPELLIDO.setBounds(50, 120, 150, 20);
	add(cajaAPELLIDO);
	
	etiquetaCORREO= new JLabel("CORREO:");
	etiquetaCORREO.setBounds(50, 140, 100, 20);
	add(etiquetaCORREO);
	
	cajaCORREO = new JTextField();
	cajaCORREO.setBounds(50, 160, 150, 20);
	add(cajaCORREO);
	
	etiquetaCONFC= new JLabel("CONFIRME CORREO:");
	etiquetaCONFC.setBounds(50, 180, 150, 20);
	add(etiquetaCONFC);
	
	cajaCONFC = new JTextField();
	cajaCONFC.setBounds(50, 200, 150, 20);
	add(cajaCONFC);
	
	etiquetaCONTRA= new JLabel("CONTRASEÑA:");
	etiquetaCONTRA.setBounds(50, 220, 100, 20);
	add(etiquetaCONTRA);
	
	cajaCONTRA = new JTextField();
	cajaCONTRA.setBounds(50, 240, 150, 20);
	add(cajaCONTRA);
	
	etiquetaCONFCO= new JLabel("CONFIRME CONTRASEÑA: ");
	etiquetaCONFCO.setBounds(50, 260, 150, 20);
	add(etiquetaCONFCO);
	
	cajaCONFCO = new JTextField();
	cajaCONFCO.setBounds(50, 280, 150, 20);
	add(cajaCONFCO);
	
	botoniniciar = new JButton("SIGUIENTE");
	botoniniciar.setBounds(100, 345, 160, 20);
	add(botoniniciar);
	botoniniciar.addActionListener(this);
	
	etiquetaMENSAJE1 = new JLabel();
	etiquetaMENSAJE1.setBounds(110, 60, 150, 20);
	add(etiquetaMENSAJE1);
	
	etiquetaMENSAJE2 = new JLabel();
	etiquetaMENSAJE2.setBounds(115, 100, 150, 20);
	add(etiquetaMENSAJE2);
    	
	etiquetaMENSAJE3 = new JLabel();
	etiquetaMENSAJE3.setBounds(115, 140, 150, 20);
	add(etiquetaMENSAJE3);
	
	etiquetaMENSAJE3 = new JLabel();
	etiquetaMENSAJE3.setBounds(115, 140, 150, 20);
	add(etiquetaMENSAJE3);
	
	etiquetaMENSAJE4 = new JLabel();
	etiquetaMENSAJE4.setBounds(135, 220, 150, 20);
	add(etiquetaMENSAJE4);
	
	etiquetaMENSAJE5 = new JLabel();
	etiquetaMENSAJE5.setBounds(195, 260, 150, 20);
	add(etiquetaMENSAJE5);

	etiquetaMensaje6 = new JLabel();
	etiquetaMensaje6.setBounds(170, 180, 150, 20);
	add(etiquetaMensaje6);
}
	
	public void actionPerformed(ActionEvent eventoSiguiente) {
		
		if(eventoSiguiente.getSource()==botoniniciar) {
			
			datoNombre = cajaNOMBRE.getText();
			extensionNm = datoNombre.length();
			
			datoApellido = cajaAPELLIDO.getText();
			extensionPl = datoApellido.length();
			
			datoCorreo = cajaCORREO.getText();
			extensionCorreo = datoCorreo.length();
			
			datoCC = cajaCONFC.getText();
			extensionCC = datoCC.length();
 			
			datoContraseña = cajaCONTRA.getText();
			extensionPassword = datoContraseña.length();
			
			datoConfContraseña = cajaCONFCO.getText();
			extensionCONFCO = datoConfContraseña.length();
			
			
		/*************nombres y apellidos************/
		if(datoNombre.equals("")) {
			
			etiquetaMENSAJE1.setText("ingresa tu nombre");
		}else{
			etiquetaMENSAJE1.setText("");
		}
		if(datoApellido.equals("")) {
			etiquetaMENSAJE2.setText("ingresa tu apellido");
		}else{
			etiquetaMENSAJE2.setText("");
		}
		/****************correo****************/
		if(datoCorreo.equals("")) {
			
			etiquetaMENSAJE3.setText("ingresa tu correo");				
		}else {
			for(int i = 0; i< extensionCorreo ; i++) {
				
				letra= datoCorreo.charAt(i);
				pts=datoCorreo.charAt(i);
				
				if(arroba==letra) {
					numeroDeArrobas++;
				}
				if(punto==pts){
					numeroDePuntos++;
				}
				if(numeroDeArrobas==1 && numeroDePuntos>=1){
					etiquetaMENSAJE3.setText("correo valido :)");
				}else if(datoCC.equals(datoCorreo)){
					etiquetaMensaje6.setText("confirmado");
				}
			}
		}
		/***********contraseña***************/
		if(datoContraseña.equals("")){
			etiquetaMENSAJE4.setText("ingresa tu password");
		}else{
			if(extensionPassword >=8 ){
				etiquetaMENSAJE4.setText("contraseña valida");
				}else{
					etiquetaMENSAJE4.setText("contraseña invalida");
				}
			}
		
			if(extensionPassword <= 0){
			etiquetaMENSAJE5.setText("vacio");
		}else if(datoConfContraseña.equals(datoContraseña)){
			etiquetaMENSAJE5.setText("confirmado");
			
		}else{
			etiquetaMENSAJE5.setText("repite");
		}
		
		}
		}
		
		
	


public static void main(String [] args) {
	
	registrar instancia = new registrar();
	
	/*DIMENSIONES DE NUESTRA VENTANA*/
	instancia.setBounds(0, 0, 300, 450); /*EN DONDE QUIERES QUE APAREZCA LA VENTANA*/
	instancia.setVisible(true); /*QUE SEA VISIBLE LA VENTANA*/
	instancia.setResizable(false);/*RESPETA LAS MEDIDAS*/
	instancia.setLocationRelativeTo(null); /*HACE QUE APAREZCA LA VENTANA CENTRADA*/
	
}
	
}
