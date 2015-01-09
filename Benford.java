import java.util.*;
import java.math.*;

class Benford {
	private static int getFirstDigit(int n){
		while(n > 9){
			n /= 10;
		}
		return n;
	}

	public static void main(String[] args) {
		double[] Benford = new double[10];
		Benford[1] = 30.1;
		Benford[2] = 17.6;
		Benford[3] = 12.5;
		Benford[4] = 9.7;
		Benford[5] = 7.9;
		Benford[6] = 6.7;
		Benford[7] = 5.8;
		Benford[8] = 5.1;
		Benford[9] = 4.6;

		Scanner scan = new Scanner(System.in);
		int n = 0;
		int total = 0;
		double[] prob = new double[10];
		
		//Read file till EOF
		while(scan.hasNextInt()){
			n = scan.nextInt();
			int first = getFirstDigit(n);
			++prob[first];
			++total;
		}
		System.out.println("Digit  Frequency    Benford");
		for (int i = 1; i < 10; ++i) {
			prob[i] /= total;
			System.out.format("%2d",i);
			System.out.format("%13.2f", prob[i] * 100);
			System.out.print("%");
			System.out.format("%10.2f", Benford[i]);
			System.out.print("%");
			System.out.println("");
			//System.out.println(" " + i + "      " + prob[i] + "%   " + Benford[i] + "%");
		}
	}
}



