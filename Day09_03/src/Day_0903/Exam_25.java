package Day_0903;

class BBAA{ //추상클래스 : 미완성 설계도
	int a;
	BBAA(int n){
		a=n;
	}
	void print() {
		System.out.println("a = " + a);
	}
}
class SubBBAA extends BBAA{
	SubBBAA(int n){
		super(n);
		super.print();
	}
}



public class Exam_25 {
	public static void main (String[] args) {
		SubBBAA bbaa = new SubBBAA(5);
	}
}

