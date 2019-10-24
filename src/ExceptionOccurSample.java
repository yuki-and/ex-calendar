
public class ExceptionOccurSample {

	public static void main(String[] args) {

		int[] a = new int[3];
		System.out.println("プログラム開始");
		try {
			a[5] = 100;	//例外発生 
			System.out.println("例外が発生しませんでした");
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("例外発生！");
		}
		System.out.println("プログラム終了");			
	}
}
