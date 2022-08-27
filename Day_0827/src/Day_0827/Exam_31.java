package Day_0827;
/*
 *반환 타입과 매개변수
 *반환 타입(X) 매개변수(X)
 *반환 타입(O) 매개변수(X)
 *반환 타입(X) 매개변수(O)
 *반환 타입(O) 매개변수(O)
 * */

public class Exam_31 {
	static void test01() {
		System.out.println("test01() 메소드가 호출되었습니다.");
	}
	static void sum(int x, int y) {
		int s = x + y;
		System.out.println("sum() 메소드 호출 : " + s);
	}
	static int add() {
		int s  = 0;
		for(int i = 1; i<6;i++) {
			s += i;
		}
		return s;
	}
	static String print(String name, int age) {
		String str = "이름 : " + name + ",나이는 " + age;
		return str;
	}
	public static void main(String[] args) {
		test01();
		sum(10, 20);
		System.out.println(add());
		System.out.println(print("홍길동", 150));
	}
}
