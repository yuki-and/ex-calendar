import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Exercise2_5 {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.of(2008, 2, 1);
		localDate = localDate.with(TemporalAdjusters.lastDayOfMonth());
		int lastDay = localDate.getDayOfMonth();
		System.out.println(lastDay);
	}
	
}
