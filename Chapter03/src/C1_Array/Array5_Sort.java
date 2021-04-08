//배열속에 있는 값을 오름차순으로 정렬하시오.

package C1_Array;

public class Array5_Sort {
	public static void main(String[] args) {
		//배열생성
		int[] num = {76,85,99,41,68,78,79,88,100};
		
		int imsi = 0;
		
		//정렬수행
		for(int i=0; i<num.length; i++) {
			for(int j=i+1; j<num.length; j++) {
				
				if(num[i] > num [j]) {
					imsi = num[i];
					num[i]=num[j];  //i값과 j값을 바꿈
					num[j]=imsi;	//j값에 imsi값으로 대체
				}
			}
		}
		//결과 출력
		System.out.print("정렬된 값은:");
		for(int k: num) { 
			System.out.print(k+" ");
		}
	}
}
