package java15;

import java.util.Scanner;

public class Code15_6_2 {
	public static void main(String[] args) {
		while (true) {
			System.out.print("名前を入力 >>");
			String name = new Scanner(System.in).nextLine();
			System.out.println(isValidPlayerName(name));
		}
	}

	public static boolean isValidPlayerName(String name) {
		return name.matches("[abc]*");
	}
}
