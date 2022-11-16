package lv1;

public class 자연수_뒤집어_배열로_만들기 {
	
	public static int[] solution(long n) {
		//String 으로 변환
		String N = String.valueOf(n);
		//N글자길이만큼 사이즈 생성
		int[] answer = new int[N.length()];
		//N 스플릿으로 나눠서 배열에 담기
		String[] a = N.split("");
		
		for(int i = 0 ; i < a.length ; i++) {
			answer[a.length-i-1] = Integer.parseInt(a[i]);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		long test = 12345;
		
		for(int i = 0 ; i < solution(test).length ; i++) {
			System.out.print(solution(test)[i]);
			if(i != solution(test).length-1) {
				System.out.print(",");
			}
		}
		
	}

}
