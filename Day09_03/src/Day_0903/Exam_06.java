package Day_0903;
/*
 * Ŭ���� : ���赵 -> ����ü --> ����� ���� �ڷ���
 * ��ü : ���(�޼ҵ�)�� �Ӽ�(����)�� ���Ե�
 * */
class Point{ //�ڷ���
	int x; //�������, ����ʵ� -> �ν��Ͻ� ���� 
	int y;
	Point(){
	}
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}	
}

public class Exam_06 {
	public static void main (String[] args) {
		int a;//���� ���� ���� ��������
		a = 10;
		Point p;//Point ���� ����
		p = new Point(); //��ü ����
		System.out.println(a);
		System.out.println(p);
		p.x=100;
		a = p.x;
		System.out.println(a);
		System.out.println(p.x);
		System.out.println(p.y);
		
	}
}
