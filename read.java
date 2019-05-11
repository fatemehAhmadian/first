import java.util.Scanner;

public class read {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		long A = input.nextLong();
		long B = input.nextLong();
		
		System.out.print(BMM(A,B));
		
	}
	public static long BMM (long a,long b) {
		if (b == 0)
			return a;
		else {
			long c = a%b;
			a = b;
			b = c;
			return BMM(a,b);
		}
	}
}
