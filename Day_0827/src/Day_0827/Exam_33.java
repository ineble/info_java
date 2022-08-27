package Day_0827;
/*
 *반환 타입과 매개변수
 *반환 타입(X) 매개변수(X)
 *반환 타입(O) 매개변수(X)
 *반환 타입(X) 매개변수(O)
 *반환 타입(O) 매개변수(O)
 * */

public class Exam_33 {
	static void swapVar(int a[]) {
		int temp =a[0];
		a[0] = a[1];
		a[1] = temp;
	}
	
	public static void main(String[] args) {
		int[]a = {10,20};
		System.out.println("a[0] : " + a[0] + ", a[1] : " + a[1]);
		swapVar(a);
		//call by reference 참조에 의한 호출
		System.out.println("a[0] : " + a[0] + ", a[1] : " + a[1]);
	}
	
}
