import java.util.Scanner;

public class ArrayTest1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		int[] salary = new int[2];
//		
//		System.out.print("����1�� ���� �Է� : ");
//		salary[0] = scan.nextInt();
//		
//		System.out.printf("����1�� ���� %d", salary[0]);
		
		final int STUDENTS = 5;
		int total=0;
		
		int[] score = new int[5];
		
		for(int i=0; i<score.length; i++){
			System.out.print("������ �Է� : ");
			score[i] = scan.nextInt();
			
			total+=score[i];			
		}
		int average;
		
		average = total/score.length;
		
		System.out.printf("��ü ������ ����� : %d, %d",average, score[6]);		
	}

}
