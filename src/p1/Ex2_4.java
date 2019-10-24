package p1;

import java.time.LocalDate;

public class Ex2_4 {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.of(1995, 5, 31);
		int year = localDate.getYear();
		int month = localDate.getMonthValue();
		int day = localDate.getDayOfMonth();
		System.out.println("私の誕生日は" + year + "年" + month + "月" + day + "日です");
	}

}
