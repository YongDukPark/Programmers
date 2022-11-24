package lv1;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class 두개_뽑아서_더하기 {
	
	public static LinkedList<Integer> solution(int[] numbers){
		
		int[] answer = {};
		LinkedList<Integer> returnArr = new LinkedList<Integer>();
		HashSet<Integer> returnSet = new HashSet<Integer>();
		
		for(int i = 0 ; i < numbers.length ; i++) {
			for(int j = i+1 ; j < numbers.length ; j++) {
				returnSet.add(numbers[i]+numbers[j]);
			}
		}
		
		for(int a : returnSet) {
			returnArr.add(a);
		}
		
		Collections.sort(returnArr);
		
		return returnArr;
	}
	
	public static void main(String[] args) {
		
		int[] test = {5,0,2,7};
		
		System.out.println(solution(test));
		
	}

}
