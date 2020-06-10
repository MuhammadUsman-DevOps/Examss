package pk.cui.sc.exam.lab;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Lab {

	static Date today = new Date();
	public static int fahrenheitToCentigrade(int fahrenheit) {
	return (fahrenheit - 32) * 5 / 9;
	}
	public static int centigradeToFahrenheit(int centigrade) {
	return centigrade * 9 / 5 + 32;
	}
	public static String removeSignOfExclaimation(String in){
	if(in==null||in.length()==0)
	return in;
	return in.replaceAll("!", "");
	}
	public static int getCurrentDay(){
	LocalDate localDate = today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	return localDate.getDayOfMonth();
	}
	public static int getCurrentMonth(){
	LocalDate localDate = today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	return localDate.getMonthValue();
	}
	public static int getCurrentYear(){
	LocalDate localDate = today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	return localDate.getYear();
	}

}
