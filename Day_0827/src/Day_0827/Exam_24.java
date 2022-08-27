package Day_0827;
// 배열 : 동일한 이름을 가진 기억 공간

public class Exam_24 {
	public static void main(String[] args) {
		int arr[] = {55,90,78,86,89,56,75,66};
		System.out.print("Data : ");
		for(int i = 0; i<arr.length; i ++) {
			System.out.print(arr[i] + "\s");
		}
		System.out.println();
		//버블정렬 -> 오름차순
		for(int i = 0; i<arr.length-1;i++) {
			for(int j = 0; j < arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					System.out.println(arr[j+1]); // 가장 오른쪽 수
				}
			}
		}
		//1. i가 지칭하는 것은 length의 반복
		//2. j는 옆집과 자신을 비교 1pass
		//3. pass가 진행될수록 비교하는 수도 1씩 감소
		System.out.print("Sort : ");
		for(int i =0; i<arr.length; i ++) {
			System.out.print(arr[i] + "\s");
		}
	}
}
