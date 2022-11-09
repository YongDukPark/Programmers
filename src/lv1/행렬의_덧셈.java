package lv1;

public class Çà·ÄÀÇ_µ¡¼À {
	
	public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        
        for(int i = 0 ; i < arr1.length ; i++){
            for(int j = 0 ; j < arr2[0].length ; j++){
                answer[i][j] =  arr1[i][j]+arr2[i][j];
            }
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		
		int[][] test1 = {{1,2},{2,3}};
		int[][] test2 = {{3,5},{1,4}};
		
		
		for (int i = 0 ; i < test1.length ; i++) {
			for(int j = 0 ; j < test1.length ; j++){
				System.out.print(solution(test1, test2)[i][j]);
			}
			System.out.println();
		}
	}

}
