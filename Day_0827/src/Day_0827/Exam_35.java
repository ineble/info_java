package Day_0827;
/*
 *반환 타입과 매개변수
 *반환 타입(X) 매개변수(X)
 *반환 타입(O) 매개변수(X)
 *반환 타입(X) 매개변수(O)
 *반환 타입(O) 매개변수(O)
 * */
//오버로딩
public class Exam_35 {
	static int max(int a, int b) {
		int max = (a>b) ? a : b;
		return max;
	}
	
	static int max(int a, int b,int c) {
		int max = (a>b) ? a : b;
		max = (max <c) ? c: max;
		return max;
	}
	
	public static void main(String[] args) {
			System.out.println(max(10, 20));
			System.out.println(max(10, 20,30));
		
	}
}
