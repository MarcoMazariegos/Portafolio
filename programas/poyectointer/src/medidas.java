
public class medidas {

/******************KILOGRAMOS AL RESTO DE MEDIDAS************/
	public String gramos(String dato ){		
		String resultados = "";
		double datoC = Double.parseDouble(dato);
		double respuesta= datoC * 1000;
		resultados = String.valueOf(respuesta);
		return resultados; /*retorna la respuesta de conversion*/
	}
	
    public String Hectogramos(String dato ){
		String resultados = "";
		double datoC = Double.parseDouble(dato);
		double respuesta= datoC * 1000;
		double respuesta2 = respuesta / 100;
		resultados = String.valueOf(respuesta2);
		return resultados; /*retorna la respuesta de conversion*/
	}
    public String Decagramos(String dato ){
		String resultados = "";
		double datoC = Double.parseDouble(dato);
		double respuesta= datoC * 1000;
		double respuesta2 = respuesta / 10;
		resultados = String.valueOf(respuesta2);
		return resultados; /*retorna la respuesta de conversion*/
	}
    public String decigramos(String dato ){
		String resultados = "";
		double datoC = Double.parseDouble(dato);
		double respuesta= datoC * 1000;
		double respuesta2 = respuesta * 10;
		resultados = String.valueOf(respuesta2);	
		return resultados; /*retorna la respuesta de conversion*/
	}
    public String centigramos(String dato ){	
		String resultados = "";
		double datoC = Double.parseDouble(dato);
		double respuesta= datoC * 1000;
		double respuesta2 = respuesta * 100;
		resultados = String.valueOf(respuesta2);
		return resultados; /*retorna la respuesta de conversion*/
	}
    public String miligramos(String dato ){
		String resultados = "";
		double datoC = Double.parseDouble(dato);
		double respuesta= datoC * 1000;
		double respuesta2 = respuesta * 1000;
		resultados = String.valueOf(respuesta2);
		return resultados; /*retorna la respuesta de conversion, ese mismo proceso sigue
		en las otras clases de este tipo que retorna el dato*/
	} 
    /***************CENTIGRAMOS A LAS OTRAS MEDIDAS************************/
    
    public String gramos2(String dato ){
		String resultados = "";
		double datoC = Double.parseDouble(dato);
		double respuesta= datoC * 100;
		resultados = String.valueOf(respuesta);
		return resultados;
	}
    public String Decagramos2(String dato ){
		String resultados = "";
		double datoC = Double.parseDouble(dato);
		double respuesta= datoC * 100;
		double respuesta2 = respuesta / 10;
		resultados = String.valueOf(respuesta2);
		return resultados;
	}
    public String Kilogramos(String dato ){
		String resultados = "";
		double datoC = Double.parseDouble(dato);
		double respuesta= datoC * 100;
		double respuesta2 = respuesta / 1000;
		resultados = String.valueOf(respuesta2);
		return resultados;
	}
    public String decigramos2(String dato ){
		String resultados = "";
		double datoC = Double.parseDouble(dato);
		double respuesta= datoC * 100;
		double respuesta2 = respuesta * 10;
		resultados = String.valueOf(respuesta2);
		return resultados;
	}
    public String centigramos2(String dato ){
		String resultados = "";
		double datoC = Double.parseDouble(dato);
		double respuesta= datoC * 100;
		double respuesta2 = respuesta * 100;
		resultados = String.valueOf(respuesta2);
		return resultados;
	}
    public String miligramos2(String dato ){
		String resultados = "";
		double datoC = Double.parseDouble(dato);
		double respuesta= datoC * 100;
		double respuesta2 = respuesta * 1000;
		resultados = String.valueOf(respuesta2);
		return resultados;
	} 
    
 /***************DECAGRAMOS A LAS OTRAS MEDIDAS********************/
    public String gramos3(String dato ){
		String resultados = "";
		double datoC = Double.parseDouble(dato);
		double respuesta= datoC * 10;
		resultados = String.valueOf(respuesta);
		return resultados;
	}
    public String Hectogramos2(String dato ){
		String resultados = "";
		double datoC = Double.parseDouble(dato);
		double respuesta= datoC * 10;
		double respuesta2 = respuesta / 100;
		resultados = String.valueOf(respuesta2);
		return resultados;
	}
    public String Kilogramos2(String dato ){
		String resultados = "";
		double datoC = Double.parseDouble(dato);
		double respuesta= datoC * 10;
		double respuesta2 = respuesta / 1000;
		resultados = String.valueOf(respuesta2);
		return resultados;
	}
    public String decigramos3(String dato ){
		String resultados = "";
		double datoC = Double.parseDouble(dato);
		double respuesta= datoC * 10;
		double respuesta2 = respuesta * 10;
		resultados = String.valueOf(respuesta2);
		return resultados;
	}
    public String centigramos3(String dato ){
		String resultados = "";
		double datoC = Double.parseDouble(dato);
		double respuesta= datoC * 10;
		double respuesta2 = respuesta * 100;
		resultados = String.valueOf(respuesta2);
		return resultados;
	}
    public String miligramos3(String dato ){
		String resultados = "";
		double datoC = Double.parseDouble(dato);
		double respuesta= datoC * 10;
		double respuesta2 = respuesta * 1000;
		resultados = String.valueOf(respuesta2);
		return resultados;
	} 
    
  /**************GRAMOS A EL RESTO DE MEDIDAS***************/
    
    public String Kilogramos3(String dato ){
		
		String resultados = "";
		double datoC = Double.parseDouble(dato);
		double respuesta= datoC * 1;
		double respuesta2 = respuesta / 1000;
		resultados = String.valueOf(respuesta2);
		return resultados;
	}
    public String Hectogramos3(String dato ) {
		String resultados = "";
		double datoC = Double.parseDouble(dato);
		double respuesta= datoC * 1;
		double respuesta2 = respuesta / 100;
		resultados = String.valueOf(respuesta2);
		return resultados;
	}
    public String Decagramos3(String dato ){
		String resultados = "";
		double datoC = Double.parseDouble(dato);
		double respuesta= datoC * 1;
		double respuesta2 = respuesta / 10;
		resultados = String.valueOf(respuesta2);
		return resultados;
	}
    public String decigramos4(String dato ){
		String resultados = "";
		double datoC = Double.parseDouble(dato);
		double respuesta= datoC * 1;
		double respuesta2 = respuesta * 10;
		resultados = String.valueOf(respuesta2);
		return resultados;
	}
    public String centigramos4(String dato ){
		String resultados = "";
		double datoC = Double.parseDouble(dato);
		double respuesta= datoC * 1;
		double respuesta2 = respuesta * 100;
		resultados = String.valueOf(respuesta2);
		return resultados;
	}
    public String miligramos4(String dato ){
		String resultados = "";
		double datoC = Double.parseDouble(dato);
		double respuesta= datoC * 1;
		double respuesta2 = respuesta * 1000;
		resultados = String.valueOf(respuesta2);
		return resultados;
	} 
 /*******************DECIGRAMOS AL RESTO DE MEDIDAS******************/
    public String gramos4(String dato ){
		String resultados = "";
		double datoC = Double.parseDouble(dato);
		double respuesta= datoC / 10;
		resultados = String.valueOf(respuesta);
		return resultados;
	}  
    public String Decagramos4(String dato ){
		String resultados = "";
		double datoC = Double.parseDouble(dato);
		double respuesta= datoC / 10;
		double respuesta2 = respuesta / 100;
		resultados = String.valueOf(respuesta2);
		return resultados;
	}
    public String Hectogramos4(String dato ) {
		String resultados = "";
		double datoC = Double.parseDouble(dato);
		double respuesta= datoC / 10;
		double respuesta2 = respuesta / 1000;
		resultados = String.valueOf(respuesta2);
		return resultados;
	}
    public String Kilogramos4(String dato ){
		
		String resultados = "";
		double datoC = Double.parseDouble(dato);
		double respuesta= datoC / 10;
		double respuesta2 = respuesta / 10000;
		resultados = String.valueOf(respuesta2);
		return resultados;
	}
    public String centigramos5(String dato ){
		String resultados = "";
		double datoC = Double.parseDouble(dato);
		double respuesta= datoC /10;
		double respuesta2 = respuesta * 100;
		resultados = String.valueOf(respuesta2);
		return resultados;
	}
    public String miligramos5(String dato ){
		String resultados = "";
		double datoC = Double.parseDouble(dato);
		double respuesta= datoC / 10;
		double respuesta2 = respuesta * 1000;
		resultados = String.valueOf(respuesta2);
		return resultados;
	}
    /*************CENTIGRAMOS AL RESTO DE MEDIDAS************************/
    public String gramos5(String dato ){
		String resultados = "";
		double datoC = Double.parseDouble(dato);
		double respuesta= datoC / 100;
		resultados = String.valueOf(respuesta);
		return resultados;
	}
    public String Decagramos5(String dato ){
		String resultados = "";
		double datoC = Double.parseDouble(dato);
		double respuesta= datoC / 100;
		double respuesta2 = respuesta / 1000;
		resultados = String.valueOf(respuesta2);
		return resultados;
	}
    public String Hectogramos5(String dato ) {
		String resultados = "";
		double datoC = Double.parseDouble(dato);
		double respuesta= datoC / 100;
		double respuesta2 = respuesta / 10000;
		resultados = String.valueOf(respuesta2);
		return resultados;
	}
    public String Kilogramos5(String dato ){
		
		String resultados = "";
		double datoC = Double.parseDouble(dato);
		double respuesta= datoC / 100;
		double respuesta2 = respuesta / 100000;
		resultados = String.valueOf(respuesta2);
		return resultados;
	}
    public String decigramos5(String dato ){
		String resultados = "";
		double datoC = Double.parseDouble(dato);
		double respuesta= datoC / 100;
		double respuesta2 = respuesta * 10;
		resultados = String.valueOf(respuesta2);
		return resultados;
	}
    public String miligramos6(String dato ){
		String resultados = "";
		double datoC = Double.parseDouble(dato);
		double respuesta= datoC / 100;
		double respuesta2 = respuesta * 1000;
		resultados = String.valueOf(respuesta2);
		return resultados;
	}
    /*****************DE MILIGRAMOS A EL RESTO DE MEDIDAS****************/
    
    public String gramos6(String dato ){
		String resultados = "";
		double datoC = Double.parseDouble(dato);
		double respuesta= datoC / 1000;
		resultados = String.valueOf(respuesta);
		return resultados;
	}
    public String Decagramos6(String dato ){
		String resultados = "";
		double datoC = Double.parseDouble(dato);
		double respuesta= datoC / 1000;
		double respuesta2 = respuesta / 10000;
		resultados = String.valueOf(respuesta2);
		return resultados;
	}
    public String Hectogramos6(String dato ) {
		String resultados = "";
		double datoC = Double.parseDouble(dato);
		double respuesta= datoC / 1000;
		double respuesta2 = respuesta / 100000;
		resultados = String.valueOf(respuesta2);
		return resultados;
	}
    public String Kilogramos6(String dato ){
		
		String resultados = "";
		double datoC = Double.parseDouble(dato);
		double respuesta= datoC / 1000;
		double respuesta2 = respuesta / 1000000;
		resultados = String.valueOf(respuesta2);
		return resultados;
	}
    public String decigramos6(String dato ){
		String resultados = "";
		double datoC = Double.parseDouble(dato);
		double respuesta= datoC / 1000;
		double respuesta2 = respuesta * 10;
		resultados = String.valueOf(respuesta2);
		return resultados;
	}
    public String centigramos6(String dato ){
		String resultados = "";
		double datoC = Double.parseDouble(dato);
		double respuesta= datoC /1000;
		double respuesta2 = respuesta * 100;
		resultados = String.valueOf(respuesta2);
		return resultados;
	}
    
    
}
