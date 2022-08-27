package Day_0827;
// 배열 : 동일한 이름을 가진 기억 공간

public class Exam_21 {
	public static void main(String[] args) {
		int arr[] = {7,4,9,8,6,4,3,2};
		int max = 0;
		int min = arr[0];
		
		for(int i = 0 ; i<arr.length; i ++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("max : " + max);
		
		for(int i = 0 ; i<arr.length; i ++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("min : " + min);
	}
}
