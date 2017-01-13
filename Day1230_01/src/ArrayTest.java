
public class ArrayTest {

	public static void main(String[] args) {
		//arr 배열을 탐색하면서 가장 큰 값 찾기
		
		int[] arr = {1,4,3,5,2};
		
//		int max=arr[0];
//		int mid=0;
//		
//		for(int i=0; i<arr.length; i++){
//			if(arr[i]>max){
//				max=arr[i];
//			}			
//		}
//		System.out.printf("최대값 : %d",max);
		
		
		//선택정렬
//		int max=arr[0];
//		int tmp = 0;
//
//		for (int j = 0; j < arr.length; j++) {
//			for (int i = j + 1; i < arr.length; i++) {
//				if (arr[j] > arr[i]) {
//					tmp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tmp;
//				}
//			}
//			for (int k = 0; k < arr.length; k++)
//				System.out.printf("%d ", arr[k]);
//			System.out.println("");
//		}	
		
		
		//버블정렬
		int max=0;
		int tmp=0;
		
		for(int j=0; j<arr.length; j++){
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] > arr[i - 1]) {
					tmp = arr[i - 1];
					arr[i - 1] = arr[i];
					arr[i] = tmp;
				}
			}
			for(int k=0; k<arr.length; k++)
				System.out.printf("%d ", arr[k]);
			System.out.println("");
		}
		
		
		//삽입정렬
//		int max = arr[0];
//		int tmp =0;
//		
//		for(int i=1; i<arr.length; i++){
//			for(int j=1; i<0; j--){
//				if(arr[i]>arr[i-1]){
//					tmp=arr[i-j];
//					arr[i-j]=arr[i];
//					arr[j]=tmp;				
//				}
//			}
//		}
//		for(int i=0; i<arr.length; i++)
//			System.out.printf("선택정렬 %d 번째 값 : %d \n", i+1, arr[i]);		
		
		
		
		
		
	}

}
