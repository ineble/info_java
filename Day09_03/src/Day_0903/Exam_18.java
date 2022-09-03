package Day_0903;

class Exam{
	Exam(){}
	private int count = 0;
	void count() {
		count ++;
	}
	int getCount() {
		return count;
	}
}


public class Exam_18 {
	public static void main (String[] args) {
		Exam ex1= new Exam();
		ex1.count();
		Exam ex2= new Exam();
		ex2.count();
		Exam ex3= new Exam();
		ex3.count();
		System.out.println(ex3.getCount());
	}
}

