package Day_0903;

class Test{
	private static Test instance = null;
	private int count = 0;
	static Test getInstance() {
		if(instance == null) {
			instance = new Test();
			return instance;
		}
		return instance;
	}
	void count() {
		count ++;
	}
	int getCount() {
		return count;
	}
}


public class Exam_17 {
	public static void main (String[] args) {
		Test t1 = Test.getInstance();
		t1.count();
		Test t2 = Test.getInstance();
		t2.count();
		Test t3 = Test.getInstance();
		t3.count();
		System.out.println(t1.getCount());
	}
}

