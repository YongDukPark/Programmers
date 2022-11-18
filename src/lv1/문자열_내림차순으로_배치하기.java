package lv1;

import java.util.Arrays;
import java.util.Collections;

public class 문자열_내림차순으로_배치하기 {
	
	public static String solution(String s) {
		
		String answer = "";
		
		String[] str = s.split("");
		//sort 오름차순 배열
		//collections 에 reverseOrder 역순으로 배열
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
