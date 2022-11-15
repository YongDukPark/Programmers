package lv1;

public class ����_������_�����ϱ� {
	
	public static int[] solution(int[] arr) {
		
		//���� ���̱� 1�ΰ��
		if(arr.length == 1) {
			return new int[] {-1};
		}
		
		//������ ���ϱ�
		int min = arr[0];
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		//�����ϱ�
		int[] answer = new int[arr.length];
		int i = 0;
		for(int num : arr) {
			if(num == min) continue;
			answer[i++] = num;
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		int[] test = {4,3,2,1};
		
		
		for (int i = 0 ; i < test.length ; i++) {
			System.out.println(solution(test)[i]);
		}

	}

}
