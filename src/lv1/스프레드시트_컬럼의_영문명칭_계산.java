package lv1;

import java.util.Scanner;

public class 스프레드시트_컬럼의_영문명칭_계산 {
	
	public static void main(String[] args) {
		/*
		 * int i = 10; // 00000000 00000000 00000000 00001010 char c = 'A'; // 문자 ->
		 * 아스키코드표 매칭 -> 해당하는 정수값으로 저장 // 메모리에 숫자로 저장되어 있음
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
			
			answer += (char)(a + (printChar-1)); //65~90이 A~Z 이때 위의 계산은 A는 1부터 시작하기때문에
                                                 //1을 빼줘서 문자를 맞춘다!
		}
		
		for(int i = answer.length()-1; i>=0; i--) {
			char a = answer.charAt(i);
			System.out.print(a);
		}

	}

}
