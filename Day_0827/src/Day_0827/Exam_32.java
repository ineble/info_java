package Day_0827;
/*
 *반환 타입과 매개변수
 *반환 타입(X) 매개변수(X)
 *반환 타입(O) 매개변수(X)
 *반환 타입(X) 매개변수(O)
 *반환 타입(O) 매개변수(O)
 * */

public class Exam_32 {
	static void swapVar(int a,int b) {
		int temp =a;
		a = b;
		b = temp;
	}
	
	public static void main(String[] args) {
		int a = 10, b=20;
		System.out.println("a : " + a + ", b : " + b);
		swapVar(a, b);
		//call by value 값에 의한 호출로 인하여 아무 의미없음
		System.out.println("a : " + a + ", b : " + b);
	}
}
