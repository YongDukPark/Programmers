package lv1;

public class 약수의_합 {
	
	public static int solution(int n) {
		
		int answer = 0;
		
		//나눴을 경우
		for(int i = 1 ; i <= n ; i++) {
			if(n%i == 0) {
				answer = answer+(n/i);
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(28));
	}
}
