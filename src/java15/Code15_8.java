package java15;

public class Code15_8 {
	public static void main(String[] args) {
		String s = "abc,def:ghi";
		String w = s.replaceAll("[beh]", "X");
		System.out.println(w);	// aXc,dXf:gXi
	}
}
