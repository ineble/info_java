package Day_0827;
// 배열 : 동일한 이름을 가진 기억 공간

public class Exam_23 {
	public static void main(String[] args) {
		int arr[] = {55,90,78,86,89,56,75,66};
		System.out.print("Data : ");
		for(int i = 0; i<arr.length; i ++) {
			System.out.print(arr[i] + "\s");
		}
		System.out.println();
		//선택정렬 -> 오름차순
		for(int i = 0; i<arr.length-1;i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("Sort : ");
		for(int i =0; i<arr.length; i ++) {
			System.out.print(arr[i] + "\s");
		}
	}
}
