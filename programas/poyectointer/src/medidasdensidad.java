
public class medidasdensidad {

	public String AIRE (String dato) {
		String resultado = "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC *0.0013;
	    resultado = String.valueOf(operacion);
		return resultado;  /*retorna la respuesta de una conversion*/
	}
	public String HIELO (String dato) {
		String resultado = "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC* 0.92;
		resultado = String.valueOf(operacion);
		return resultado; /*retorna la respuesta de una conversion*/
	}
	public String AGUA (String dato) {
		String resultado = "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC *1;
		resultado = String.valueOf(operacion);
		return resultado; /*retorna la respuesta de una conversion*/
	}
	public String AGUAMAR (String dato) {
		String resultado = "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC *1.04;
		resultado = String.valueOf(operacion);
		return resultado; /*retorna la respuesta de una conversion*/
	}
	public String ALUMINIO (String dato) {
		String resultado = "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC *2.7;
		resultado = String.valueOf(operacion);
		return resultado; /*retorna la respuesta de una conversion*/
	}
	public String HIERRO (String dato) {
		String resultado = "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC *7.9;
		resultado = String.valueOf(operacion);
		return resultado; /*retorna la respuesta de una conversion*/
	}
	public String COBRE (String dato) {
		String resultado = "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC*8.4;
		resultado = String.valueOf(operacion);
		return resultado; /*retorna la respuesta de una conversion*/
	}
	public String MERCURIO (String dato){
		String resultado = "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC*13.6;
		resultado = String.valueOf(operacion);
		return resultado; /*retorna la respuesta de una conversion*/
	}
	public String ORO (String dato) {
		String resultado = "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC*19.3;
		resultado = String.valueOf(operacion);
		return resultado; /*retorna la respuesta de una conversion*/
	}
}
