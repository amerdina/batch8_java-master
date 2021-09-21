package day21_WrapperClassAndLocalDate;

import java.time.LocalDate;

public class LocalDateTest {

	public static void main(String[] args) {
		 LocalDate date=LocalDate.now();
System.out.println(date);

LocalDate tomorrow=date.plusDays(1);
System.out.println(tomorrow);

 LocalDate yesterday=date.minusDays(1);
System.out.println(yesterday);

LocalDate lastYearToday=date.minusYear(1);
System.out.println(lastYearToday);

System.out.println(date.isLeapYear());
System.out.println(lastYearToday.is);
int Year=date.getYear();

//localDate.of ordedDate=LocalDate.of()
LocalDate ordedDate=LocalDate.of(2021,8,15);
LocalDate orderedDate;
LocalDate policyDate=orderedDate.plusDays(30);

 



	}

}
