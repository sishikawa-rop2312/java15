package java15;

public class Main3 {
	public static void main(String[] args) {
		String name = "minato";
		String job = "hero";
		int money = 280000;
		
		String s = String.format("%-9s %-13s 所持金%,10d\n", name, job, money);
		System.out.println(s);
	}
}
