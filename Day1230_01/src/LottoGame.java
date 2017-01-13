import java.util.Scanner;

public class LottoGame {

	public static void main(String[] args) {
		//로또 번호 생성프로그램 중복되지 않는 1~45의 랜덤한 수 여섯개를 생성
		
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
		
		
		
		
		
		//사용자로부터전기 사용량을 입력받아서 전기 사용요금을 누진세에 맞게 출력
		Scanner scan= new Scanner(System.in);
		int use; //전기 사용량을 입력받을 변수
		double result = 0;//전기사용료 결과를 저장할 변수
		
		final int[] BASIC_FEE = {410,910,1600,3850,7300,12940};
		final double[] ELEC_FEE = {60.7,125.9,187.9,280.6,417.7,709.5};
		
		
		
		System.out.print("전기사용량 : ");
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
		
//		사용량을 100씩 차감하면서 현재 구간에 대한 금액으로 계산을 반복
//		사용량이 100보다 작거나 최종구간에 도달한 경우는
//		남은 사용량을 현재 구간으로 모두 계산하고 현재구간에 대한 기본료 적용 후 끝
		
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
		
		
		
		
		System.out.printf("요금 %.1f 원", result);
		
		

	}

}
