package lv1;

public class 제일_작은수_제거하기 {
	
	public static int[] solution(int[] arr) {
		
		//만약 길이기 1인경우
		if(arr.length == 1) {
			return new int[] {-1};
		}
		
		//작은수 구하기
		int min = arr[0];
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		//제거하기
		int[] answer = new int[arr.length];
		int i = 0;
		for(int num : arr) {
			if(num == min) continue;
			answer[i++] = num;
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		int[] test = {4,3,2,1};
		
		
		for (int i = 0 ; i < test.length ; i++) {
			System.out.println(solution(test)[i]);
		}

	}

}
