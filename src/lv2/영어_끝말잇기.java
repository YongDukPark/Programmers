package lv2;

import java.util.ArrayList;
import java.util.List;

public class 영어_끝말잇기 {
	
	public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> list = new ArrayList<String>();
        boolean flag = true;
        
        for(int i=0; i<words.length; i++){
            // 1번
            // 조건1 i>0 && words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)
            // i가 0보다 크고 끝에 글짜와 다음 첫글짜가 동일하지 않을경우
            // 조건2 list.contains(words[i])
            // 만약 이전에 동일한 단어가 있을경우
            if(i>0 && words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)
               || list.contains(words[i])){
                answer[0] = (i%n) + 1;
                answer[1] = (i/n) + 1;
                flag = false;
                break;
            }
            // 2번
            // 만약 문제가 없을경우 문자들을 비교해보기 위해 list에 담아두고 
            //이후 동일한 단어가 나왔을경우 조건걸기용
            list.add(words[i]);
        }
        // 3번
        // 만약 위에 for문이 끝까지 if 조건문에 걸리지 않고 진행되었을경우
        if(flag){
            return new int[]{0, 0};
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다. 
        System.out.println("Hello Java");

        return answer;
    }
	public static void main(String[] args) {
		
		String[] test1 = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		int[] test2 = solution(3,test1);
		
		for (int i = 0 ; i < test2.length ; i++) {
			System.out.print(test2[i]);
		}
	}
}
