package Day_0820;

/* 논리상수(boolean) : true/false
 * 숫자상수(정수와 실수 음수와 양수) : 정수 -> int short long 실수 -> double float 양수 : + ,  음수 : -
 * 2진수 : 0~1 -> 0b100 (byte)
 * 8진수 : 0~7 -> 0으로시작 (octo)
 * 10진수 : 0~9
 * 16진수 : 0~9 A(10)~F(15) -> 0xf(Hex)
 * 문자상수(char,String) : char은 '', String "" -> 문자열을 의미하는 String 은 기본타입이 아닌 참조타입이다
 * 
 * 45(10진수), 045(8진수), 0x45(16진수), 0b1010(2진수)
 * 078 -> 8진수로 봤지만 뒤에 8이 있기에 오류가 떠버림
 * '1' , '12' ->  오류 왜냐하면 1이랑 2라는 문자가 2개 들어갔으니깐
 * "12" -> 가능 문자열로 바꿔줌으로써 오류가 뜨지 않음
 * */
public class Exam_05 {

	public static void main(String[] args) {
		// 7 + 8 = 15;
		System.out.println("7 + 8 = " + (7+8));
		System.out.println("7 + 8 = 15");
		int a; // 변수의 선언
		a = 10; // 값의 대입 대입을 기준으로 오른쪽은 값 왼쪽은 저장공간(변수)을 의미한다.
		int b = 20; // 변수 선언과 값을 저장 -> 초기화 완료	
		System.out.println(a  + " + " +  b  + " = " + (a+b));
		
	}
}
