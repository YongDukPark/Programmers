package lv1;

public class �ڿ���_������_�迭��_����� {
	
	public static int[] solution(long n) {
		//String ���� ��ȯ
		String N = String.valueOf(n);
		//N���ڱ��̸�ŭ ������ ����
		int[] answer = new int[N.length()];
		//N ���ø����� ������ �迭�� ���
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
