import java.util.Scanner;

public class LottoGame {

	public static void main(String[] args) {
		//�ζ� ��ȣ �������α׷� �ߺ����� �ʴ� 1~45�� ������ �� �������� ����
		
//		int[] num = new int[6];
//		
//		int gong;
//
//		for(int c=0; c<6; c++){			
//			boolean run = false;
//			do{	
//				run = false;
//				gong=(int)(Math.random()*45)+1;
//				
//				for(int j =0; j<c; j++){
//					
//					if(num[j]==gong){
//						run=true;
//					}					
//				}
//				if(!run)
//					num[c] = gong;				
//			}while(run);	
//		}
//		
//		for(int a : num)
//			System.out.printf("%d ",a);
		
		
		
		
		
		//����ڷκ������� ��뷮�� �Է¹޾Ƽ� ���� ������� �������� �°� ���
		Scanner scan= new Scanner(System.in);
		int use; //���� ��뷮�� �Է¹��� ����
		double result = 0;//������� ����� ������ ����
		
		final int[] BASIC_FEE = {410,910,1600,3850,7300,12940};
		final double[] ELEC_FEE = {60.7,125.9,187.9,280.6,417.7,709.5};
		
		
		
		System.out.print("�����뷮 : ");
		use= scan.nextInt();
		
//		if(use <= 100){
//			result = 410 + use *ELEC_FEE[0];
//		}
//		else if(use<=200){
//			result= 910 +100 *ELEC_FEE[0] + (use - 100) *ELEC_FEE[1];
//		}else if(use <=300){
//			result= 1600 +100 *ELEC_FEE[0] + 100 *ELEC_FEE[1] + (use - 100) * ELEC_FEE[2];			
//		}else if(use <=400){
//			result= 3850 +100 *ELEC_FEE[0] + 100 *ELEC_FEE[1] + 100 * ELEC_FEE[2] + (use - 100) *280.6;
//		}else if(use<=500){
//			result= 7300 +100 *ELEC_FEE[0] + 100 *ELEC_FEE[1] + 100 * ELEC_FEE[2] + 100 * 280.6 + (use - 100)*417.7;			
//		}else{
//			result= 12940 +100 * + 100 *ELEC_FEE[1] + 100 * ELEC_FEE[2] + 100 * 280.6 + 100 *417.7 + (use - 100) * 709.5;		
//		}
//		
		
//		��뷮�� 100�� �����ϸ鼭 ���� ������ ���� �ݾ����� ����� �ݺ�
//		��뷮�� 100���� �۰ų� ���������� ������ ����
//		���� ��뷮�� ���� �������� ��� ����ϰ� ���籸���� ���� �⺻�� ���� �� ��
		
		int i = 0;
		while(true){
			if(use>100 && i<5){
				result += ELEC_FEE[i] * 100;
				i++;
				use -= 100;
			}else
			{
				result += ELEC_FEE[i] * use + BASIC_FEE[i];
				break;
			}
		}
		
		
		
		
		System.out.printf("��� %.1f ��", result);
		
		

	}

}
