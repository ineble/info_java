package Day_0827;
/*
 *��ȯ Ÿ�԰� �Ű�����
 *��ȯ Ÿ��(X) �Ű�����(X)
 *��ȯ Ÿ��(O) �Ű�����(X)
 *��ȯ Ÿ��(X) �Ű�����(O)
 *��ȯ Ÿ��(O) �Ű�����(O)
 * */

public class Exam_34 {
	static void arrSort(int[] arr) {
		for(int i=0;i < arr.length-1; i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {5,8,4,9,7};
		System.out.println("Data : ");
		for(int i = 0; i <arr.length; i ++) {
			System.out.print(arr[i] + "\s");
		}
		System.out.println();
		arrSort(arr);
		for(int i =0; i <arr.length; i ++) {
			System.out.print(arr[i] + "\s");
		}
	}

}
