package java15;

public class Code15_6 {
	public static void main(String[] args) {
		System.out.println(isValidPlayerName("A1234567"));
	}

	public static boolean isValidPlayerName(String name) {
		return name.matches("[A-Z][A-Z0-9]{7}");
	}
}
