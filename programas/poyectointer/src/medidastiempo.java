
public class medidastiempo {
/********************AÑOS A DEMAS MEDIDAS***********************/
	public String dia(String dato) {
		String resultado = "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC * 365;
		resultado = String.valueOf(operacion);
		return resultado; /*retorna la respuesta de tiempo*/
	}
	public String semana(String dato) {
		String resultado = "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC * 365;
		double operacion2 = operacion / 7;
		resultado = String.valueOf(operacion2);
		return resultado; /*retorna la respuesta de tiempo*/
	}
	public String mes (String dato) {
		String resultado = "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC*12;
		resultado = String.valueOf(operacion);
		return resultado; /*retorna la respuesta de tiempo*/
	}
	public String hora (String dato) {
		String resultado= "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC*365;
		double operacion2 = operacion*24;
		resultado = String.valueOf(operacion2);
		return resultado; /*retorna la respuesta de tiempo*/
	}
	public String minuto(String dato) {
		String resultado = "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC*365;
		double operacion2 = operacion*24;
		double operacion3 = operacion2*60;
		resultado = String.valueOf(operacion3);
		return resultado; /*retorna la respuesta de tiempo*/
	}
	public String segundo(String dato) {
		String resultado = "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC*365;
		double operacion2 = operacion*24;
		double operacion3 = operacion2*60;
		double operacion4 = operacion3*60;
		resultado = String.valueOf(operacion4);
		return resultado; /*retorna la respuesta de tiempo, y asi sucesivamente, las otras 
		cumplen con el mismo ojetivo que estas, solo que recieben datos diferentes "mayores" o "menores"*/
	}
/**************MESES A DEMAS MEDIDAS*************************/
	public String dia2(String dato) {
		String resultado = "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC *30.417;
		resultado = String.valueOf(operacion);
		return resultado;
	}
	public String semana2(String dato) {
		String resultado = "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC * 30;
		double operacion2 = operacion / 7;
		resultado = String.valueOf(operacion2);
		return resultado;
	}
	public String año(String dato) {
		String resultado = "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC / 12;
		resultado = String.valueOf(operacion);
		return resultado;
	}
	public String hora2 (String dato) {
		String resultado= "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC*30;
		double operacion2 = operacion*24;
		resultado = String.valueOf(operacion2);
		return resultado;
	}
	public String minuto2(String dato) {
		String resultado = "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC*30;
		double operacion2 = operacion*24;
		double operacion3 = operacion2*60;
		resultado = String.valueOf(operacion3);
		return resultado;
	}
	public String segundo2(String dato) {
		String resultado = "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC*30;
		double operacion2 = operacion*24;
		double operacion3 = operacion2*60;
		double operacion4 = operacion3*60;
		resultado = String.valueOf(operacion4);
		return resultado;
	}
/**********************SEMANAS A DEMAS MEDIDAS******************/
	public String año2(String dato) {
		String resultado ="";
		double datoC = Double.parseDouble(dato);
		double operacion2 = datoC/52.143;
		resultado = String.valueOf(operacion2);
		return resultado;
	}
	public String mes2 (String dato) {
		String resultado = "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC/4.345;
		resultado = String.valueOf(operacion);
		return resultado;
	}
	public String dia3(String dato) {
		String resultado = "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC * 7;
		resultado = String.valueOf(operacion);
		return resultado;
	}
	public String hora3 (String dato) {
		String resultado= "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC*7;
		double operacion2 = operacion*24;
		resultado = String.valueOf(operacion2);
		return resultado;
	}
	public String minuto3(String dato) {
		String resultado = "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC*7;
		double operacion2 = operacion*24;
		double operacion3 = operacion2*60;
		resultado = String.valueOf(operacion3);
		return resultado;
	}
	public String segundo3(String dato) {
		String resultado = "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC*7;
		double operacion2 = operacion*24;
		double operacion3 = operacion2*60;
		double operacion4 = operacion3*60;
		resultado = String.valueOf(operacion4);
		return resultado;
	}
	/****************DIAS A DEMAS MEDIDAS*******************/
	public String año3(String dato) {
		String resultado ="";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC/365;
		resultado = String.valueOf(operacion);
		return resultado;
	}
	public String mes3 (String dato) {
		String resultado = "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC/30.417;
		resultado = String.valueOf(operacion);
		return resultado;
	}
	public String semana3(String dato) {
		String resultado = "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC / 7;
		resultado = String.valueOf(operacion);
		return resultado;
	}
	public String hora4 (String dato) {
		String resultado= "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC*24;
		resultado = String.valueOf(operacion);
		return resultado;
	}
	public String minuto4(String dato) {
		String resultado = "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC*24;
		double operacion2 = operacion*60;
		resultado = String.valueOf(operacion2);
		return resultado;
	}
	public String segundo4(String dato) {
		String resultado = "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC*24;
		double operacion2 = operacion*60;
		double operacion3 = operacion2*60;
		resultado = String.valueOf(operacion3);
		return resultado;
	}
	/*****************HORAS A DEMAS MEDIDAS********************/
	public String año4(String dato) {
		String resultado ="";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC/8760;
		resultado = String.valueOf(operacion);
		return resultado;
	}
	public String mes4 (String dato) {
		String resultado = "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC/730;
		resultado = String.valueOf(operacion);
		return resultado;
	}
	public String semana4(String dato) {
		String resultado = "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC / 168;
		resultado = String.valueOf(operacion);
		return resultado;
	}
	public String dia4(String dato) {
		String resultado = "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC / 24;
		resultado = String.valueOf(operacion);
		return resultado;
	}
	public String minuto5(String dato) {
		String resultado = "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC * 60;
		resultado = String.valueOf(operacion);
		return resultado;
	}
	public String segundo5(String dato) {
		String resultado = "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC * 3600;
		resultado = String.valueOf(operacion);
		return resultado;
	}
	/******************MINUTOS A DEMAS MEDIDAS********************/
	public String año5(String dato) {
		String resultado ="";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC/525600;
		resultado = String.valueOf(operacion);
		return resultado;
	}
	public String mes5 (String dato) {
		String resultado = "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC/43800;
		resultado = String.valueOf(operacion);
		return resultado;
	}
	public String semana5(String dato) {
		String resultado = "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC / 10080;
		resultado = String.valueOf(operacion);
		return resultado;
	}
	public String dia5(String dato) {
		String resultado = "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC / 1440;
		resultado = String.valueOf(operacion);
		return resultado;
	}
	public String hora5 (String dato) {
		String resultado= "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC/60;
		resultado = String.valueOf(operacion);
		return resultado;
	}
	public String segundo6(String dato) {
		String resultado = "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC * 60;
		resultado = String.valueOf(operacion);
		return resultado;
	}
	/*************************SEGUNDOS A DEMAS MEDIDAS***************************/
	public String año6(String dato) {
		String resultado ="";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC/3.154e+7;
		resultado = String.valueOf(operacion);
		return resultado;
	}
	public String mes6 (String dato) {
		String resultado = "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC/2.628e+6;
		resultado = String.valueOf(operacion);
		return resultado;
	}
	public String semana6(String dato) {
		String resultado = "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC / 604800;
		resultado = String.valueOf(operacion);
		return resultado;
	}
	public String dia6(String dato) {
		String resultado = "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC / 86400;
		resultado = String.valueOf(operacion);
		return resultado;
	}
	public String hora6 (String dato) {
		String resultado= "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC/3600;
		resultado = String.valueOf(operacion);
		return resultado;
	}
	public String minuto6(String dato) {
		String resultado = "";
		double datoC = Double.parseDouble(dato);
		double operacion = datoC / 60;
		resultado = String.valueOf(operacion);
		return resultado;
	}
}
