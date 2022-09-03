package Day_0903;
interface QQ{
	void test();
	int sum(int a, int b);
}

class QQA implements QQ{
	@Override
	public void test() {
		System.out.println("«„«„");
	}
	@Override
	public int sum(int a, int b) {
		return 0;
	}
}


public class Exam_29 {
	public static void main (String[] args) {
		QQA a = new QQA();
		QQ q = new QQA();
		
	}
}




