package Day_0827;
// �迭 : ������ �̸��� ���� ��� ����

public class Exam_25 {
	public static void main(String[] args) {
		//int arr[][] = new int[5][4];
		int arr[][] = {{1,2,3,4},{5,6,7,8},{10,20,30,40},{50,60,70,80},{15,16,17,18}};
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr[i][j] + "\s");
			}
			System.out.println();
		}
	}
}
