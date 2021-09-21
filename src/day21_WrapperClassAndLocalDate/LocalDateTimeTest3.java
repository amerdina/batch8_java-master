package day21_WrapperClassAndLocalDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest3 {

	public static void main(String[] args) {
//		Loca 
//		LocalDate today=LocalDate.now();
//		LocalDate
//		
		//find out which day were you born?
//LocalDate bdy = LocalDate.of(1973,  10, 17);
//		
//DateTimeFormatter formater = DateTimeFormatter.ofPatternLoc("MMMM/dd/yyyy, EEEE");
//		System.out.println(bdy.format(formater));
//		
//		
//		System.out.println(bornDate.format(day));
//		DateTimeFormater df=DateTimeFormater.ofPattern("MMMM/dd/yyyy,EEEE");
	//	DateTimeFormater dtf=DateTimeFormater.ofPattern("EEE/dd/yyyy,EEEE");
		
	  
	 int month1=today.getMonthValue();
	 int month2=bdy.getMonthValue();
	 
	 int day1=today.getDayOfMonth();
	 int day2=bdy.getDayOfMonth();
	 
	 if(month1==month2&&day1==day2) {
		
		System.out.println("Happy Birthday BODY");
		

	}

}
