import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		int total=0, size;
//		
//		System.out.print("배열의 크기를 입력 : ");
//		size = scan.nextInt();
//		
//		int[] score =new int[size];
//		for (int i=0; i<score.length;i++){
//			System.out.print("성적입력 : ");
//			score[i] = scan.nextInt();			
//			
//			total += score[i];
//		}
//		
//		System.out.printf("평균의 성적은 %d 입니다.\n\n", total/score.length);
////
////		
//		int[] numbers =new int[5];
//		for (int i=0; i<numbers.length;i++)
//			numbers[i] = (int) (Math.random()*1000);
//		for(int value : numbers)
//			System.out.println(value);
		
		int size=5;
		int inputSize;
		
		int[] input = new int[size];
		
		for(int i=0; i<input.length; i++){
			System.out.print("정수를 입력하세요 : ");
			input[i] = scan.nextInt();
			
			input[i]*=2;
		}
		
		for(int value : input)
			System.out.printf("입력한 두배의 값 : %d \n", value);
		
		
		
		

	}

}
