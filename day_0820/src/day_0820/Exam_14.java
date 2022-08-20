package Day_0820;

/* 비트 논리 연산자
 * & -> and
 * ^ -> xor
 * | -> or
 * */
public class Exam_14 {
	public static void main(String[] args) {
		System.out.println("7&5 : " + (7&5));
		System.out.println("7^5 : " + (7^5));
		System.out.println("7|5 : " + (7|5));
		System.out.println("7>5&&5<3 : " + (7>5&&5<3));
		System.out.println("7>5||5<3 : " + (7>5||5<3));
		System.out.println("7>5&5<3 : " + (7>5&5<3));
		System.out.println("7>5|5<3 : " + (7>5|5<3));
		//논리연산자가 비트논리연산자보다 빠르다 왜냐하면 논리는 하나만
		//틀려도 결론을 짓고 비트 논리는 끝까지 가기때문이다
		//그리고 비트논리가 느린 이유는 십진수를 이진수로 바꿔야되기때문이다.
	}
}
