package util;

public class Console {
	
	public static String lerLinha() {
		java.util.Scanner leitor = new java.util.Scanner(System.in);
		String linha = leitor.nextLine();
		leitor.close();
		return linha;
	}
	
	public static int lerInteiro() {
		return Integer.parseInt(lerLinha());
	}

}
