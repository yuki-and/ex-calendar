package p1;

import java.time.LocalDateTime;

public class Ex2_6 {

	public static void main(String[] args) {

		LocalDateTime localDateTime = LocalDateTime.of(2000, 1, 1, 0, 0, 0);
		localDateTime = localDateTime.plusYears(1);
		localDateTime = localDateTime.plusMonths(2);
		localDateTime = localDateTime.plusDays(3);
		localDateTime = localDateTime.plusHours(4);
		localDateTime = localDateTime.plusMinutes(5);
		localDateTime = localDateTime.plusSeconds(6);
		
		System.out.println(localDateTime);
	}

}
