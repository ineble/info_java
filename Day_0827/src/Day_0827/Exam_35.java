package Day_0827;
/*
 *��ȯ Ÿ�԰� �Ű�����
 *��ȯ Ÿ��(X) �Ű�����(X)
 *��ȯ Ÿ��(O) �Ű�����(X)
 *��ȯ Ÿ��(X) �Ű�����(O)
 *��ȯ Ÿ��(O) �Ű�����(O)
 * */
//�����ε�
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
