package Day_0903;
/*
 * 클래스 : 설계도 -> 구조체 --> 사용자 정의 자료형
 * 객체 : 기능(메소드)과 속성(변수)이 포함된
 * */
class Point{ //자료형
	int x; //멤버변수, 멤버필드 -> 인스턴스 변수 
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
		int a;//정수 변수 선언 직연변수
		a = 10;
		Point p;//Point 변수 선언
		p = new Point(); //객체 생성
		System.out.println(a);
		System.out.println(p);
		p.x=100;
		a = p.x;
		System.out.println(a);
		System.out.println(p.x);
		System.out.println(p.y);
		
	}
}
