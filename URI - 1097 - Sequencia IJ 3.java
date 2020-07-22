public class Main {

	public static void main(String[] args) {

		int x = 7;
		
		for(int i = 1; i<=9; i+=2) {
			for(int j = x; j>=(x-2); j--) {
				System.out.println(String.format("I=%d J=%d", i, j));
			}
			x+=2;
		}
	}
}
