package lv1;

public class �ݶ���_���� {
	
	public static int solution(int n) {
        long num = n;
        int answer = 0;
        
        //1��
        while(num != 1 ){
            //2��
            if(num % 2 == 0){
                num /= 2;
            } else if(num % 2 != 0){   //3��
                num = (num * 3)+1;
            }
            //4��
            answer++;
            //5��
            if(answer > 500){
                return -1;
            }
        }
        
        return answer;
    }

	
	public static void main(String[] args) {
		
		//626331 �� ������ ��� ���ڴ� �� ��Ģ�� ������ ���������� 1�� �ȴ�.
		System.out.println(solution(3));

	}

}
