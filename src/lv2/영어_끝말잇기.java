package lv2;

import java.util.ArrayList;
import java.util.List;

public class ����_�����ձ� {
	
	public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> list = new ArrayList<String>();
        boolean flag = true;
        
        for(int i=0; i<words.length; i++){
            // 1��
            // ����1 i>0 && words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)
            // i�� 0���� ũ�� ���� ��¥�� ���� ù��¥�� �������� �������
            // ����2 list.contains(words[i])
            // ���� ������ ������ �ܾ �������
            if(i>0 && words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)
               || list.contains(words[i])){
                answer[0] = (i%n) + 1;
                answer[1] = (i/n) + 1;
                flag = false;
                break;
            }
            // 2��
            // ���� ������ ������� ���ڵ��� ���غ��� ���� list�� ��Ƶΰ� 
            //���� ������ �ܾ ��������� ���ǰɱ��
            list.add(words[i]);
        }
        // 3��
        // ���� ���� for���� ������ if ���ǹ��� �ɸ��� �ʰ� ����Ǿ������
        if(flag){
            return new int[]{0, 0};
        }
        
        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�. 
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
