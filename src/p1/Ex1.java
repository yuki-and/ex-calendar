package p1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex1 {

	public static void main(String[] args) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年M月d日はE曜日です");
		
		LocalDate localDate = LocalDate.of(2020, 7, 24);
		System.out.println("オリンピックが開催される");
		System.out.println(localDate.format(formatter));
	
		LocalDate localDate2 = LocalDate.of(1995, 5, 31);
		System.out.println("自分の誕生日である");
		System.out.println(localDate2.format(formatter));
	}

}
