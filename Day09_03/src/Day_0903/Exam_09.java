package Day_0903;
/*
 * 클래스 : 설계도 -> 구조체 --> 사용자 정의 자료형
 * 객체 : 기능(메소드)과 속성(변수)이 포함된
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

