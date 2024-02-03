package java15;

import java.util.Date;

public class Code15_11 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.getTime());
		Date past = new Date(1706945638943L);
		System.out.println(past);
	}
}
