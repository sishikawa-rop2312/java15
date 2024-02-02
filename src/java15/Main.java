package java15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.print("名前を入力 >>");

		String name = new Scanner(System.in).nextLine();
		int atk = 0;
		for (int i = 0; i < name.length(); i++) {
			atk += (int) name.charAt(i);
		}
		System.out.println("あなたの戦闘力:" + atk);
	}

}
