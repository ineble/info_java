package Day_0827;
// �迭 : ������ �̸��� ���� ��� ����

public class Exam_24 {
	public static void main(String[] args) {
		int arr[] = {55,90,78,86,89,56,75,66};
		System.out.print("Data : ");
		for(int i = 0; i<arr.length; i ++) {
			System.out.print(arr[i] + "\s");
		}
		System.out.println();
		//�������� -> ��������
		for(int i = 0; i<arr.length-1;i++) {
			for(int j = 0; j < arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					System.out.println(arr[j+1]); // ���� ������ ��
				}
			}
		}
		//1. i�� ��Ī�ϴ� ���� length�� �ݺ�
		//2. j�� ������ �ڽ��� �� 1pass
		//3. pass�� ����ɼ��� ���ϴ� ���� 1�� ����
		System.out.print("Sort : ");
		for(int i =0; i<arr.length; i ++) {
			System.out.print(arr[i] + "\s");
		}
	}
}
