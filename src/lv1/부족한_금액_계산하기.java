package lv1;

public class ������_�ݾ�_����ϱ� {
	
	public static long solution(int price, int money, int count) {
		
		long answer = 0;
		
		for(int i=1 ; i<=count ; i++) {
			answer =answer + (price + i);
		}
		
		if(answer <= money) {
			answer = 0;
		} else {
			answer = answer - money;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(3, 20, 4));
	}

}
