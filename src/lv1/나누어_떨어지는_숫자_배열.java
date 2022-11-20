package lv1;

import java.util.ArrayList;
import java.util.Arrays;

public class ������_��������_����_�迭 {

	public static int[] solution(int[] arr, int divisor) {
		
		int[] answer = {};
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0 ; i < arr.length ; i++){
			if(arr[i]%divisor == 0) {
				list.add(arr[i]);
			}
		}
		
		if(list.size() == 0) {
			answer = new int[1];
			answer[0] = -1;
		} else {
			answer = new int[list.size()];
			for(int i = 0 ; i < list.size() ; i++) {
				answer[i] = list.get(i);
			}
		}
		
		Arrays.sort(answer);
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		int[] test = {5,9,7,10};
		
		for(int i = 0 ; i < solution(test,5).length ; i++) {
			System.out.println(solution(test,5)[i]);
		}

	}

}
