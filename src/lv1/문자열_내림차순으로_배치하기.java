package lv1;

import java.util.Arrays;
import java.util.Collections;

public class ���ڿ�_������������_��ġ�ϱ� {
	
	public static String solution(String s) {
		
		String answer = "";
		
		String[] str = s.split("");
		//sort �������� �迭
		//collections �� reverseOrder �������� �迭
		Arrays.sort(str,Collections.reverseOrder());
		
		for(int i = 0 ; i<str.length ; i++) {
			answer += str[i];
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution("Zbcdefg"));
	}
}
