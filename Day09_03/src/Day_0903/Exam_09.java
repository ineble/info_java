package Day_0903;
/*
 * Ŭ���� : ���赵 -> ����ü --> ����� ���� �ڷ���
 * ��ü : ���(�޼ҵ�)�� �Ӽ�(����)�� ���Ե�
 * */
class Process{
	int exam01(int[] num) {
		int m = num[0];
		for(int i = 0; i < num.length; i ++) {
			if(m > num[i])
				m = num[i];
		}
		return m;
	}
}

public class Exam_09 {
	public static void main (String[] args) {
		int [] val = {6,9,4,7,3,5};
		Exam_10 pro = new Exam_10();
		System.out.println(pro.exam01(val));
	}
}

