package java15;

import java.util.Calendar;
import java.util.Date;

public class Code15_12 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();

		// 6つのint型からDateインスタンスを生成
		c.set(2024, 2, 3, 1, 23, 45);
		c.set(Calendar.MONTH, 9);
		
		Date d = c.getTime();
		System.out.println(d);
		
		// Dateインスタンスからint型を生清
		Date now = new Date();
		c.setTime(now);
		
		int y = c.get(Calendar.YEAR);
		System.out.println("今年は" + y + "年です");
	}
}
