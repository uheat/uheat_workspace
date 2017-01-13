import java.util.Scanner;

public class RainFall {
	public static void main(String[] args) {
		final int YEARS = 3;
		final int QUARTERS = 4;
		double[][] rain = new double[YEARS][QUARTERS];
		Scanner scan = new Scanner(System.in);
		
		
		for(int y =0; y	< YEARS; y++){
			double total =0.0;
			for(int q=0; q<QUARTERS; q++){
				System.out.print(y+1+"차년도"+(q+1)+"분기강수량: ");
				rain[y][q] = scan.nextDouble();
				
				total += rain[y][q];
				
			}
			
			System.out.println(y+1+"차년도 강수량은 "+total);
		}
		
//		for (int y=0; y<YEARS; y++){
//			double total =0.0;
//			for(int q = )
//		}
	}

}
