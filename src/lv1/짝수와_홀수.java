package lv1;

public class Â¦¼ö¿Í_È¦¼ö {
	
	public static String solution (int num) {
		String answer = "";
		if(num%2 == 0) {
			answer = "Even";
		} else if (num == 0) {
			answer = "Even";
		} else {
			answer = "Odd";
		}
		return answer;
	}
	
	public static void main(String[] args) {
		
		System.out.println(solution(3));
		
	}
}
