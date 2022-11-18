public class tabuada {
	public static void main (String[]args) {
		int i, n, r;
		for (n=1;n<=10;n++) {
			for (i=1;i<=10;i++) {
				r=n*i;
				System.out.println(n+"X"+i+"="+r);
			}
		}
	}
}