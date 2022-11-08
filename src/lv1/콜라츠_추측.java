package lv1;

public class 콜라츠_추측 {
	
	public static int solution(int n) {
        long num = n;
        int answer = 0;
        
        //1번
        while(num != 1 ){
            //2번
            if(num % 2 == 0){
                num /= 2;
            } else if(num % 2 != 0){   //3번
                num = (num * 3)+1;
            }
            //4번
            answer++;
            //5번
            if(answer > 500){
                return -1;
            }
        }
        
        return answer;
    }

	
	public static void main(String[] args) {
		
		//626331 를 제외한 모든 숫자는 이 규칙을 따르면 나머지값은 1이 된다.
		System.out.println(solution(3));

	}

}
