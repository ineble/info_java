package Day_0820;

/* ������ �����(��������� ���� ��� �� -> ��� ����)
 * ���׿����� -> 	���	 	-> 		���� 		-> 		���   	 -> 	    ��
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
		// s�� 32�� ���� ����Ʈ �����ڰ� ��� �����ں��� �켱 ������ ���Ƽ� 
		// b + a = 8 ���ٰ� ����Ʈ �����ڰ� ����Ǵϱ� 8 * 2 * 2 = 32�� �ȴ�
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
