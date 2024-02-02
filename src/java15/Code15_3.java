package java15;

public class Code15_3 {
	public static void main(String[] args) {
		String s1 = "Java programming";
		System.out.println("文字列s1の4文字目以降は" + s1.substring(3));	// 文字列s1の4文字目以降はa programming
		System.out.println("文字列s1の4～8文字目は" + s1.substring(3, 8));	// 字列s1の4～8文字目はa pro
	}
}
