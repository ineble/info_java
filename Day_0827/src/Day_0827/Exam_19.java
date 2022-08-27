package Day_0827;
// 배열 : 동일한 이름을 가진 기억 공간

public class Exam_19 {
	public static void main(String[] args) {
		int a; //점수를 저장할 수 있는 변수
		int[] arr; // 배열변수 선언
		arr = new int[5]; //5개의 공간을 확보
		//int[] arr = new int[5] -> 선언과 동시 공간 확보
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
