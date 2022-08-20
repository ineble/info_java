package Day_0820;

/* 연산자 운선순위(연산순위가 같은 경우 좌 -> 우로 연산)
 * 단항연산자 -> 	산술	 	-> 		관계 		-> 		상등   	 -> 	    논리
 * 			(*,/,%,+,=)  	(>,>=,<,<=)			(==,!=)		  	(&&, ||) 
 * */
public class Exam_12 {
	public static void main(String[] args) {
		int a = 4, b = 4;
		// b = 4 a = 16?
		int a_1 = a<<2;
		System.out.println(a_1);
		System.out.println(b);
		int s = b++ + a<<2;
		System.out.println(b);
		// s가 32인 이유 시프트 연산자가 산술 연산자보다 우선 순위가 낮아서 
		// b + a = 8 에다가 시프트 연산자가 시행되니깐 8 * 2 * 2 = 32가 된다
		System.out.println(s);
		
		String str = "";
		str = "1" + str;
		str = "2" + str;
		str = "3" + str;
		System.out.println(str);
		
		String str1 = "";
		str1 = str1 + "1";
		str1 = str1 + "2";
		str1 = str1 + "3";
		System.out.println(str1);
		
	}
}
