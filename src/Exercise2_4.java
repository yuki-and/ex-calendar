import java.time.LocalDate;

public class Exercise2_4 {
	public static void main(String[] args) {
		
		LocalDate localdate = LocalDate.of(1995, 5, 31);
		
		int year = localdate.getYear();
		int month = localdate.getMonthValue();
		int dayOfMonth = localdate.getDayOfMonth();
		
	
		System.out.println("私の誕生日は" + year + "年" + month + "月"  + dayOfMonth + "です");
	}
}
