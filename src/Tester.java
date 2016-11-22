import java.util.*;
public class Tester {

	public static void main(String[] args) {
		//Problem 1
		System.out.println("Problem 1: ");
		int r1 = 0, count = 0;
		Random rndm1 = new Random( );
		for(int j = 0; j < 33; j++) {
			r1 = 71 + rndm1.nextInt(29);
			System.out.print(r1 + " ");
			count++;
			if(count >= 15) {
				System.out.println();
				count = 0;
			}
		}
		count = 0;
		//Problem 2
		System.out.println("\n\nProblem 2: ");
		System.out.println();
		Random rndm2 = new Random( );
		double r2;
		for(int j = 0; j < 27; j++) {
			r2 = 99.78 + 47.44 * rndm2.nextDouble( );
			System.out.print(r2 + " ");
			count++;
			if(count >= 5) {
				System.out.println();
				count = 0;
			}
		}
	}

}
