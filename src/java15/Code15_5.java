package java15;

public class Code15_5 {
	public static void main(String[] args) {
		System.out.println(isValidPlayerName("A1234567"));
	}

	public static boolean isValidPlayerName(String name) {
		if (name.length() != 8) {
			System.out.println("1");
			return false;
		}

		char first = name.charAt(0);
		if (!(first >= 'A' && first <= 'Z')) {
			System.out.println("2");
			return false;
		}

		for (int i = 0; i < 8; i++) {
			char c = name.charAt(i);
			if (!((c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
				System.out.println("3");
				return false;
			}
		}
		return true;
	}
}
