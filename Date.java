package Date;
//clase fecha
public class Date{
	//Atributos
	private int _day;
	private int _month;
	private int _year;

	/** Constructor */
	private Date(int day, int month, int year){
		/*Para diferencia los atributos de los parametros*/
		this._day = day;
		this._month = month;
		this._year = year;
	}
	/** Para obtener la fecha**/
	public int getDate(){
		return _day;
	}

	/** Para obtener el mes **/
	public int getMonth(){
		return _month;
	}
	
	/**Para obtener el anyo **/
	public int getYear(){
		return _year;
	}

	/**Condiciones para el día. Modificar**/
	public void setDay(int day){
		_day = day;
	}
	/**Condiciones para el mes.Modificar.**/
	public void setMonth(int month){
		
	}
	/**Condiciones para el anyo.Modificar.**/
	public void setYear(int year){
		
	}

  	public String nameMonth(){
		String cadena = new String("");
		switch(_month){
		case 1: mes = "Enero";
			break;
		case 2: mes = "Febrero";
			break;
		case 3: mes = "Marzo";
			break;
		case 4: mes = "Abril";
			break;
		case 5: mes = "Mayo";
			break;
		case 6: mes = "Junio";
			break;
		case 7: mes = "Julio";
			break;
		case 8: mes = "Agosto"; 
			break;
		case 9: mes = "Septiembre";
			break;
		case 10: mes = "Octubre";
			break;
		case 11: mes = "Noviembre";
			break;
		case 12: mes = "Diciembre";
			break;
		}
		return cadena;
	}

	public boolean correctoMonth(){
		boolean correcto = true;
		/*El switch va relacionado con los meses 
		 * y el if con los días 
		*/
                switch(_month){
		case 1: 
			if((_day>=31) && (_day<=0)){
				correcto=false;
			}
			break;
		case 2: if((_day<=29) && (_day >=0)){
				correcto=false;
			}
			break;
		case 3: 
			if((_day<=31) && (_day>=0)){
				correcto= false;
			}
			break;
		case 4: 
			if((_day<=30) && (_day>=0)){
				correcto= false;
			}
			break;
		case 5: 
			if((_day<=31) && (_day>=0)){
				correcto= false;
			}
			break;
		case 6: 
			if((_day<=30) && (day>=0)){
				correcto = false;
			}
			break;
		case 7:
			if((_day<=31) && (_day>=0)){
				correcto = false;
			}
			break;
		case 8: 
			if((_day<=31) && (_day>=0)){
				correcto= false;
			}
			break;
		case 9: 
			if((_day<=30)&& (_day>=0)){
				correcto = false;
			}
			break;
		case 10:
			if((_day<=31) && (_day>=0)){
				correcto = false;
			}
			break;
		case 11: 
			if((_day<=30) && (_day>=0)){
				correcto= false;
			}
			break;
		case 12: 
			if((_day<=31)&& (_day>=0)){
				correcto = false;
			}
			break;
		}
	return correcto;
	}
	public String seasonMonth(){
		String season = new String("");
		switch(_month){
		case 1:
		case 2:
			season = "Invierno";
			break;
		case 3: 
			if(_day<21){
				season = "Invierno";
			}else{
				season= "Primavera";
			}
			break;
		case 4:
		case 5: 	
			season = "Primavera";
		case 6:
			if(_day<21){		
				season = "Primavera";
			}else{
				season = "Verano";
			}
			break;
		case 7: 
		case 8: 
			season= "Verano";
			break;
		case 9:
			if(_day<23){
				season = "Verano";
			}else{
				season = "Otonyo";
			}
			break;
		case 10:
		case 11:
			season = "Otonyo";
		case 12:
			if(_day>21){
				season = "Otonyo";
			}else{
				season= "Invierno";
			}
	return season;	
	}


}
