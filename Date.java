package Date;
//clase fecha
public class Date{
	//Atributos
	private int _day;
	private int _month;
	private int _year;

	/** Constructor */
	private Date(int day, int month, int year){
		this.day = _day;
		this.month = _month;
		this.year = _year;
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

	/**Condiciones para el día**/
	public void setDay(int day){

	}
	/**Condiciones para el mes**/
	public void setMonth(int month){
		
	}
	/**Condiciones para el anyo**/
	public void setYear(int year){

	}
}
