package java15;

public class Code15_4 {
	public static void main(String[] args) {
		// 通常の文字列連結
		String str = "";
		// 計測開始
		MeasureTime.start();
		for (int i = 0; i < 10000; i++) {
			str += "n";
		}
		// 計測終了
		MeasureTime.end();
		System.out.println("文字列連結:" + MeasureTime.getTime() / 1000 + "マイクロ秒");

		// StringBuilderでの文字列連結
		StringBuilder sb = new StringBuilder();
		// 計測開始
		MeasureTime.start();
		for (int i = 0; i < 10000; i++) {
			sb.append("n");
		}
		// 計測終了
		MeasureTime.end();
		System.out.println("StringBuilder:" + MeasureTime.getTime() / 1000 + "マイクロ秒");
	}
}


