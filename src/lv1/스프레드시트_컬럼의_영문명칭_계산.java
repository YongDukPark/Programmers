package lv1;

import java.util.Scanner;

public class ���������Ʈ_�÷���_������Ī_��� {
	
	public static void main(String[] args) {
		/*
		 * int i = 10; // 00000000 00000000 00000000 00001010 char c = 'A'; // ���� ->
		 * �ƽ�Ű�ڵ�ǥ ��Ī -> �ش��ϴ� ���������� ���� // �޸𸮿� ���ڷ� ����Ǿ� ����
		 * 
		 * // 'A' -> 65 // 'a' -> 97
		 * 
		 * c += 1; System.out.println(c);
		 */
		
		//Scanner scanner = new Scanner(System.in);
		int number = 100000000;
		String answer = "";
		
		while(number > 0) {
			char a = 65;
			
			int printChar = number % 26;
			number /= 26;
			
			answer += (char)(a + (printChar-1)); //65~90�� A~Z �̶� ���� ����� A�� 1���� �����ϱ⶧����
                                                 //1�� ���༭ ���ڸ� �����!
		}
		
		for(int i = answer.length()-1; i>=0; i--) {
			char a = answer.charAt(i);
			System.out.print(a);
		}

	}

}
