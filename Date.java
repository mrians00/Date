package Date;
//clase fecha
public class Date{
	//Atributos
	private int _day;
	private int _month;
	private int _year;

	/* Constructor */
	private Date(int day, int month, int year){
		/*Para diferencia los atributos de los parametros*/
		this._day = day;
		this._month = month;
		this._year = year;
	}
	/**
	 * Para obtener get
	 * Para modificar set
	*/
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
		_month = month;
	}
	/**Condiciones para el anyo.Modificar.**/
	public void setYear(int year){
		_year= year;
	}
	
	public void daysOfMonths(){
		int equalsMonth = new g();
		switch(_month){
		case 1: 
		case 3:
		case 5:		
			
			break;
		case 2: if((_day<=29) && (_day>=0)){
			}	
			break;
		case 3: 
			if((_day<=31) && (_day>=0)){
			}
			break;
		case 4: 
			if((_day<=30) && (_day>=0)){
			}
			break;
		case 5:
			if((_day<=31) && (_day>=0)){
				
			}
			break;
		case 6: 
			if((_day<=30) && (day>=0)){
				
			}
			break;
		case 7:
			if((_day<=31) && (_day>=0)){
				
			}
			break;
		case 8: 
			if((_day<=31) && (_day>=0)){
			}
			break;
		case 9: 
			if((_day<=30)&& (_day>=0)){
				
			}
			break;
		case 10:
			if((_day<=31) && (_day>=0)){
				
			}
			break;
		case 11: 
			if((_day<=30) && (_day>=0)){
				
			}
			break;
		case 12: 
			if((_day<=31)&& (_day>=0)){
			}
			break;

	}






	/*Imprimir el mes*/
  	public String getMonthName(){
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

	public boolean getMonthCorrect extends (){
		boolean correcto = true;
		/* 
		 *If-corresponde con el día, son los casos falsos.
		 *El switch va relacionado con los meses.
		 * 
		*/
                switch(_month){
		case 1: 
			if((_day>31) && (_day<=0)){
				correcto=false;
			}
			break;
		case 2: if((_day>29) && (_day <=0)){
				correcto=false;
			}
			break;
		case 3: 
			if((_day>31) && (_day<=0)){
				correcto= false;
			}
			break;
		case 4: 
			if((_day>30) && (_day<=0)){
				correcto= false;
			}
			break;
		case 5: 
			if((_day>31) && (_day<=0)){
				correcto= false;
			}
			break;
		case 6: 
			if((_day>30) && (day<=0)){
				correcto = false;
			}
			break;
		case 7:
			if((_day>=31) && (_day<=0)){
				correcto = false;
			}
			break;
		case 8: 
			if((_day>=31) && (_day<=0)){
				correcto= false;
			}
			break;
		case 9: 
			if((_day>=30)&& (_day<=0)){
				correcto = false;
			}
			break;
		case 10:
			if((_day>=31) && (_day<=0)){
				correcto = false;
			}
			break;
		case 11: 
			if((_day>=30) && (_day<=0)){
				correcto= false;
			}
			break;
		case 12: 
			if((_day>=31)&& (_day<=0)){
				correcto = false;
			}
			break;
		}
	return correcto;
	}
	
	/*
	*Estaciones 
	*/
	public String getMonthseason(){
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
			break;
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
			break;
		case 12:
			if(_day>21){
				season = "Otonyo";
			}else{
				season= "Invierno";
			}
		}
	return season;	
	}
	
	/* 
	 *Date-(day, month, year)
	 *Imprimir los meses que quedan hasta el final del anyo
	 *Capturar la excepcion
	*/
	public String getMonthLeft( int month){
		
		StringBuffer meses = new StringBuffer();
		try{
			for(i=this._month +1; i <=12 ; i++){
				
				meses.append("Quedan"+meses);
			}
		}catch(DateException Exception){
			System.err.println(exception.toString());
		}

	return meses;
	}
	 
	/*
	 *
	 *Estamos poniendo los casos en los que no se imprimiria y los lanzamos a DateException
	 */
	public String getDate(int day, int month, int year) throws DateException{
	StringBuffer date = new StringBuffer();
		if(_day<=0){
			date.append("Fallo, no existe el día");
		}
		if(_month<=0){
			date.append("Fallo, no existe el mes");
			}else{
				if(_month>=12){
					date.append("Fallo, no existe el mes");
				}
			}else{
				if(_day>this.dayOfMonth(_month)){
					date.append("Fallo, el día no corresponde con el mes" );
				}
			}
		if(_year<0){
			date.append("Fallo, no existe el anyo");
		}
		
		if(date.legth() !=0){
			throw new DateException(date.toString);
		}else{
			this._day =day;
			this._month = month;
			this._year= year;
		}



	}



	/*Escribir la fecha*/
	public String printsDate(){
	StringBuffer fecha = new StringBuffer();
	fecha.append(getDay()+ "," +getMonth()+ "," +getYear());
	}

	/*
	*Imprimir los días hasta el fin del mes
	*	
	*/

	public String getDayLeft(int day, int month){
	StringBuffer dias = StringBuffer();
	
	for(i=this._day +1; i=daysOfMonths(this._month);i++){
		dias.append("Quedan "+dias+ "para terminar el año");




	}


	}




	/*
	*Imprimir los meses que tengan los mismos días de esa fecha.
	*isSameMonths	
	*/
	public String isSameDays( ){
	StringBuffer equalsDays = new StringBuffer();
		if(this._day == daysOfMonths()){
			equalsDays.append("" +day);
		}
	}

	/*
	*
	*/







}
