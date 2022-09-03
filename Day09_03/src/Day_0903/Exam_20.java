package Day_0903;

class Super{
	int x = 10;
		void test() {
		System.out.println("Super x = " + x);
	}
}
class SubA extends Super{
	int y = 200;
	void exam() {
		System.out.println("SubA x = " + x);
		System.out.println("SubA y = " + y);
	}
}


public class Exam_20 {
	public static void main (String[] args) {
		Super su = new Super();
		su.x=1000;
		su.test();
		System.out.println("----------------");
		SubA sa = new SubA();
		sa.x=2000;
		sa.y=2000;
		sa.test();
		sa.exam();
	}
}

