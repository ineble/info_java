package Day_0827;
// 배열 : 동일한 이름을 가진 기억 공간

public class Exam_22 {
	public static void main(String[] args) {
		int arr[] = {55,90,78,86,89,56,75,66};
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0 ; i<arr.length; i ++) {
			if(max < arr[i]) {
				max = arr[i];
			}else if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}
}
