package Day_0827;
/*
 *��ȯ Ÿ�԰� �Ű�����
 *��ȯ Ÿ��(X) �Ű�����(X)
 *��ȯ Ÿ��(O) �Ű�����(X)
 *��ȯ Ÿ��(X) �Ű�����(O)
 *��ȯ Ÿ��(O) �Ű�����(O)
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
		//call by value ���� ���� ȣ��� ���Ͽ� �ƹ� �ǹ̾���
		System.out.println("a : " + a + ", b : " + b);
	}
}
