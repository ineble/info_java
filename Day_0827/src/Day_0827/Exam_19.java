package Day_0827;
// �迭 : ������ �̸��� ���� ��� ����

public class Exam_19 {
	public static void main(String[] args) {
		int a; //������ ������ �� �ִ� ����
		int[] arr; // �迭���� ����
		arr = new int[5]; //5���� ������ Ȯ��
		//int[] arr = new int[5] -> ����� ���� ���� Ȯ��
		arr[0] = 10;
		arr[1] = 20;
		arr[3] = 30;
		System.out.println("arr[0] = " + arr[0]);
		System.out.println("arr[1] = " + arr[1]);
		System.out.println("arr[2] = " + arr[2]);
		System.out.println("arr[3] = " + arr[3]);
		System.out.println("arr[4] = " + arr[4]);
		
 		for(int i = 0 ; i <5 ; i++) {
 			System.out.println("arr[" + i +  "] = " + arr[i]);
 		}
 		int cnt = arr.length;
 		for(int i = 0; i <cnt; i++) {
 			System.out.println("arr[" + i +  "] = " + arr[i]);
 		}
 				
	}
}
