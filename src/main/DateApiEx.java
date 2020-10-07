package main;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateApiEx {
	
	public static void main(String[] args) {
		
		String nowDate = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		System.out.println(nowDate);
		
	
		LocalDateTime nowDateTime = LocalDate.now().atTime(LocalTime.MAX);
		System.out.println(nowDateTime);
		
		Instant timestamp = Instant.now();
		System.out.println(timestamp.toEpochMilli());
		
		System.out.println(Instant.ofEpochMilli(new Long("1579001415775")));

	}

}
